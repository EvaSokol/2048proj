import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Actions{

	static WebDriver Driver = Start.getDriver();
	
	static public void playGame() {
		do 
		{
			Actions.moveRandom();
		}
		while (Pobj.isNotGameOver());
	}
	
	static public void moveKeysOnce() {
		Actions.keyUp();
		Actions.keyDown();
		Actions.keyLeft();
		Actions.keyRight();
	}
		
	static void moveRandom() {
		int i = (int)(Math.random()*4);
				
		switch (i) {
			case 0: keyUp();
					break;
			case 1: keyDown();
					break;
			case 2: keyLeft();
					break;
			case 3: keyRight();
					break;
		}
	}
	
	static boolean isNewRecord(){
		
		int best = Pobj.getBest();
		int res = Pobj.getResult();
	
		System.out.println("res= " + res + " best= " + best);
		
		if (res >= best)
		{	
			System.out.println("New record!");
			getSS();
			return true;
		}	
		else 
			{
			System.out.println("No new record");
			return false;
			}

	} 
	
	static void newGame() {
		Pobj.newGameBtn().click();
	} 

	static void keyUp() {
		Pobj.newGameBtn().sendKeys(Keys.ARROW_UP);
	}
	
	static void keyDown() {
		Pobj.newGameBtn().sendKeys(Keys.ARROW_DOWN);
	}
	
	static void keyLeft() {
		Pobj.newGameBtn().sendKeys(Keys.ARROW_LEFT);
	}
	
	static void keyRight() {
		Pobj.newGameBtn().sendKeys(Keys.ARROW_RIGHT);
	}

	static void getSS() {
		
		
		File ssf = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(ssf, new File(Pobj.getBest()+".png"), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
