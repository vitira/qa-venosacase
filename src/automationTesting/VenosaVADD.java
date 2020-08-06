 package automationTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

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

public class VenosaVADD {
	WebDriver driver;
	int msToSleep = 5000;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}
	

	@Test
     	
	public void VADD1() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Add to cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		boolean case1 = driver.findElement(By.xpath("//div[@class='product-name top-product-detail']")).getText().contains("Galaxy Note 8");
		Reporter.log("Add product in a shopping cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		
		
		Thread.sleep(msToSleep);
		
		boolean case2 = driver.findElement(By.xpath("//h5[@class='product-name']")).getText().contains("Galaxy Note 8");
		
		Reporter.log("Check product in a shopping cart");
		Assert.assertEquals(case1, case2);


		}
	@Test
 	
	public void VADD2() throws InterruptedException {
		driver = new ChromeDriver();
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case"
		//3) Click add to compare button
		//4) Click add to wish list button 
		//5) Click add to cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Reporter.log("Click on compare button");
		Thread.sleep(msToSleep);
		
		WebElement file = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/form[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]"));
		file.click();
		Thread.sleep(msToSleep);
		WebElement file1 = driver.findElement(By.xpath(""));
		
		file1.click();
		Reporter.log("Add product in a shopping cart");
		Thread.sleep(msToSleep);
		driver.get("https://venosacase.com/cart");
		Reporter.log("Check product in a shopping cart");
		try {
			boolean case2 = driver.findElement(By.xpath("//h5[@class='product-name']")).getText().contains("Galaxy Note 8");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} 
		
		}
	@Test
 	
	public void VADD3() throws InterruptedException {
		driver = new ChromeDriver();
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to wishlist button 
		//4) Click add to cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Click on wish list button");
		driver.findElement(By.xpath("//a[@class='link-wishlist']")).click();
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[@id='wishlistTableList']//i[@class='icon-cart']")).click();
		Thread.sleep(msToSleep);
		Reporter.log("Check product in a shopping cart");
		driver.get("https://venosacase.com/cart");

		try {
			boolean case2 = driver.findElement(By.xpath("//h5[@class='product-name']")).getText().contains("Galaxy Note 8");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} 
		
		}
	@Test
 	
	public void VADD4() throws InterruptedException {
		driver = new ChromeDriver();
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click  wishlist button 
		//4) Increase from header(window coming up during scroling)
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Click on wish list button");
		driver.findElement(By.xpath("//a[@class='link-wishlist']")).click();
		Thread.sleep(msToSleep);
		Reporter.log("Check increase from header");
		driver.findElement(By.xpath("//div[@id='wishlistTableList']//i[@class='icon-up-dir']")).click();
		Thread.sleep(msToSleep);
		
		try {
			boolean case2 = driver.findElement(By.xpath("//div[@id='wishlistTableList']//td[@class='a-center product-qty shoppingcart-qty']//input[@name='quantity']")).getText().contains("2");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} 
		


		}
		
		
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}

	

