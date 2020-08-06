package automationTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VenosaVWHB {
	WebDriver driver;
	int msToSleep = 500;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//VWHB1 Get information about shipping	
	public void VWHB1() throws InterruptedException {
		//Visit page with shipping button
		Reporter.log("Go to page with shipping button https://venosacase.com/2576613437/checkouts/438d94d989e6435b74ad12eb5fa27662?_ga=2.92848733.1307027172.1595251373-1861095517.1590952377");
		driver.get("https://venosacase.com/2576613437/checkouts/438d94d989e6435b74ad12eb5fa27662?_ga=2.92848733.1307027172.1595251373-1861095517.1590952377");
		//Click shipping button
		Reporter.log("Check chipping button");
		driver.findElement(By.xpath("//header[@class='banner']//a[@class='logo logo--left']")).click();
		Thread.sleep(msToSleep);
		//Get the URL after shipping button is clicked
		String urlAfterClick = driver.getCurrentUrl();
		Thread.sleep(msToSleep);
		//We do not expect the shipping information to be on the home page
		Assert.assertNotEquals(urlAfterClick, "https://venosacase.com/");
		
	}
	
	@Test
	//VWHB2 Get informatiom about lifetime warranty
	
	public void VWHB2() throws InterruptedException {
		//Visit page with warranty button
		Reporter.log("Visit page with varranty button");
		driver.get("https://venosacase.com/2576613437/checkouts/438d94d989e6435b74ad12eb5fa27662?_ga=2.92848733.1307027172.1595251373-1861095517.1590952377");
		//Click warranty button
		Reporter.log("Check warranty button");
		driver.findElement(By.xpath("//header[@class='banner']//a[@class='logo logo--left']")).click();
		Thread.sleep(msToSleep);
		
		//Get the URL after warranty button is clicked
		String urlAfterClick = driver.getCurrentUrl();
		//We do not expect the warranty information to be on the home page
		Assert.assertNotEquals(urlAfterClick, "https://venosacase.com/");
	}
		@Test
		//VWHB3 Get information about no hassle return
		
		public void VWHB3() throws InterruptedException {
			//Visit page with return button
			Reporter.log("Go to page with return button");
			driver.get("https://venosacase.com/2576613437/checkouts/438d94d989e6435b74ad12eb5fa27662?_ga=2.92848733.1307027172.1595251373-1861095517.1590952377");
			//Click return button
			Reporter.log("Check return button");
			driver.findElement(By.xpath("//header[@class='banner']//a[@class='logo logo--left']")).click();
			Thread.sleep(msToSleep);
			
			//Get the URL after return button is clicked
			String urlAfterClick = driver.getCurrentUrl();
			//We do not expect the return information to be on the home page
			Assert.assertNotEquals(urlAfterClick, "https://venosacase.com/");
		}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
}
	
	
	
