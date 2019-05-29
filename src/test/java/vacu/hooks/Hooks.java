package vacu.hooks;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

	public static WebDriver driver=null;
	public static ChromeOptions chromeOptions= new ChromeOptions();
	public static Logger log = Logger.getLogger(Hooks.class.getName());
//	public static ChromeDriver obj;

	

	public static void lanuch() throws Exception {
		chromeOptions.addArguments("-start-maximized");
		chromeOptions.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//lib//chrome74.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nezam\\eclipse-workspace\\CucumberProject\\lib\\chromedriver.exe");
		Hooks.driver = new ChromeDriver(chromeOptions);
		driver.get(config.URL);

//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addExtensions(new File(System.getProperty("\\lib\\Xpath-Finder_v1.6.0.exe")));
//		driver=new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(6000);
		
		log.info("Browser loaded Successfully");

	}

	
	public void endTest() throws Exception {

		log.info("browser successfully closed");
		driver.close();
		log.info("driver is quiting");
		driver.quit();
	}

}
