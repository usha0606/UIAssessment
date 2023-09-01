package com.uiassessment.UIAssessment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase extends Properties{
	
	public static WebDriver driver = null;

	@BeforeSuite
	public void driverInitialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationURL);
	}
	
    @AfterSuite
    public void closeallWebpages() {
    	//driver.quit();
    }
	
	

}
