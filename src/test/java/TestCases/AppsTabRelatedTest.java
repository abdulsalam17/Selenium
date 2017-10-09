package TestCases;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Configure_Apps_Page;
import PageObjects.Manage_Device_Page;

public class AppsTabRelatedTest extends HelperTest {

	Manage_Device_Page managedeviceobj;
	Configure_Apps_Page configureapp;
	WebElement element;
	JavascriptExecutor executor;
	static WebElement tab;



	@Test  (groups = {"AppTest" }) 
	public void navigate_to_Apps() throws InterruptedException 
	{
		System.out.println("Enterprise App creation started");

		Thread.sleep(1500);
		executor.executeScript("arguments[0].click();", menubaritems.configureTab());
		wait.until(ExpectedConditions.elementToBeClickable(configureapp.clickapps()));

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();",configureapp.clickapps());

		// Click Add 						
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", configureapp.clickadd());
		// Select Enterprise app
		wait.until(ExpectedConditions.elementToBeClickable(configureapp.selectenterprise())).click();
		// Name app
		String appname="iOS Enterprise app"+data.pickedNumber;
		wait.until(ExpectedConditions.elementToBeClickable(configureapp.name())).sendKeys(appname);

		// Uncheck all other platforms. Using xpath to avoid code red 
		for (int i=4; i<10; i++)
		{
			driver.findElement(By.xpath(".//*[@id='mainBody']/div/section[1]/div/div["+i+"]/div/label/span")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(configureapp.button1())).click();

		// Upload Enterprise app
		configureapp.Upload().sendKeys(data.enterprise_path);
		wait.until(ExpectedConditions.elementToBeClickable(configureapp.description()));

		// Click next until save
		for (int i=0; i<2; i++)
		{
			executor.executeScript("arguments[0].click();", configureapp.clicknext());
			if(i==1)
			{
				executor.executeScript("arguments[0].click();", configureapp.save());		

			}
		}

				
		Thread.sleep(2000);
		tab=configureapp.table();
		if(searchTable(tab, appname)==true)
		{
			System.out.println("App Uploaded Successfully");
		}	

		else 
		{
			System.out.println("******App not added ******");
			assertFalse(true);
		}
		
	}


	@AfterMethod  (groups = {"AppTest" }) 
	public void AfterMethod()
	{
		driver.navigate().refresh();
	}

	@BeforeMethod  (groups = {"AppTest" }) 
	public void beforemethod()
	{
		configureapp=new Configure_Apps_Page(driver);		
		executor = (JavascriptExecutor) driver;

	}

}
