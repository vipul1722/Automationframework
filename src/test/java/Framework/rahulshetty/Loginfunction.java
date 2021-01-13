package Framework.rahulshetty;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login;
import resources.Base;

public class Loginfunction extends Base  {
	
	public WebDriver driver;

	private static Logger log=LogManager.getLogger(Homepage.class.getName());

	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializedriver();
		log.info("driver is initialized");
		
	}
	
	@Test(dataProvider="login")
	public void test(String username,String password) throws IOException
	{
		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		
	    Login obj = new Login(driver);
	    obj.clickonlogin().click();
	    log.info("click on login button");
		obj.clickonusername().sendKeys(username);
		log.info("entering username");
		obj.enterpassword().sendKeys(password);
		log.info("entering password");
		
	}
	
	@AfterTest
	public void close()
	{
	    driver.close();
		log.info("closing the ebrowser");


	}
	

	@DataProvider(name="login")
public Object[][] getdata()
{
	Object[][] data = new Object[2][2];
	
	data[0][0]="aggarwal";
	data[0][1]="vipul";
	
	data[1][0]="dhfkj";
	data[1][1]="sljdhsku";
	
	return data;
}


}
