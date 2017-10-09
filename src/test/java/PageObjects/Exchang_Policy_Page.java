package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exchang_Policy_Page {


	WebDriver wd;

	public Exchang_Policy_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	//Click Add
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/p")
	private WebElement Clickadd;


	// Click Exchange
	@FindBy(xpath=".//*[@id='advancedPolicyDiv']/div[1]/ul/li/ul/li[1]/p")
	private WebElement ClickExchange;


	// Name Policy
	@FindBy(name="name")			
	private WebElement NamePolicy;


	//Checkboxes
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Checkboxes;



	//Button1 
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement Button1;


	// ActiveSync account name

	@FindBy(name="activeSyncAccountName")
	private WebElement ActiveSync;



	//Activesynchost
	@FindBy(name="host")
	private WebElement Activesynchost;

	// Domain
	@FindBy(name="domain")
	private WebElement Domain;

	// User
	@FindBy(name="userName")
	private WebElement userName;

	// Email Address 
	@FindBy(name="emailAddress")
	private WebElement emailAddress;

	// Password
	@FindBy(name="password")
	private WebElement password;

	//Button2
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div[1]/div/form/div[9]/div/div[1]/div/button")
	private WebElement Button2;


	//Button3
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div[1]/div/form/div[9]/div/div[1]/div/ul/li[4]/a")
	private WebElement Button3;


	//table policy
	@FindBy(tagName="table")
	private WebElement table;

	public WebElement table()
	{
		return table;
	}

	//NextButton1
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement NextButton1;

	public WebElement NextButton1()
	{
		return NextButton1;
	}

	//Save
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement Save;

	//DeletePolicy
	@FindBy(xpath=".//*[@id='main']/section[2]/div[2]/div/div/div[2]/div/a[3]/span	")
	private WebElement DeletePolicy;
	
	
	//Deleteicon
	
	@FindBy(id="btn-delete")
	private WebElement deleteicon;
	
	public WebElement Save()
	{
		return Save;
	}
	////////
	public WebElement Clickadd()
	{
		return Clickadd;
	}


	public WebElement ClickExchange()
	{
		return ClickExchange;
	}

	public WebElement NamePolicy()
	{
		return NamePolicy;
	}

	public WebElement Checkboxes()
	{
		return Checkboxes;
	}

	public WebElement Button1()
	{
		return Button1;
	}

	public WebElement ActiveSync()
	{
		return ActiveSync;
	}

	public WebElement Activesynchost()
	{
		return Activesynchost;
	}

	public WebElement domain()
	{
		return Domain;
	}

	public WebElement userName()
	{
		return userName;
	}


	public WebElement emailAddress()
	{
		return emailAddress;
	}

	public WebElement password()
	{
		return password;
	}

	public WebElement Button2()
	{
		return Button2;
	}

	public WebElement Button3()
	{
		return Button3;
	}
	
	public WebElement DeletePolicy()
	{
		return DeletePolicy;
	}
	
	public WebElement Deleteicon()
	{
		return deleteicon;
	}
}



