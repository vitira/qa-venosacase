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

public class VenosaVCAT {
	WebDriver driver;
	int msToSleep = 1000;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//VCAT1 "38MM APPLE WATCH BANDS" vertical menu button returns corresponding product listing
	public void VCAT1() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "38MM APPLE WATCH BANDS" tab (vertical menu)
		Reporter.log("Click on 38MM APPLE WATCH BANDS tab (vertical menu)");
		driver.findElement(By.xpath("//a[contains(text(),'38mm Apple Watch Bands')]")).click();
		//Wait for product to show				
		Thread.sleep(msToSleep);
		//Check if products are displayed
		assertTrue(isProductDisplayed(driver), "Verticalal 38mm button do not display product");
	}
	
	@Test
	//VCAT2 "40MM APPLE WATCH BANDS" horizontal menu button returns corresponding product listing
	public void VCAT2() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "40MM APPLE WATCH BANDS" tab (vertical menu)
		Reporter.log("Click on 40MM APPLE WATCH BANDS tab (vertical menu)");		
		driver.findElement(By.xpath("//div[@class='col-md-3 sidebar col-left f-left']//li[2]//a[1]")).click();
		//Wait				
		Thread.sleep(msToSleep);
		//Display product
		assertTrue(isProductDisplayed(driver), "Verticalal 40mm button do not display product");
	}
	@Test
	//VCAT3 "42MM APPLE WATCH BANDS" Vertical menu button returns corresponding product listing
	public void VCAT3() throws InterruptedException {
		//Visit product page
	    Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "42MM APPLE WATCH BANDS" tab (vertical menu)
		Reporter.log("Click on 42MM APPLE WATCH BANDS tab (vertical menu)");		
		driver.findElement(By.xpath("//a[contains(text(),'42mm Apple Watch Bands')]")).click();
						
		Thread.sleep(msToSleep);
		
		assertTrue(isProductDisplayed(driver), "Verticalal 42mm button do not display product");
	}
	@Test
	//VCAT4 "44MM APPLE WATCH BANDS" Vertical menu button returns corresponding product listing
	public void VCAT4() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "44MM APPLE WATCH BANDS" tab (vertical menu)
		Reporter.log("Click on 44MM APPLE WATCH BANDS tab (vertical menu)");		
		driver.findElement(By.xpath("//a[contains(text(),'44mm Apple Watch Bands')]")).click();
		
		Thread.sleep(msToSleep);
		
		assertTrue(isProductDisplayed(driver), "Verticalal 44mm button do not display product");
	}
	
	@Test
	//VCAT5 "iPhone 6/6S cases" Vertical menu button returns corresponding product listing
	public void VCAT5() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "iPhone 6/6S cases" tab (vertical menu)
		Reporter.log("Click on iPhone 6/6S cases tab (vertical menu)");		
		driver.findElement(By.xpath("//div[contains(@class,'col-md-3 sidebar col-left f-left')]//li[5]//a[1]")).click();
		
		Thread.sleep(msToSleep);
		
		assertTrue(isProductDisplayed(driver), "Verticalal iPhone 6/6S cases button do not display product");
	}
	@Test
	//VCAT6 "iPhone 6/6S Plus cases" Vertical menu button returns corresponding product listing
	public void VCAT6() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "iPhone 6/6S Plus cases" tab (vertical menu)
		Reporter.log("Click on iPhone 6/6S Plus cases tab (vertical menu)");			
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
		
		Thread.sleep(3000);
		
		assertTrue(isProductDisplayed(driver), "Verticalal iPhone 6/6S Plus cases button do not display product");
	}
	@Test
	//VCAT7 "iPhone 7/8  cases" Vertical menu button returns corresponding product listing
	public void VCAT7() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "iPhone 7/8 cases" tab (vertical menu)
		Reporter.log("Click on iPhone 7/8 cases tab (vertical menu)");			
		driver.findElement(By.xpath("//div[contains(@class,'col-md-3 sidebar col-left f-left')]//li[7]//a[1]")).click();
		
		Thread.sleep(3000);
		
		assertTrue(isProductDisplayed(driver), "Verticalal iPhone 7/8 cases button do not display product");
	}
	@Test
	//VCAT8 "iPhone 7/8 Plus  cases" Vertical menu button returns corresponding product listing
	public void VCAT8() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "iPhone 7/8 Plus cases" tab (vertical menu)
		Reporter.log("Click on iPhone 7/8 Plus cases tab (vertical menu)");		
		driver.findElement(By.xpath("//li[7]//a[1]")).click();
		
		Thread.sleep(3000);
		
		assertTrue(isProductDisplayed(driver), "Verticalal iPhone 7/8 Plus cases button do not display product");
	}
	@Test
	//VCAT9 "iPhone X  cases" Vertical menu button returns corresponding product listing
	public void VCAT9() throws InterruptedException {
		//Visit product page
		Reporter.log("Visit product page https://venosacase.com/collections/classic-apple-watch-leather-band/");
		driver.get("https://venosacase.com/collections/classic-apple-watch-leather-band/");
		//Click on "iPhone X cases" tab (vertical menu)
		Reporter.log("Click on iPhone X cases tab (vertical menu)");			
		driver.findElement(By.xpath("//a[contains(text(),'iPhone X Cases')]")).click();
		
		Thread.sleep(3000);
		
		assertTrue(isProductDisplayed(driver), "Verticalal iPhone X cases button do not display product");
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
