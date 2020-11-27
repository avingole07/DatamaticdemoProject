package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Logintestcase extends base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest()
	public void initialize() throws IOException
	{
		driver=initializeDriver();
        log.info("Driver is initialise");
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
	}
	@Test()
	
	public void LoginPage() {
		pageObjects.LoginPage lp = new pageObjects.LoginPage(driver);
		log.info("Open login window");
		lp.getSignin().click();
		lp.getUserName().sendKeys("avi.fort@gmail.com");
		lp.getPassword().sendKeys("Test@123");
		lp.getLogin().click();
		log.info("Login Successful with member credentials");
		Assert.assertEquals(driver.getTitle(),"Members");

		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
}
}