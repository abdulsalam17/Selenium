package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_DevicePolicies_Page {

	WebDriver wd;

	public Configure_DevicePolicies_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_policies")
	 private WebElement policies;

	

	public WebElement Clickpolicies()
	{
		return policies;
	}

	


}
