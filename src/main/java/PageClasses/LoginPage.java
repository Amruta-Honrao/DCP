package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

		
		WebDriver driver;
		
		 public LoginPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
	private By UserName = By.xpath("//input[@id='username']");
	private By Password = By.xpath("//input[@id='password']");
	private By Login = By.xpath("//input[@name='login']");

	public void enterLoginDetails(String Uname, String Pwd)
	{
		driver.findElement(UserName).sendKeys(Uname);
		driver.findElement(Password).sendKeys(Pwd);
	}
	
	public void click()
	{
		driver.findElement(Login).click();
	}
	
}
	
