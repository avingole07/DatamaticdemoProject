package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By SearchCity= By.xpath("//input[@placeholder='Search city']");
	By Click =By.xpath("//button[@type='submit']");
	//By SelectList = By.xpath("//*[@id=\"weather-widget\"]/div[1]/div/div/div[2]/div[1]/div/ul/li");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement SearchCityWeather()
	{
		return driver.findElement(SearchCity);
	}
	public WebElement getCityWeather()
	{
		
		return driver.findElement(Click);
		
	}
/*	public WebElement getselectedCity()
	{
		List<WebElement> options =driver.findElements(By.cssSelector("//*[@id=\\\"weather-widget\\\"]/div[1]/div/div/div[2]/div[1]/div/ul/li"));

		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("Delhi, IN"))

		{

		option.click();

		break;
		}
		return driver.findElement(SelectList);
		
	}
		return null; */
}

