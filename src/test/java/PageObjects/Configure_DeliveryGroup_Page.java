package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_DeliveryGroup_Page {

	WebDriver wd;

	public Configure_DeliveryGroup_Page(WebDriver constructore_driver) {
		// TODO Auto-generated constructor stub
		this.wd=constructore_driver;
		PageFactory.initElements(wd, this);

	}


	//clickdeliveryGroups
	@FindBy(xpath=".//*[@id='nav_deliveryGroups']/a")
	private WebElement clickdeliveryGroups;


	//Click Add
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/p")
	private WebElement clickadd;


	// Name DG

	@FindBy(xpath=".//*[@id='roleName']")
	private WebElement NameDG;


	//Button1
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement Button1;

	//Button2
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement Button2;

	//Search

	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[1]/form/div/div[1]/span/input")
	private WebElement Search;

	//ClickSearch
	@FindBy(xpath="	.//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[1]/form/div/div[2]/button")
	private WebElement ClickSearch;

	//Clicknext
	@FindBy(xpath="	.//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[2]/a")
	private WebElement Clicknext;


	//Source
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[2]/ul/li")
	private WebElement Source;

	//dest

	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[3]/div")
	private WebElement dest;

	//Next2

	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[2]")
	private WebElement Next2;	

	//save button

	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement save;


	//table policy
	@FindBy(tagName="table")
	private WebElement table;

	public WebElement table()
	{
		return table;
	}


	@FindBy(id="roleIncludedGrpsSearch")
	private WebElement domainid;


	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div[1]/div/div[2]/form/div[2]/div[2]/button")
	private WebElement domainsearch;


	@FindBy(xpath=".//*[@id='roleIxcludedGrpList']/li[1]/label/span")
	private WebElement domaincheckbox;



	public WebElement clickdeliveryGroups() {
		// TODO Auto-generated method stub
		return clickdeliveryGroups;
	}


	public WebElement clickadd() {
		// TODO Auto-generated method stub
		return clickadd;
	}

	public WebElement NameDG() {
		// TODO Auto-generated method stub
		return NameDG;
	}

	public WebElement Button1() {
		// TODO Auto-generated method stub
		return Button1;
	}
	public WebElement Button2() {
		// TODO Auto-generated method stub
		return Button2;
	}
	public WebElement Search() {
		// TODO Auto-generated method stub
		return Search;
	}

	public WebElement ClickSearch() {
		// TODO Auto-generated method stub
		return ClickSearch;
	}
	public WebElement Clicknext() {
		// TODO Auto-generated method stub
		return Clicknext;
	}

	public WebElement Source() {
		// TODO Auto-generated method stub
		return Source;
	}

	public WebElement dest() {
		// TODO Auto-generated method stub
		return dest;
	}

	public WebElement Next2() {
		// TODO Auto-generated method stub
		return Next2;
	}
	public WebElement save() {
		// TODO Auto-generated method stub
		return save;
	}

	public WebElement domainid() {
		// TODO Auto-generated method stub
		return domainid;
	}

	public WebElement domainsearch() {
		// TODO Auto-generated method stub

		return domainsearch;
	}
	public WebElement domaincheckbox() {
		// TODO Auto-generated method stub
		return domaincheckbox;
	}
}
