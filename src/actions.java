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
	
	boolean analyse() {
		
		
		return true;
	}
	
	static String getResult() {
		String d = driver.findElement(By.xpath(".//div[@class='score-container' and not(@class='score-addition')]")).getText();
		
		System.out.println(d);
		
//		String d1 = driver.findElement(By.xpath(".//div[@class='score-container']")).getText();
//		System.out.println(d1);
//		
//		String d2 = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]")).getText();
//		System.out.println(d2);
		
		return d;
	}
	
	static String getBest() {
		String d = driver.findElement(By.xpath(".//div[@class='best-container']")).getText();
		System.out.println("Best = "+ d);
		
		return d;
	}
	
	static boolean isNewRecord(){
		
		if (getResult().compareTo(getBest()) == 0)
			{	
				System.out.println("New record!");
				return true;
			}	
		else 
			{
			System.out.println("No new record");
			return false;
			}
	} 
	
	static void newGame() {
		WebElement btn =  driver.findElement(By.xpath(".//a[@class='restart-button']"));
		btn.click();
	} 
	
}
