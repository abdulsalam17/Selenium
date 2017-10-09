package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import PageObjects.LoginPage;
import PageObjects.MenuBarItems;

public class HelperTest {

	static WebDriver driver;
	static WebDriverWait wait;
	static MenuBarItems menubaritems;

	@BeforeSuite  (groups = {"PolicyTest", "DGTest", "NotificationServerTest", "AppTest", "LogsTest","DeletePolicy"})	
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.4.0\\chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 10);
		driver.get(data.server_url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		login("administrator", "password");
		menubaritems=new MenuBarItems(driver);

	}



	public void login(String S1, String S2)
	{
		LoginPage lp=new LoginPage(driver);
		lp.username().sendKeys(S1);
		lp.password().sendKeys(S2);
		lp.submitbutton().click();
				
	}

	// Search Table/Policy method
	public static boolean searchTable(WebElement tbl, String dataToSearch){

		WebElement tbody=tbl.findElement(By.tagName("tbody"));
		List<WebElement> trows=tbody.findElements(By.tagName("tr"));

		String data=dataToSearch;
		boolean result = false;

		for(int i=0; i<trows.size(); i++)
		{

			WebElement we=trows.get(i);
			List<WebElement> row_data=we.findElements(By.tagName("td"));

			for(int j=1;j<row_data.size(); j++)
			{

				if(data.equals(row_data.get(j).getText()))
				{
					System.out.println(row_data.get(j));
					result=true;
					break;
				}

			}

		}

		return result;

	}

	

	@AfterSuite
	public void afterSuite() {
	}

}
