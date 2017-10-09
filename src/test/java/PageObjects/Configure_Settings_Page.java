package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_Settings_Page {

	WebDriver wd;

	public Configure_Settings_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	//notificationserver
	@FindBy(xpath=".//*[@id='advancedSettingsSec']/div[2]/ul[1]/li[2]/button")
	private WebElement notificationserver;

	//smtp
	@FindBy(xpath=".//*[@id='settingMainCtr']/div/section[1]/div/div/a/span")
	private WebElement smtp;

	//addsmtp
	@FindBy(id="addSmtp")
	private WebElement addsmtp;

	//serverName
	@FindBy(id="serverName")
	private WebElement serverName;

	@FindBy(id="smtpHost")
	private WebElement smtpHost;

	//button1
	@FindBy(xpath=".//*[@id='addNsForm']/div[6]/div/label")
	private WebElement button1;


	@FindBy(id="smtpUsername")
	private WebElement smtpUsername;

	@FindBy(id="smtpPassword")
	private WebElement smtpPassword;

	@FindBy(id="smtpFromName")
	private WebElement smtpFromName;

	@FindBy(id="smtpFromEmail")
	private WebElement smtpFromEmail;


	@FindBy(id="saveNsBtn")
	private WebElement saveNsBtn;

	//log settings
	
	@FindBy(id="SF_logsettings")
	private WebElement logsettings;
	
	
	//LogLevelDiv
	@FindBy(xpath=".//*[@id='LogLevelDiv']/h4/a/label/span")
	private WebElement LogLevelDiv;
	
	@FindBy(xpath=".//*[@id='LogLevelList']/table/thead/tr/th[1]/label/span")
	private WebElement LogLevelList;
	
	@FindBy(xpath=".//*[@id='ChangeGlobalLogLevelBtn']/div")
	private WebElement ChangeGlobalLogLevelBtn;
	

	
	@FindBy(xpath="	.//*[@id='classDetails']/div[3]/div/div/button")
	private WebElement buttonlog;
	
	@FindBy(xpath=".//*[@id='classDetails']/div[3]/div/div/ul/li[5]/a")
	private WebElement logdivider;
	
	
	@FindBy(id="btn-setloglevel")
	private WebElement btnsetloglevel;
	
	//table policy
		@FindBy(tagName="table")
		private WebElement table;

		public WebElement table()
		{
			return table;
		}
	
	
	public WebElement notificationserver()
	{
		return notificationserver;
	}

	public WebElement smtp()
	{
		return smtp;
	}
	public WebElement addsmtp()
	{
		return addsmtp;
	}
	public WebElement serverName()
	{
		return serverName;
	}
	public WebElement smtpHost()
	{
		return smtpHost;
	}
	public WebElement button1()
	{
		return button1;
	}

	public WebElement smtpUsername()
	{
		return smtpUsername;
	}

	public WebElement smtpPassword()
	{
		return smtpPassword;
	}

	public WebElement smtpFromName()
	{
		return smtpFromName;
	}

	public WebElement saveNsBtn()
	{
		return saveNsBtn;
	}

	public WebElement smtpFromEmail()
	{
		return smtpFromEmail;
	}
	
	public WebElement logsettings()
	{
		return logsettings;
	}
	
	public WebElement LogLevelDiv()
	{
		return LogLevelDiv;
	}
	
	public WebElement LogLevelList()
	{
		return LogLevelList;
	}
	
	public WebElement ChangeGlobalLogLevelBtn()
	{
		return ChangeGlobalLogLevelBtn;
	}
	
	public WebElement buttonlog()
	{
		return buttonlog;
	}
	public WebElement logdivider()
	{
		return logdivider;
	}
	
	public WebElement btnsetloglevel()
	{
		return btnsetloglevel;
	}
}
