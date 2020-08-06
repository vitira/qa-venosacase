package automationTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VenosaHCAT {
	WebDriver driver;
	int msToSleep = 500;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//HCAT1 "38MM APPLE WATCH BANDS" horizontal menu button returns corresponding product listing
	public void HCAT1() throws InterruptedException {
		//Visit home page
		Reporter.log("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Click on "38MM APPLE WATCH BANDS" tab (horizontal menu)
		Reporter.log("Click on \"38MM APPLE WATCH BANDS\" tab (horizontal menu)");
		driver.findElement(By.xpath("//div[contains(@class,'header-wrapper')]//li[1]//a[1]")).click();
		
		//Wait for product to show
		Thread.sleep(3000);
		
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Horizontal 38mm button do not display product");
	}
	
	@Test
	//HCAT2 "40MM APPLE WATCH BANDS" horizontal menu button returns corresponding product listing
	public void HCAT2() throws InterruptedException {
		//Visit home page
		Reporter.log("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		//Click on "40MM APPLE WATCH BANDS" tab (horizontal menu)
		Reporter.log("Click on \"40MM APPLE WATCH BANDS\" tab (horizontal menu)");
		driver.findElement(By.xpath("//div[contains(@class,'header-wrapper')]//li[2]//a[1]")).click();
		//Wait for product to show
		Thread.sleep(3000);
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Horizontal 40mm button do not display product");
	}
	@Test
	//HCAT3 "42MM APPLE WATCH BANDS" horizontal menu button returns corresponding product listing
	public void HCAT3() throws InterruptedException {
		//Visit home page
		Reporter.log("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		//Click on "42MM APPLE WATCH BANDS" tab (horizontal menu)
		Reporter.log("Click on \"42MM APPLE WATCH BANDS\" tab (horizontal menu)");
		driver.findElement(By.xpath("//div[contains(@class,'header-wrapper')]//li[3]//a[1]")).click();
		//Wait for product to show
		Thread.sleep(3000);
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Horizontal 42mm button do not display product");
	}
	@Test
	//HCAT4 "44MM APPLE WATCH BANDS" horizontal menu button returns corresponding product listing
	public void HCAT4() throws InterruptedException {
		//Visit home page
		Reporter.log("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		//Click on "44MM APPLE WATCH BANDS" tab (horizontal menu)
		Reporter.log("Click on \"44MM APPLE WATCH BANDS\" tab (horizontal menu)");
		driver.findElement(By.xpath("//div[contains(@class,'header-wrapper')]//li[4]//a[1]")).click();
		//Wait for product to show
		Thread.sleep(3000);
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Horizontal 44mm button do not display product");
	}
	@Test
	//HCAT5 "Cell Phone Cases" horizontal menu button returns corresponding product listing
	public void HCAT5() throws InterruptedException {
		//Visit home page
		Reporter.log("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		//Click on "Cell Phone Cases" tab (horizontal menu)
		Reporter.log("Click on Cell Phone Cases tab (horizontal menu)");
		driver.findElement(By.xpath("//div[contains(@class,'header-wrapper')]//li[5]//a[1]")).click();
		//Wait for product to show
		Thread.sleep(3000);
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Horizontal 40mm button do not display product");
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	/*
	 * This method will check that products are displayed in the main display area
	 * When there are no products displayed, the xpath below will not be valid
	 */
	public static boolean isProductDisplayed(WebDriver driver) throws InterruptedException {
		
		try {
			driver.findElement(By.xpath("//div[@id=\"collection-main\"]//div[@class=\"product-image-area\"]"));
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	

}
