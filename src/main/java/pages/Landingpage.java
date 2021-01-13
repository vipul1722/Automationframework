package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {


	public WebDriver driver;
	
	
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a")
	WebElement contactbutton;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/h2")
	WebElement textforcourses;
	
	
	public WebElement contact()
	{
		return contactbutton;
	}

	
	
	public WebElement text()
	{
		return textforcourses;
	}



}
