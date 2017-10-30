package TestCases;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Configure_DeliveryGroup_Page;
import PageObjects.Configure_DevicePolicies_Page;
import PageObjects.Exchang_Policy_Page;

public class ConfigureTabRelatedTest extends HelperTest {


	Configure_DevicePolicies_Page devicepolicies;
	Configure_DeliveryGroup_Page  deliverygroup;
	Exchang_Policy_Page exchangePolicy;

	static WebElement tab;
	static WebElement element;
	static JavascriptExecutor executor;
	public static final String exchange_policy_name="AS iOS Exchange Policy"+data.pickedNumber;
		
	@Test (groups = { "PolicyTest" })	
	
	public void Add_Exchange_Policy() throws InterruptedException 
	{
		Thread.sleep(1000);
		System.out.println("****** Creating Exchange Policy ****");
		//	wait.until(ExpectedConditions.elementToBeClickable(By.id("nav_configure")));
		menubaritems.configureTab().click();
		//devicepolicies.Clickpolicies().click();
		Thread.sleep(500);  
		//Click Add
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.Clickadd()));
		executor.executeScript("arguments[0].click();", exchangePolicy.Clickadd());
	// Click Exchange
		Thread.sleep(250);
		executor.executeScript("arguments[0].click();", exchangePolicy.ClickExchange());
	// Name Policy
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.NamePolicy())).sendKeys(exchange_policy_name);
		Thread.sleep(700);
		//Uncheck all other platfroms [Used Xpath for this one only to avoid code redundancy]
		for (int i=4; i<12; i++)
		{
			driver.findElement(By.xpath(".//*[@id='mainBody']/div/section[1]/div/div["+i+"]/div/label/span")).click();
		}								
		
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.Button1())).click();
		// Active Sync account name
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.ActiveSync())).sendKeys("AS Exchange"+data.pickedNumber);
	
		//Activesync host
		exchangePolicy.Activesynchost().sendKeys("zdmtest.ebricks-inc.net");
		// Domain
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.domain())).sendKeys("ebricks-inc.net");
	
		// User
		wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.userName())).sendKeys(data.exchange_user);
		// Email Address 
		exchangePolicy.emailAddress().sendKeys(data.exchange_email_address);
		Thread.sleep(250);
		// Password
		exchangePolicy.password().sendKeys("123");
		exchangePolicy.Button2().click();
		exchangePolicy.Button3().click();
		exchangePolicy.NextButton1().click();
		exchangePolicy.Save().click();
		
		Thread.sleep(2000);
		tab=exchangePolicy.table();	
		if(searchTable(tab, exchange_policy_name)==true)
		{
			
			System.out.println("****** Search Result: Device Policy Exists ******  Policy Name ="+exchange_policy_name);
		}

		else 
		{
			System.out.println("****** Search Result: Device Policy not found ******");
			assertFalse(true);
		}

	}


	@Test (groups = { "DeletePolicy" })	
	public void Delete_Exchange_Policy() throws InterruptedException
	{
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", menubaritems.configureTab());

		System.out.println("****** Delete Policy Name ="+exchange_policy_name);
		Thread.sleep(2000);
		tab=exchangePolicy.table();	

		if(searchTable(tab, exchange_policy_name)==true)
		{
			System.out.println("****** Inside delete ******");
			// Dynamic Custom xpath for newly created policy
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@data-field='name']/descendant::span[text()='"+exchange_policy_name+"']")));
			element= driver.findElement(By.xpath("//td[@data-field='name']/descendant::span[text()='"+exchange_policy_name+"']"));
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.DeletePolicy())).click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(exchangePolicy.Deleteicon())).click();;
		}	

		else 
		{
			System.out.println("****** Search Result: Device Policy not found ******");
			assertFalse(true);
		}

	}

	@AfterMethod  (groups = { "PolicyTest","DeletePolicy"})	
	public void AfterMethod()
	{
		driver.navigate().refresh();
	}

	@BeforeMethod (groups = { "PolicyTest","DeletePolicy"})	
	public void beforemethod()
	{
		exchangePolicy=new Exchang_Policy_Page(driver);
		deliverygroup=new Configure_DeliveryGroup_Page(driver);
		executor = (JavascriptExecutor) driver;

	}

//	// Search Table/Policy method
//	public static boolean searchTable(WebElement tbl, String dataToSearch){
//
//		WebElement tbody=tbl.findElement(By.tagName("tbody"));
//		List<WebElement> trows=tbody.findElements(By.tagName("tr"));
//
//		String data=dataToSearch;
//		boolean result = false;
//
//		for(int i=0; i<trows.size(); i++)
//		{
//
//			WebElement we=trows.get(i);
//			List<WebElement> row_data=we.findElements(By.tagName("td"));
//
//			for(int j=1;j<row_data.size(); j++)
//			{
//
//				if(data.equals(row_data.get(j).getText()))
//				{
//					System.out.println(row_data.get(j));
//					result=true;
//					break;
//				}
//
//			}
//
//		}
//
//		return result;
//
//	}

}
