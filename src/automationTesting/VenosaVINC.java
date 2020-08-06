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

public class VenosaVINC {
	WebDriver driver;
	int msToSleep = 3000;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}
	

	@Test
     	
	public void VINC1() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Increase number(+) 
		//4)Press enter/return from keyboard or Add to cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log ("Increase number product");
		driver.findElement(By.xpath("//div[@class='input-box']//i[@class='icon-up-dir']")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Add to cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.get("https://venosacase.com/cart");

		try {
			boolean case2 = driver.findElement(By.xpath("//input[@id='updates_8622940127293']")).getText().contains("2");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} finally {
			
		}
		


		}
	@Test
 	
	public void VINC2() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Decrease number(-) 
		//4)Press enter/return from keyboard or Add to cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[@class='input-box']//i[@class='icon-up-dir']")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Decrease number product");
		driver.findElement(By.xpath("//div[@class='input-box']//i[@class='icon-down-dir']")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Add to cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.get("https://venosacase.com/cart");

		try {
			boolean case2 = driver.findElement(By.xpath("//input[@id='updates_8622940127293']")).getText().contains("1");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} finally {
			
		}
	}
	@Test
 	
	public void VINC3() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) Increase number(+)
		//5)Press Update Shopping Cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Increase number product");
		driver.findElement(By.xpath("//div[contains(text(),'+')]")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Update Shopping Cart");
		driver.findElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]")).click();
		Thread.sleep(msToSleep);
		
		driver.get("https://venosacase.com/cart");

		try {
			boolean case2 = driver.findElement(By.xpath("//input[@id='updates_8622940127293']")).getText().contains("2");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} finally {
			
		}
		


		}
	@Test
 	
	public void VINC4() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) Decrease number(-)
		//5)Press Update Shopping Cart
		Reporter.log ("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log ("Add to Cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[contains(text(),'+')]")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Decrease number product");
		driver.findElement(By.xpath("//div[contains(text(),'-')]")).click();
		Thread.sleep(msToSleep);
		Reporter.log ("Update Shopping Cart");
		driver.findElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]")).click();
		Thread.sleep(msToSleep);
		
		driver.get("https://venosacase.com/cart");

		try {
			boolean case2 = driver.findElement(By.xpath("//input[@id='updates_8622940127293']")).getText().contains("1");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} finally {
			
		}
		


		}
	@Test
 	
	public void VINC5() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) Delete product
		
		Reporter.log("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Add product");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		Reporter.log("Delete product from the cart");
		driver.findElement(By.xpath("//a[@class='remove-item']//i[@class='icon-cancel']")).click();
		Thread.sleep(msToSleep);
		driver.get("https://venosacase.com/cart");
		Reporter.log("Check is product deleted");

		try {
			boolean case2 = driver.findElement(By.xpath("//p[contains(text(),'Your cart is currently empty.')]")).getText().contains("Your cart is currently empty.");
		}catch (Exception e) { 
			Assert.assertTrue(false, "product not found");
		} finally {
			
		}
		


		}
	@Test
	
		public void VINC6() throws InterruptedException {
			//1) From home page, click on "Cell phone case" tab (horizontal menu)  
			//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
			//3) Click add to cart 
			//4) Click continue to shoping
			
			Reporter.log("Go to product page https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");  
			driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
			Thread.sleep(msToSleep);
			Reporter.log("Add prodeuct");
			driver.findElement(By.xpath("//button[@name='add']")).click();
			Thread.sleep(msToSleep);
			Reporter.log("Click continue to shipping");
			driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]")).click();
			Thread.sleep(msToSleep);
			
			
			
				String url = driver.getCurrentUrl();
				Assert.assertEquals(url, "https://venosacase.com/");
			
		}
	
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}


	

