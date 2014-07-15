import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebElement;

import java.util.Date;  

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;

public class pobj {

	static WebDriver driver = start.getDriver();
	
	static WebElement newGameBtn() {
		return driver.findElement(By.xpath(".//a[@class='restart-button']"));
		} 
	
	static int getResult() {
	
		WebElement we = driver.findElement(By.xpath(".//div[@class='score-container']"));
		String d = we.getText();
				
		if (d.indexOf("+")!=-1)
			{
				d = d.substring(0, d.indexOf("+")-1);
			}
				
		int res = Integer.parseInt(d);
		
		return res;
	}
	
	static int getBest() {
		String d = driver.findElement(By.xpath(".//div[@class='best-container']")).getText();
	
		return Integer.parseInt(d);
	}

	static Boolean isNotGameOver() {
		if (driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/p")).isDisplayed() )
			return false;
		else return true;
	} 
}
