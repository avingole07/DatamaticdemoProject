package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Hometestcase extends base {
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
  public void LandingPage() {
	  pageObjects.LandingPage LaP = new pageObjects.LandingPage(driver);
	  log.info("Landing on HomePage");
	  //enter City and verify for weather
	  LaP.SearchCityWeather().sendKeys("Delhi");
	  LaP.getCityWeather().click();
	  
	  
	  
	  //Enter day and verify for 
	  LaP.SearchCityWeather().clear();
	  LaP.SearchCityWeather().sendKeys("Sunday");
	  LaP.getCityWeather().click();
	  
	  
  }
  
}
