package page_objs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import vacu.hooks.Hooks;

public class CucumberProjectObjs  extends Hooks{
	public WebDriver driver;
	public Logger log = Logger.getLogger(CucumberProjectObjs.class.getName());

	public CucumberProjectObjs() {
		this.driver = Hooks.driver;
		
	}

	
	public void test() {

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Java Bangla Tutorial");

	}

	
	public void test1() {

		System.out.println("test1");

	}
	
	
	public void test3() {
		
		
		System.out.println("test3");

	}
	
	public void test4() {

		System.out.println("test4");

	}

	
}
