package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Analyze_Dashboard_Page {

	WebDriver wd;

	public Analyze_Dashboard_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_dashboard")
	 private WebElement dashboard;

	 
	public WebElement dashboard()
	{
		return dashboard;
	}

	
}
