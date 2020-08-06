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

public class VenosaVSHO {
	WebDriver driver;
	int msToSleep = 0;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}
	
	
	@Test
	//VSHO-1 "Sold out product should not have active add to cart button"
	public void VSHO() throws InterruptedException {
		 //Visit product page
		 Reporter.log("Visit product page https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-2-bands-nude");
		 driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-2-bands-nude");
		 //Make variable for current page
		 String view1 = driver.getCurrentUrl();
		 //Click on "Sold Out" button
		 Reporter.log("Click on Sold Out button to make sure product not have add to cart");
	     driver.findElement(By.xpath("//button[@class='btn-cart add-to-cart']")).click();
	     //Make variable current page
	     String view2 = driver.getCurrentUrl();
	     //Compare URL
	     Assert.assertEquals(view1, view2);

	}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}

	

