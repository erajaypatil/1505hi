package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {


	@FindBy(xpath="//input[@id='Email']")private WebElement username;
	@FindBy(xpath="//input[@id='Password']")private WebElement password;
	@FindBy(linkText="Log in")private WebElement loginbutton;

	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}

	public void enterEmail()
	{
		username.sendKeys("ajayrokade001@gmail.com");
	}

	public void enterPassword()
	{
		password.sendKeys("ajay");
	}

	public void loginbutton()
	{
		loginbutton.click();
	}




}
