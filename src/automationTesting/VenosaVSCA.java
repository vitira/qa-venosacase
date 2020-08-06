 package automationTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VenosaVSCA {
	WebDriver driver;
	int msToSleep = 3000;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
     	
	public void VSCA1() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) From home page click on shopping cart button 
		//5) From popup menu click view cart
		Reporter.log("Go to product page");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Add product to cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']")).click();
		Thread.sleep(msToSleep);
//		driver.findElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]")).click();
//		Thread.sleep(msToSleep);
		
		// Go back to home page first
		Reporter.log("Go back to home page");
		driver.get("https://venosacase.com/");
		
		Actions action = new Actions(driver);
		
		// Find shopping cart icon web element
		WebElement shopIcon = driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']"));
		
		// Mouse over shopping cart icon to display the "View Cart" button
		action.moveToElement(shopIcon).perform();
		
		Thread.sleep(msToSleep);
		
		// Find "View Cart" button web element
    	WebElement viewCartButton = driver.findElement(By.xpath("//div[@class='cart-area']//a[@class='btn-button view-cart bordered uppercase']"));
    	Reporter.log("Click view cart button in pop up menu");
    	// Click on "View Cart" button
    	viewCartButton.click();
    	
		
		
		}
	@Test
 	
	public void VSCA2() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) From home page click on shopping cart button 
		//5) From popup menu click checkout
		Reporter.log("Go to product page");
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Add product");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']")).click();
		Thread.sleep(msToSleep);
		
		// Go back to homepage first
		Reporter.log("Check from home page checkout button on pop up menu");
		driver.get("https://venosacase.com/");
		
		Actions action1 = new Actions(driver);
		
		// Find shopping cart icon web element
		WebElement cart = driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']"));
	
		// Mouse over shopping cart icon to display the "Checkout" button
		action1.moveToElement(cart).perform();
		
		
		Thread.sleep(msToSleep);
		
		// Find "checkout" button web element
		WebElement checkBut = driver.findElement(By.xpath("//div[@class='cart-area']//a[@class='btn-button bordered uppercase checkout-cart']"));

    	// Click on "checkout" button
		Reporter.log("Click checkout button in pop up menu");
        checkBut.click();
    	
			
		}
@Test
 	
	public void VSCA3() throws InterruptedException {
		//1) From home page, click on "Cell phone case" tab (horizontal menu)  
		//2) Click on product "Venosa Galaxy Note 8 Wallet Magnetic Handmade Leather Case" 
		//3) Click add to cart 
		//4) From home page click on shopping cart button 
		//5) From pop up menu click remove item
		Reporter.log("Go to producte page"); 
		driver.get("https://venosacase.com/collections/wallet-case/products/magnet-wallet-12?variant=8622940127293");
		Thread.sleep(msToSleep);
		Reporter.log("Add product in cart");
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(msToSleep);
		driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']")).click();
		Thread.sleep(msToSleep);
		Reporter.log("Go back to home page");
		// Go back to home page first
		driver.get("https://venosacase.com/");
		
		Actions action2 = new Actions(driver);
		// Find shopping cart icon web element
		WebElement cart = driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-mini-cart']"));
	
		// Mouse over shopping cart icon to display the "Checkout" button
		action2.moveToElement(cart).perform();
		
		Thread.sleep(msToSleep);
		
		// Find "remove" button web element
		Reporter.log("Remove item from pop up menu");
		WebElement remove = driver.findElement(By.xpath("//div[@class='cart-area']//i[@class='icon-cancel']"));
		
		
    	// Click on "remove" button
        remove.click();
    	
			
		}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
}

