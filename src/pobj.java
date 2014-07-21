import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pobj {

	static WebDriver Driver = Start.getDriver();
	
	static WebElement newGameBtn() {
		return Driver.findElement(By.xpath(".//a[@class='restart-button']"));
		} 
	
	static int getResult() {
	
		WebElement we = Driver.findElement(By.xpath(".//div[@class='score-container']"));
		String res = we.getText();
				
		if (res.indexOf("+")!=-1)
			{
				res = res.substring(0, res.indexOf("+")-1);
			}
						
		return Integer.parseInt(res);
	}
	
	static int getBest() {
		String best = Driver.findElement(By.xpath(".//div[@class='best-container']")).getText();
	
		return Integer.parseInt(best);
	}

	static Boolean isNotGameOver() {
		if (Driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/p")).isDisplayed() )
			return false;
		else return true;
	} 
}
