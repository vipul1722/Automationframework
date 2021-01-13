package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span")
	WebElement loginbutton;
	
	
	public WebElement clickonusername()
	{
		return username;
	}

	
	
	public WebElement enterpassword()
	{
		return password;
	}


    public WebElement clickonlogin()
    {
    	return loginbutton;
    }

}

