package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverManage {

	public static ThreadLocal<WebDriver> Thdriver = new ThreadLocal<WebDriver> ();
	
public static WebDriver initDriver(String Browser)
{
	if (Thdriver.get()==null)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			Thdriver.set(new ChromeDriver(options));
		}
		
		
	}
	return getDriver();
	
}

public static WebDriver getDriver()
{
	return Thdriver.get();
	
}



}
