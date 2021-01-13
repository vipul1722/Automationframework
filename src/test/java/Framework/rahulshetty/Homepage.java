package Framework.rahulshetty;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Landingpage;
import pages.Login;
import resources.Base;

public class Homepage extends Base {
	

	public WebDriver driver;
	
	private static Logger log=LogManager.getLogger(Homepage.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializedriver();
		log.info("driver is initialized");
	}

	@Test
	public void test() throws IOException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	    Landingpage obj = new Landingpage(driver);
	   
	    Assert.assertTrue(obj.contact().isDisplayed());      //validating contact button is showing on home page or not
	    log.info("verifying button is available or not");
	    Assert.assertEquals(obj.text().getText(), "FEATURED COURSES");     //validating btext is showing or not on home page
		
	}
	
@AfterTest
public void close()
{
    driver.close();

}
}
