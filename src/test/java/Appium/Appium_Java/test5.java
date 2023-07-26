package Appium.Appium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test5 {

	@Test(groups="Regression")
	public void test5()
	{
		System.out.println("print test 5");
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.udemy.com");
		driver.manage().window().maximize();
	}
}
