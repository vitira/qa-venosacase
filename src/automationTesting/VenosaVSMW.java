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

public class VenosaVSMW {
	WebDriver driver;
	int msToSleep =6000;

	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//VSMW1 Get information about Venosa from Instagram	
	public void VSMW1() throws InterruptedException {
		//1) From home page scroll down  
		driver.get("https://venosacase.com/");
		
		//2) Click on Instagram button
		driver.findElement(By.xpath("//div[@class='footer-top']//a[1]")).click();
		
		//Wait to allow time to open instagram page
		Thread.sleep(msToSleep);
		
		//Get the URL after Instagram button is clicked
		String Instagram = driver.getCurrentUrl();
		//We do not expect the shipping information to be on the home page
		Assert.assertEquals(Instagram, "https://www.instagram.com/venosacase/");
	
	}
	@Test
	//VSMW2 Get information about Venosa from Facebook	
	public void VSMW2() throws InterruptedException {
		//1) From home page scroll down
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Facebook button
		Reporter.log("Check Facebook button");
		driver.findElement(By.xpath("//div[@class='footer-top']//a[2]")).click();
		
		//Wait to allow time to open Facebook page
		Thread.sleep(msToSleep);
		
		//Get the URL after Facebook button is clicked
		String Facebook = driver.getCurrentUrl();
		//We do not expect the shipping information to be on the home page
		Assert.assertEquals(Facebook, "https://www.facebook.com/venosacase/");
	
	}
	@Test
	//VSMW3 Get information about Venosa from Twitter	
	public void VSMW3() throws InterruptedException {
		//1) From home page scroll down
		Reporter.log("Go to home page and scrol down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Twitter button
		Reporter.log("Check Twitter button");
		driver.findElement(By.xpath("//div[@class='footer-top']//a[3]")).click();
		
		//Wait to allow time to open Twitter page
		Thread.sleep(msToSleep);
		
		//Get the URL after Twitter button is clicked
		String Twitter = driver.getCurrentUrl();
		//We do not expect the shipping information to be on the home page
		Assert.assertEquals(Twitter, "https://www.Twitter.com/venosacase/");
	
	}
	@Test
	//VSMW4 Get information about Venosa from Linked in	
	public void VSMW4() throws InterruptedException {
		//1) From home page scroll down
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Linked in button
		Reporter.log("Check Linked in button");
		driver.findElement(By.xpath("//div[@class='footer-top']//a[4]")).click();
		
		//Wait to allow time to open Linked in page
		Thread.sleep(msToSleep);
		
		//Get the URL after Linked in button is clicked
		String Linkedin = driver.getCurrentUrl();
		//We do not expect the shipping information to be on the home page
		Assert.assertTrue(Linkedin.contains("https://www.linkedin.com"), "Website is not linkedin site");
	}
	
	@Test
	//VSMW5 Get information about Venosa from You Tube
	public void VSMW5() throws InterruptedException {
		//1) From home page scroll down 
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on You Tube button
		Reporter.log("Check You Tube button");
		driver.findElement(By.xpath("//div[@class='footer-top']//a[5]")).click();
		
		//Wait to allow time to open You Tube page
		Thread.sleep(msToSleep);
		
		//Get the URL after You Tube button is clicked
		String YouTube = driver.getCurrentUrl();
		//We do not expect the shipping information to be on the home page
		Assert.assertEquals(YouTube, "https://www.youtube.com/channel/UCrnTYlkFrSoONw-noA8t-tw?view_as=subscriber");
	
	}
	@AfterClass
	public void close() {
		driver.close();
	}
}
	
	
	
