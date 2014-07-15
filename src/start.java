import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;


public class start {

	static String BaseUrl = "http://2048game.com/";
	static WebDriver driver = new FirefoxDriver();
	static Keyboard kbd = ((HasInputDevices)driver).getKeyboard();
	
	static {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	static void open() {
		
		driver.get(BaseUrl);
	}
	
	void open(String url) {
		driver.get(url);
	}
		
	static WebDriver getDriver() {
		return driver;
	}
	
	static void finish() {
		start.driver.quit();
	}
}
