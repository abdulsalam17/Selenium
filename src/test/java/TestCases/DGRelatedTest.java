package TestCases;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Configure_DeliveryGroup_Page;

public class DGRelatedTest extends HelperTest {


	Configure_DeliveryGroup_Page  deliverygroup;
	static JavascriptExecutor executor;
	String dgname="AS DG Automated"+data.pickedNumber;
	WebElement tab;
	static WebElement element;
	
	@Test (groups = { "DGTest" }) 	
	public void createDG() throws InterruptedException
	{
		System.out.println("****** Creating DG ******"+dgname);
		executor.executeScript("arguments[0].click();", menubaritems.configureTab());
		Thread.sleep(1500);
		deliverygroup.clickdeliveryGroups().click();
		executor.executeScript("arguments[0].click();",deliverygroup.clickdeliveryGroups() );

		// Click Add
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", deliverygroup.clickadd());
		//	Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@id='main']/section[1]/div/a[1]/p")).click();
		deliverygroup.NameDG().sendKeys(dgname);
		deliverygroup.Button1().click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(deliverygroup.domainid())).sendKeys("domain users");
		wait.until(ExpectedConditions.elementToBeClickable(deliverygroup.domainsearch())).click();
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(deliverygroup.domaincheckbox())).click();
		Thread.sleep(250);
		deliverygroup.Button2().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(deliverygroup.Search())).sendKeys(ConfigureTabRelatedTest.exchange_policy_name);
		//Click search
		deliverygroup.Search().click();

		Thread.sleep(500);
		deliverygroup.Clicknext().click();;

		Actions obj=new Actions(driver);
		obj.dragAndDrop(deliverygroup.Source(), deliverygroup.dest()).build().perform();	

		for(int i=0;i<6; i++)
		{
			deliverygroup.Next2().click();
			if(i==5)
			{
				Thread.sleep(750);
				deliverygroup.save().click();
			}
		}
		
		Thread.sleep(1500);
		tab=deliverygroup.table();	
		if(searchTable(tab, dgname)==true)
		{
			System.out.println("****** DG Found Successfully ******");
		}	

		else 
		{
			System.out.println("****** Search Result: DG not found ******");
			assertFalse(true);
		}

				
	}	
	
	@AfterMethod  (groups = { "DGTest"})	
	public void AfterMethod()
	{
		driver.navigate().refresh();
	}

	@BeforeMethod (groups = {"DGTest"})	
	public void beforemethod()
	{
		deliverygroup=new Configure_DeliveryGroup_Page(driver);
		executor = (JavascriptExecutor) driver;

	}
	
	
//	// Search Table/Policy method
//	public boolean searchTable(WebElement tbl, String dataToSearch){
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
//			for(int j=0;j<row_data.size(); j++)
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
