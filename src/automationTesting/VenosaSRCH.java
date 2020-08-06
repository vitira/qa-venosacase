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

public class VenosaSRCH {
	WebDriver driver;
	int msToSleep = 500;

	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}
	@Test
	//SRCH-1 Search value supports blank value
	//1) Clear search value.
	//2) Click on search "button"
	public void SRCH1() throws InterruptedException {
		//Visit home pag
		Reporter.log ("Visit home page https://venosacase.com/");

		driver.get("https://venosacase.com/");
		
		//Get the URL of the current page
		String urlBeforeSearch = driver.getCurrentUrl();
		
		//This finds the search bar input text box
		Reporter.log ("Enter empty value in search bar");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("");
		//This finds search button (magnifying glass)
		Reporter.log ("Clock on search bar");
		driver.findElement(By.xpath("//button[@class='searchsubmit']")).click();
		//Get the URL after search button is clicked
		String urlAfterSearch = driver.getCurrentUrl();
		assertEquals(urlAfterSearch, urlBeforeSearch);
	}
	
	@Test
	//SRCH-2 Search category dropdown list is populated
	public void SRCH2() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		try {
			//Search "select category" drop down element
			Reporter.log("Search select category drop down element");
			WebElement dropdown = driver.findElement(By.xpath("//div[@class='search-by-category input-dropdown']/div/a[@data-val='all']"));
			Select select = new Select(dropdown);
		} catch (Exception e) {
			assertTrue(false, "Search category is not a dropdown list");
		}
		//This case needs to be fixed when dropdown list is fixed in website
		
	}
	
	@Test
	//SRCH3 Search result with input search term "Band"
	public void SRCH3() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Search web element
		Reporter.log("Search Band");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("Band");
		//Wait to make sure the search term has time to return product list
		Thread.sleep(msToSleep);
		//Call method isProductFound to see if products are listed in the search dropdown list
		assertTrue(isProductFound(driver), "Search do not return product");
	}
	
	@Test
	//SRCH4 Search result with input search term "44"
	public void SRCH4() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Search web element
		Reporter.log("Search 44");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("44");
		//Wait to make sure the search term has time to return product list
		Thread.sleep(msToSleep);
		//Call method isProductFound to see if products are listed in the search dropdown list
		assertTrue(isProductFound(driver), "Search do not return product");
	}
	
	@Test
	//SRCH5 Search result with input search term "42"
	public void SRCH5() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Search web element
		Reporter.log("Search 42");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("42");
		//Wait to make sure the search term has time to return product list
		Thread.sleep(msToSleep);
		//Call method isProductFound to see if products are listed in the search dropdown list
		assertTrue(isProductFound(driver), "Search do not return product");

	}
	
	@Test
	//SRCH6 Search result with input search term "40"
	public void SRCH6() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Search web element
		Reporter.log("Search 40");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("40");
		//Wait to make sure the search term has time to return product list
		Thread.sleep(msToSleep);
		//Call method isProductFound to see if products are listed in the search dropdown list
		assertTrue(isProductFound(driver), "Search do not return product");
	}
	
	@Test
	//SRCH7 Search result with input search term "38"
	public void SRCH7() throws InterruptedException {
		//Start in homepage
		Reporter.log ("Visit home page https://venosacase.com/");
		driver.get("https://venosacase.com/");
		
		//Search web element
		Reporter.log("Search 38");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).sendKeys("38");
		//Wait to make sure the search term has time to return product list
		Thread.sleep(msToSleep);
		//Call method isProductFound to see if products are listed in the search dropdown list
		assertTrue(isProductFound(driver), "Search do not return product");
	}

	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	/*
	 * This method will check for the search bar dropdown web element for products to be listed
	 * When there are no products, the dropdown list will show <div class="suggestion-title no-found-msg">
	 */
	public static boolean isProductFound(WebDriver driver) throws InterruptedException {
		
		try {
			driver.findElement(By.xpath("//div[@class=\"suggestion-title no-found-msg\"]"));
			return false;
		} catch (Exception e) {
			return true;
		}
		
	}
	
	
	
	

}
