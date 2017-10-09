package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_Apps_Page {

	WebDriver wd;

	public Configure_Apps_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	@FindBy(xpath=".//*[@id='nav_apps']/a")
	private WebElement clickapps;

	//Click Add
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/p")
	private WebElement clickadd;

	//Select Enterprise
	@FindBy(id="appTypeEnterprise")
	private WebElement selectenterprise;

	//name
	@FindBy(name="name")
	private WebElement name;


	//button1
	@FindBy(xpath="	.//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement button1;

	// Upload Enterprise app
	@FindBy(id="mAppUpload")
	private WebElement Upload;	

	//Wait for description

	@FindBy(name="description")
	private WebElement description;	

	//Click Next

	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement clicknext;

	//save 
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement save;

	//table policy
			@FindBy(tagName="table")
			private WebElement table;

			public WebElement table()
			{
				return table;
			}

	public WebElement clickapps()
	{
		return clickapps;
	}

	public WebElement clickadd()
	{
		return clickadd;
	}
	public WebElement selectenterprise()
	{
		return selectenterprise;
	}

	public WebElement name()
	{
		return name;
	}

	public WebElement button1()
	{
		return button1;
	}

	public WebElement Upload()
	{
		return Upload;
	}
	public WebElement description()
	{
		return description;
	}

	public WebElement clicknext()
	{
		return clicknext;
	}

	public WebElement save()
	{
		return save;
	}

}
