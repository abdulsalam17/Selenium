package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Device_Page {

	WebDriver wd;

	public Manage_Device_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_devices")
	 private WebElement managedevices;

	 
	public WebElement managedevices()
	{
		return managedevices;
	}

	



}
