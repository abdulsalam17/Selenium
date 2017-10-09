package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver wd;

	public LoginPage(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy (id="name")
	private WebElement username;

	@FindBy (id="pass")
	private WebElement password;

	@FindBy (id="logonSubmitBtn")
	private WebElement submitbutton;
	

	public WebElement username()
	{
		return username;
	}

	public WebElement password()
	{
		return password;
	}

	public WebElement submitbutton()
	{
		return submitbutton;
	}




}
