package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Users_Page {

	WebDriver wd;

	public Manage_Users_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_users")
	 private WebElement users;

	

	public WebElement users()
	{
		return users;
	}

	


}
