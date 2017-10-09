package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_EnrollmentInvitation_Page {

	WebDriver wd;

	public Manage_EnrollmentInvitation_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_enrollment")
	 private WebElement enrollment;

	

	public WebElement analyzeTab()
	{
		return enrollment;
	}

	



}
