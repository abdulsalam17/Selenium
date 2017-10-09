package TestCases;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Configure_Settings_Page;
import PageObjects.Manage_Device_Page;

public class SettingsTabRelatedTest extends HelperTest {

	Manage_Device_Page managedeviceobj;
	Configure_Settings_Page configsettings;
	JavascriptExecutor executor;
	WebElement element;
	static WebElement tab;

	@Test (groups = {"NotificationServerTest" }) 
	public void AddSmtp() throws InterruptedException 
	{
		System.out.println("****** Adding SMTP ******");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(menubaritems.settingsTab()));
		menubaritems.settingsTab().click();
		executor.executeScript("arguments[0].click();", menubaritems.settingsTab());

		wait.until(ExpectedConditions.elementToBeClickable(configsettings.notificationserver())).click();

		// Click on SMTP 
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.smtp())).click();
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.addsmtp())).click();
		String smtpname=data.smtp_server_name+data.pickedNumber;
		configsettings.serverName().sendKeys(smtpname);
		configsettings.smtpHost().sendKeys(data.smtp_host);
		configsettings.button1().click();
		configsettings.smtpUsername().sendKeys(data.smtp_server_name);
		configsettings.smtpPassword().sendKeys(data.smtp_pass);
		configsettings.smtpFromName().sendKeys(data.smtp_user);
		configsettings.smtpFromEmail().sendKeys(data.smtp_user);
		// Click Save
		Thread.sleep(250);
		configsettings.saveNsBtn().click();
		
		Thread.sleep(1000);
		tab=configsettings.table();
		if(searchTable(tab, smtpname)==true)
		{
			System.out.println("****** SMTP added Successfully ******");
		}	

		else 
		{
			System.out.println("******SMTP not added ******");
			assertFalse(true);
		}

				
		// Second way for assertion
//		boolean actual=false;
//		boolean expected=true;
//		Thread.sleep(2000);
//		tab=configsettings.table();
//		actual= searchTable(tab, smtpname);
//		Assert.assertEquals(actual, expected, "SMTP not found");
		
}
	

	@Test (groups = {"LogsTest"}) 
	public void set_Debug_log() throws InterruptedException 
	{
		System.out.println("****** Setting Debug log level ******");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(menubaritems.supportTab()));
		menubaritems.supportTab().click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.logsettings()));
		Thread.sleep(2500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.logsettings())).click();

		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.LogLevelDiv()));
		executor.executeScript("arguments[0].click();", configsettings.LogLevelDiv());

		// Select all logs
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.LogLevelList()));
		executor.executeScript("arguments[0].click();", configsettings.LogLevelList());

		// Click Edit all
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.ChangeGlobalLogLevelBtn()));
		executor.executeScript("arguments[0].click();",configsettings.ChangeGlobalLogLevelBtn());
		
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(configsettings.buttonlog())).click();
		configsettings.logdivider().click();
		
		configsettings.btnsetloglevel().click();
		System.out.println("****** Debug log level Done ******");
		
			
}
		

	@AfterMethod (groups = { "NotificationServerTest", "LogsTest" }) 
	public void AfterMethod()
	{
		driver.navigate().refresh();
	}

	@BeforeMethod (groups = { "NotificationServerTest","LogsTest" }) 
	public void beforemethod()
	{
		configsettings=new Configure_Settings_Page(driver);		
		executor = (JavascriptExecutor) driver;

	}

}
