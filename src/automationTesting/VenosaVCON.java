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

public class VenosaVCON {
	WebDriver driver;
	int msToSleep = 0;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//VCON-1 Verify the number of size options in the product page should match product description
	public void VCON1() throws InterruptedException {
		
		// Check product "Apple Watch Bands Slim Fit Handmade Genuine Leather Mulberry Purple"
		
		Reporter.log("Check product description for \"Apple Watch Bands Slim Fit Handmade Genuine Leather Mulberry Purple\"");

		// Step 1: Visit product page
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-band-42mm-38mm?variant=8865837842493");
		
		Reporter.log("Visited URL https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-band-42mm-38mm?variant=8865837842493");
		
		// Step 2: Find web element for the Size dropdown menu
		WebElement sizeDropdown = driver.findElement(By.xpath("//select[@id='product-selectors-option-0']"));
		
		// Step 3: Convert dropdown web element to Select object
		Select sizeSelect = new Select(sizeDropdown);
		
		// Step 4: Get all options from size drop down
		List<WebElement> sizeItemsList = sizeSelect.getOptions();
		
		Reporter.log("The following size options are detected:");
		
		// Print all options on console
		for (WebElement sizeOption : sizeItemsList) {
			Reporter.log(sizeOption.getText());
		}
		
		// Print the number of options available from drop down list
		int numOptions = sizeItemsList.size();

		// Step 5: Get the text of the description
		String desc = driver.findElement(By.xpath("//li[7]")).getText();
		
		Reporter.log("The description of the product says: " + desc);
		
		// Step 6: (Dumb way of checking) number of options = 4 and description is captured as below, then test case fail
		if (numOptions != 2 && desc.equals("Made Of Genuine High Quality Leather, Stainless Steel Connectors 38mm or 42mm, Super Easy To Install And Remove, Don't Worry About The Adapters Fall Apart")) {
			
			Assert.assertTrue(false, "Number of size options is not equals to 2 when description says 38mm or 42mm only");
		
		} else if (!desc.equals("Made Of Genuine High Quality Leather, Stainless Steel Connectors 38mm or 42mm, Super Easy To Install And Remove, Don't Worry About The Adapters Fall Apart")) {
			
			Assert.assertTrue(false, "Description of product was updated - please update test case");
			
		}
	}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}

	

