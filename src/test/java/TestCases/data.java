package TestCases;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public final class data {

	public static final String server_url="https://pxme.ebricks-inc.net:4443";
	
	public static final String user="administrator";
	public static final String password="password";
	
	
	
	static Random rand = new Random(); 
	static int pickedNumber=rand.nextInt(999)+100 ;
	
	// Exchange
	public static final String exchange_user="as";
	public static final String exchange_email_address=exchange_user +"@ebricks-inc.net";
	
	// SMTP server 
	public static final String smtp_server_name="SMTP";
	public static final String smtp_host="192.168.200.19";
	public static final String smtp_user="testuser@ebricks-inc.net";
	public static final String smtp_pass="1234";
	
	//Enterprise path
	public static final String enterprise_path="C:\\Users\\abdul.salam\\Desktop\\SkypeDownloaded\\Fonts 4.0.1 1.ipa";


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
}