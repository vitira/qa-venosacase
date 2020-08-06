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

public class VenosaSMAT {
	WebDriver driver;
	int msToSleep = 0;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	public void SMAT1() {
		
		Reporter.log("Visit Cell Phone Cases from horizontal menu - URL https://venosacase.com/collections/wallet-case");
		
		// Visit wallet case page from horizontal bar
		driver.get("https://venosacase.com/collections/wallet-case");
		
		//Get all a tags for products listed on page
		List<WebElement> products = driver.findElements(By.xpath("//ul[@id='products-grid']//h2[@class='product-name']//a"));
		
		Reporter.log("Detected a total of " + products.size() + " products listed");
		
		// Define a counter for iPhone 7/8 product
		int prodCount = 0;
		
		for (WebElement product:products) {
			if (product.getText().contains("iPhone 7, 8")) {
				System.out.println(product.getText());
				prodCount = prodCount+1;
			}
		}
		
		Reporter.log("There are " + prodCount + " products found containing 'iPhone 7, 8' in name");
		
		// Visit 'iPhone 7/8 Cases' link from vertical menu
		driver.get("https://venosacase.com/collections/iphone-8-7");
		
		Reporter.log("Detected a total of " + products.size() + " products listed");
		
		//Get tags for products listed on page
		int countProduct2=0;
		List<WebElement> products2 = driver.findElements(By.xpath("//ul[@id='products-grid']//h2[@class='product-name']//a"));
		for (WebElement product2:products2) {
			if(product2.getText().contains("iPhone 7, 8")) {
				System.out.println(product2.getText());
				countProduct2++;
			
			}
			
		}
		System.out.println(countProduct2);
		Assert.assertEquals(prodCount, countProduct2);
	}
	
	@Test
	public void SMAT2() {
		
		Reporter.log("Visit Cell Phone Cases from horizontal menu - URL https://venosacase.com/collections/wallet-case");
		//Visit gorizontal row product
		driver.get("https://venosacase.com/collections/wallet-case");
		
		//Capture all product from page
		List<WebElement> phone = driver.findElements(By.xpath("//div[@class='item-effect']//h2[@class='product-name']"));
		Reporter.log("Detected a total of " + phone.size() + " products listed");
        //for every prodact in products i need to get text of product name and find if product name contains "iPhone 7, 8 Plus" and increase count by one
	    int plus = 0;
	    for(WebElement phone1:phone) {
			if (phone1.getText().contains("iPhone 7, 8 Plus")) {
				System.out.println(phone1.getText());
				plus++;
			}
			
		}
	    Reporter.log("There are " + plus + " products found containing 'iPhone 7, 8 Plus' in name");
		
	//Visit vertical column;
	    driver.get("https://venosacase.com/collections/iphone-8-plus-7-plus");
	    
		
	//Capture all product from page//div[@class='item-effect']//h2[@class='product-name']
	    List<WebElement> phone2 = driver.findElements(By.xpath("//div[@class='item-effect']//h2[@class='product-name']"));
	    
	    Reporter.log("Detected a total of " + phone2.size() + " products listed");
	//for every product in products2 i need to get the text and find name that  contains "iPhone 7, 8" and increase canter
	int plus1 = 0; //= phone.size();
	
	
	for(WebElement phone3:phone2) {
		if(phone3.getText().contains("iPhone 8 Plus") ||phone3.getText().contains("iPhone 7 Plus") ) {
			System.out.println(phone3.getText());
			plus1++;
			System.out.println(plus1);
		}
	}
	Assert.assertEquals(plus1, plus);
		}
	
		
	
	
		    @Test
			public void SMAT3() {
				
				Reporter.log("Visit Cell Phone Cases from horizontal menu - URL https://venosacase.com/collections/wallet-case");
				
				// Visit wallet case page from horizontal bar
				driver.get("https://venosacase.com/collections/wallet-case");
				//Get all a tags for products listed on page
				List<WebElement> products = driver.findElements(By.xpath("//div[@class='item-effect']//div[@class='details-area']"));
				
				Reporter.log("Detected a total of " + products.size() + " products listed");
				
				// Define a counter for iPhone X product
				int count = 0;
				for (WebElement product:products) {
					if(product.getText().contains("iPhone X")||product.getText().contains("IPhone X")){
						System.out.println(product.getText());
						System.out.println(count);
						count++;
						
				

					}
				}
				System.out.println("_________________________________________");
				Reporter.log("There are " + count + " products found containing 'iPhone X' in name");
				
				// Visit 'iPhone X Cases' link from vertical menu
				driver.get("https://venosacase.com/collections/iphone-x");
				
				//Reporter.log("Detected a total of " + products2.size() + " products listed");
				//Get tags for products listed on page
				int prodCount = 0;
				List<WebElement>products2=driver.findElements(By.xpath("//div[@class='item-effect']//h2[@class='product-name']"));
				Reporter.log("Detected a total of " + products2.size() + " products listed");	
				for (WebElement product2:products2) {
							if (product2.getText().contains("iPhone X")||product2.getText().contains("IPhone X")) {
								//product2.getText().toLowerCase().contains("iphone x")
								System.out.println(product2.getText());
								System.out.println(prodCount);
								prodCount++;
							}
						}
				
					Assert.assertEquals(prodCount, count);
					}		
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}

	

