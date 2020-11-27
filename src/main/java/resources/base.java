package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop= new Properties();
		
		FileInputStream fis=new FileInputStream("E:\\Selcode\\DatamaticDemo\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");		
		if (browserName.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver; 
	}
	public void getScreenshotPath(String TestCaseName,WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
String destinationFile = System.getProperty("user.dir")+"\\reports\\"+TestCaseName+".Png";
FileUtils.copyFile(source,new File(destinationFile));

	}

}
