package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarItems {

	WebDriver wd;

	public MenuBarItems(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(id="nav_analyze")
	 private WebElement analyzeTab;

	 @FindBy(id="nav_manage")
	 private WebElement manageTab;

	 @FindBy(xpath=".//*[@id='nav_configure']/a")
	 private WebElement configureTab;

	 @FindBy(xpath=".//*[@id='nav_settings']/a")
	 private WebElement settingsTab;
	 
	 @FindBy(xpath=".//*[@id='nav_support']/a")
	 private WebElement supportTab;
	 
	 @FindBy(xpath=".//*[@id='topNav']/div/div[2]/ul[2]/li[3]/a")
	 private WebElement username_icon;
	 
	 @FindBy(id="logOut")
	 private WebElement logOut;


	public WebElement analyzeTab()
	{
		return analyzeTab;
	}

	public WebElement manageTab()
	{
		return manageTab;
	}
	
	public WebElement configureTab()
	{
		return configureTab;
	}

	public WebElement settingsTab()
	{
		return settingsTab;
	}

	public WebElement supportTab()
	{
		return supportTab;
	}

	public WebElement username_icon()
	{
		return username_icon;
	}

	public WebElement logOut()
	{
		return logOut;
	}




}
