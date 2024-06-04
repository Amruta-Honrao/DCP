package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	DriverManage DriverManageObj; ;
	 WebDriver driver;
	
@Before(order =0)	
public void driver()
{
	DriverManageObj = new DriverManage();
	driver =DriverManageObj.initDriver("Chrome");
	driver.get("https://demowebshop.tricentis.com/");
	
	
}


@After
public void tearDown()
{
	if (driver !=null)
	{
		driver.quit();
		DriverManage.Thdriver.remove();
	}
}
}
