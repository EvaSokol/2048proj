import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Element;


public class actions {

	static WebDriver driver = start.getDriver();
	
	static public void playGame() {
		do 
		{
			actions.moveRandom();
		}
		while (pobj.isNotGameOver());
	}
	
	static public void moveKeysOnce() {
		actions.keyUp();
		actions.keyDown();
		actions.keyLeft();
		actions.keyRight();
	}
		
	static void moveRandom() {
		int i = (int)(Math.random()*4);
		
		switch (i) {
			case 1: keyUp();
					break;
			case 2: keyDown();
					break;
			case 3: keyLeft();
					break;
			case 4: keyRight();
					break;
		}
	}
	
	static boolean isNewRecord(){
		
		int best = pobj.getBest();
		int res = pobj.getResult();
		
		System.out.println("res= " + res + " best= " + best);
		
		if (res >= best)
		{	
			System.out.println("New record!");
			return true;
		}	
		else 
			{
			System.out.println("No new record");
			return false;
			}
		
//		if (pobj.getResult().compareTo(pobj.getBest()) == 0)
//			{	
//				System.out.println("New record!");
//				return true;
//			}	
//		else 
//			{
//			System.out.println("No new record");
//			return false;
//			}
	} 
	
	static void newGame() {
		pobj.newGameBtn().click();
	} 

	static void keyUp() {
		start.kbd.pressKey(Keys.ARROW_UP);
	}
	
	static void keyDown() {
		start.kbd.pressKey(Keys.ARROW_DOWN);
	}
	
	static void keyLeft() {
		start.kbd.pressKey(Keys.ARROW_LEFT);
	}
	
	static void keyRight() {
		start.kbd.pressKey(Keys.ARROW_RIGHT);
	}

}
