package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By Signin = By.xpath("//li[@class='user-sign-in']");
	By UserName = By.xpath("//input[@id='user_email']");
	By Password = By.xpath("//input[@id='user_password']");
	By Submit = By.xpath("//input[@name='commit']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getSignin()
	{
		return driver.findElement(Signin);
	}
	public WebElement getUserName()
	{
		return driver.findElement(UserName);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(Submit);
	}
}
