package automationTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

//import org.testng.Reporter;
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

//import jdk.javadoc.doclet.Reporter;

public class VenosaVPR {
	WebDriver driver;
	int msToSleep = 0;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}

	@Test
	//VPR1 "Price listed for Apple Watch Bands Slim Fit Hand made Genuine Leather Mulberry Purple  should be the same as price given"
	public void VPR1() throws InterruptedException {
		//try {
		
		    //Visit product page
		    Reporter.log("Visit product listing page https://venosacase.com/collections/42-mm-apple-watch-bands");
			driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");
		
			//Variable for getText product price
			
			String price1 = driver.findElement(By.xpath("(//span[@class='money'])[2]")).getText();	
			
			//Visit second product page
			Reporter.log("Visit product page for 'Apple Watch Bands Slim Fit Hand made Genuine Leather Mulberry Purple'");
			Reporter.log("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple_watch_band_purple?variant=8858816479293");
			driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple_watch_band_purple?variant=8858816479293");
			
			//Wait for product to show
			Thread.sleep(msToSleep);
			
			//Second variable for compare price and getText product price
			Reporter.log("Compare product price. This steps repeat for all 31 watches tested");
			String price2 = driver.findElement(By.xpath("(//span[@class='money'])[2]")).getText();
			Assert.assertEquals(price1, price2);

	}
	@Test
	//VPR2 "Price listed for Apple Watch Bands Slim Fit Hand made Genuine Leather Strap Nude Pink  should be the same as price given"
	public void VPR2() throws InterruptedException {

	    //Visit product page
	    Reporter.log("Visit product listing page https://venosacase.com/collections/42-mm-apple-watch-bands");
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");
		
		//Variable for getText product price
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[4]")).getText();
		
		//Visit second product page
		Reporter.log("Visit product page for 'Apple Watch Bands Slim Fit Hand made Genuine Leather Strap Nude Pink'");
		Reporter.log("https://venosacase.com/collections/42-mm-apple-watch-bands/products/38mm-apple-watch-band?variant=8858578059325");
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/38mm-apple-watch-band?variant=8858578059325");
		
		//Wait for product to show
		Thread.sleep(msToSleep);
		//Second variable for compare price and getText product price
		String price2 = driver.findElement(By.xpath("(//span[@class='money'])[2]")).getText();
		Assert.assertEquals(price1, price2);
	}
	
	@Test
	//VPR3 "Price listed for Apple Watch Bands Slim Fit Hand made Genuine Leather Shiny Brown  should be the same as price given"
	public void VPR3() throws InterruptedException {
		
		//Visit product page
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");
		
		//Variable for getText product price
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[6]")).getText();	
		
		//Visit second product page
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-band-42mm-38mm?variant=8865837842493");
		
		//Wait for product to show
		Thread.sleep(msToSleep);
		
		//Second variable for compare price and getText product price
		String price2 = driver.findElement(By.xpath("(//span[@class='money'])[2]")).getText();
		Assert.assertEquals(price1, price2);
	}
	
	@Test
	//VPR4 "Price listed for Apple Watch Leather Bands Cuff Hand made Genuine Leather Strap Nude  should be the same as price given"
	public void VPR4() throws InterruptedException {
		//Visit product page
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		//Variable for getText product price
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[8]")).getText();	
		//Visit second product page
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-2-bands-nude");
		
		Thread.sleep(msToSleep);
		
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR5 "Price listed for Apple Watch Leather Bands Cuff Hand made Genuine Leather Strap Light Brown  should be the same as price given"
	public void VPR5() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[10]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-women-38mm?variant=8858628227133");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR6 "Price listed for Apple Watch Leather Bands Cuff Handmade Genuine Leather Strap Brown  should be the same as price given"
	public void VPR6() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[12]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-leather-band");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR7 "Price listed for Apple Watch Leather Bands Classic Hand made Genuine Leather Strap Black  should be the same as price given"
	public void VPR7() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[14]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-black-1?variant=8858775027773");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR8 "Price listed for Apple Watch Bands Double Tour Hand made Genuine Leather Brown  should be the same as price given"
	public void VPR8() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[16]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-double-tour-brown?variant=8858480181309");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR9 "Price listed for Apple Watch Bands Double Tour Hand made Genuine Leather Brown  should be the same as price given"
	public void VPR9() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[18]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-bands-double-tour?variant=8858566230077");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR10 "Price listed for Apple Watch Leather Band Classic Hand made Genuine Leather Strap Blue  should be the same as price given"
	public void VPR10() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[20]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-blue?variant=8858771554365");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR11 "Price listed for Apple Watch Bands Double Tour Hermes Hand made Genuine Leather Nude Pink  should be the same as price given"
	public void VPR11() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[22]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-strap-38mm?variant=8858560692285");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR12 "Price listed for Apple Watch Bands Double Tour Hand made Genuine Leather Shiny Brown  should be the same as price given"
	public void VPR12() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[24]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-band-double-tour-leather-handmade?variant=8858550730813");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR13 "Price listed for Leather Apple Watch Band Classic Hand made Genuine Leather Strap Dark Brown Color  should be the same as price given"
	public void VPR13() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[26]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-5?variant=8622939045949");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR14 "Price listed for Apple Watch Leather Bands Classic Hand made Genuine Leather Shiny Brown  should be the same as price given"
	public void VPR14() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[28]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-1?variant=8858819330109");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR15 "Price listed for Apple Watch Leather Band Classic Hand made Genuine Leather Strap Light Brown  should be the same as price given"
	public void VPR15() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[30]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-44mm?variant=8622939111485");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR16 "Price listed for Apple Watch Leather Bands Cuff Hand made Genuine Leather Strap Purple  should be the same as price given"
	public void VPR16() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[32]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-15?variant=8622939471933");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR17 "Price listed for Apple Watch Band Leather Classic Hand made Genuine Leather Strap Nude  should be the same as price given"
	public void VPR17() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[34]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-nude?variant=8622939177021");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR18 "Price listed for Apple Watch Bands Leather Classic Hand made Genuine Leather Strap Red  should be the same as price given"
	public void VPR18() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[36]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-2?variant=8622939013181");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR19 "Price listed for Apple Watch Leather Band Cuff Hand made Genuine Leather Strap Black  should be the same as price given"
	public void VPR19() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[38]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-leather-band-cuff-handmade-genuine-leather-strap-black?variant=12733591453757");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR20 "Price listed for Apple Watch Bands Leather Classic Hand made Genuine Leather Strap Sea Green  should be the same as price given"
	public void VPR20() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[40]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-bands-leather-classic-handmade-genuine-leather-strap-sea-green?variant=29435193720893");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR21 "Price listed for Apple Watch Bands Leather Classic Hand made Genuine Leather Strap Croco Green  should be the same as price given"
	public void VPR21() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[42]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-bands-leather-classic-handmade-genuine-leather-strap-croco-green?variant=29439765741629");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR22 "Price listed for Leather Apple Watch Band Camouflage Hand made Genuine Leather Strap Leopard  should be the same as price given"
	public void VPR22() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[44]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-band-leather-camouflage-handmade-genuine-leather-strap-leopard?variant=31080043708556");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR23 "Price listed for  Leather Apple Watch Leather Band Light Brown  should be the same as price given"
	public void VPR23() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[46]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-leather-band-light-brown?variant=31219282509964");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR24 "Price listed for Leather Apple Watch Band Cuff Hand made Genuine Leather Strap Shiny Brown  should be the same as price given"
	public void VPR24() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[48]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-leather-bands-cuff-handmade-genuine-leather-strap-shiny-brown");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR25 "Price listed for Leather Apple Watch Band Classic Hand made Mulberry Purple  should be the same as price given"
	public void VPR25() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[50]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/apple-watch-bands-classic-handmade-genuine-leather-mulberry-purple?variant=31251554533516");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR26 "Price listed for Leather Apple Watch Band Classic Hand made Genuine Strap Croco Red  should be the same as price given"
	public void VPR26() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[52]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-classic-handmade-genuine-strap-croco-red?variant=31251556040844");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR27 "Price listed for Leather Apple Watch Band Classic Hand made Genuine Strap Croco Brown  should be the same as price given"
	public void VPR27() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[54]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-classic-handmade-genuine-strap-croco-brown?variant=31251556925580");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR28 "Price listed for Leather Apple Watch Band Classic Hand made Genuine Strap Croco Gray  should be the same as price given"
	public void VPR28() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[56]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-classic-handmade-genuine-strap-croco-grey?variant=31251557548172");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR29 "Price listed for Leather Apple Watch Band Classic Hand made Holo Dark Brown  should be the same as price given"
	public void VPR29() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[58]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-classic-handmade-holo-dark-brown?variant=31251584385164");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR30 "Price listed for Leather Apple Watch Band Classic Hand made Holo Shiny Brown  should be the same as price given"
	public void VPR30() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[60]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/leather-apple-watch-band-classic-handmade-holo-shiny-brown?variant=31251588776076");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	//VPR31 "Price listed for Leather Leather Apple Watch Classic Light Brown Band  should be the same as price given"
	public void VPR31() throws InterruptedException {
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands");		
		String price1 = driver.findElement(By.xpath("(//span[@class='money'])[60]")).getText();	
		
		driver.get("https://venosacase.com/collections/42-mm-apple-watch-bands/products/light-brown-leather-apple-watch-leather-band?variant=32072384741516");
		Thread.sleep(msToSleep);
		String price2 = driver.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
		Assert.assertEquals(price1, price2);
	}
	@Test
	// VPR(32-41)This test case verifies the price listed for each product in the product grid matches the price listed in the individual product page
	public void VPR_all_PhoneCase() throws Exception {
		
		String startpage = "https://venosacase.com/collections/wallet-case";
		
		Reporter.log("Visit URL " + startpage);
		
		// Visit wallet case page from horizontal bar
		driver.get(startpage);
		
		//Get all a tags for products listed on page
		List<WebElement> products = driver.findElements(By.xpath("//ul[@id='products-grid']//h2[@class='product-name']//a"));
		
		//Get all prices listed on page
		List<WebElement> prices = driver.findElements(By.xpath("//ul[@id='products-grid']//div[@class='price']"));
		
		Reporter.log("Detected a total of " + products.size() + " products listed");
		
		//Loop through every product on page
		for (int i = 0; i < products.size(); i++) {
			
			//Get the url of the product
			String url = products.get(i).getAttribute("href");
			
			//Get the listed price of the product (can contain 2 prices when product is on sale)
			String fullprice = prices.get(i).getText();
			
			//Get the final price, i.e. original price if product not on sale, sale price if the product is on sale
			String price1 = fullprice.substring( fullprice.lastIndexOf("$") );
			
			Reporter.log(i + ") Inspected product: " + products.get(i).getText() + " (" + fullprice + ")");			
			
			//Define a new driver to visit every product page - to avoid a stale reference error
			WebDriver d = new ChromeDriver();
			
			//Open individual product page
			d.get(url);
			
			//Get price of product from individual product page
			String price2 = d.findElement(By.xpath("(//div[@class='price'])[1]")).getText();
			
			//Close browser window
			d.close();

			Reporter.log("   Price detected on product page: " + price2);			

			Assert.assertEquals(price2, price1);
		}
	
	}
	

	
	@AfterClass
	public void close() {
		driver.close();
	}
}
	
	
	
	
		


