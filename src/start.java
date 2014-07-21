import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Start {

	static String BaseUrl = "http://2048game.com/";
	static WebDriver Driver = new FirefoxDriver();
		
	static {
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	static void open() {
		
		Driver.get(BaseUrl);
	}
	
	void open(String url) {
		Driver.get(url);
	}
		
	static WebDriver getDriver() {
		return Driver;
	}
	
	static void finish() {
		Start.Driver.quit();
	}
}
