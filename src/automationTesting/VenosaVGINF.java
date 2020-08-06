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

public class VenosaVGINF {
	WebDriver driver;
	int msToSleep =3000;
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/vitaliididkivskyi/Jar/chromedriver v84");
		
		driver = new ChromeDriver();
	}
	
	@Test
	//VGINF1 Get information Contact Us	
	public void VGINF1() throws InterruptedException {
		//1) From home page scroll down 
		Reporter.log("Go to home page and scroll down");
		
		driver.get("https://venosacase.com/");
		
		//2) Click on About Us link
		Reporter.log("Check About Us information");
		
		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		
		//Wait to allow time to open About Us link
		Thread.sleep(3000);
		
		//Get the URL after About Us link button is clicked
		String About = driver.getCurrentUrl();
		Thread.sleep(msToSleep);
		//We do not expect the About Us information to be on the home page
		Assert.assertEquals(About, "https://venosacase.com/pages/about-us");
	
	}
	
	@Test
	//VGINF2 Get information Contact Us	
	public void VGINF2() throws InterruptedException {
		//1) From home page scroll down
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Contact Us link
		Reporter.log("Check Contact Us information");
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		//Wait to allow time to open Contact Us link
		Thread.sleep(msToSleep);
		
		//Get the URL after Contact Us link button is clicked
		String Contact = driver.getCurrentUrl();
		//We do not expect the Contact information to be on the home page
		Assert.assertEquals(Contact, "https://venosacase.com/pages/contact");
	
	}
	@Test
	//VGINF3 Get information about Venosa from Blog link	
	public void VGINF3() throws InterruptedException {
		//1) From home page scroll down 
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Blog link
		Reporter.log("Check Blog information");
		
		driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
		
		//Wait to allow time to open Blog link
		Thread.sleep(msToSleep);
		
		//Get the URL after Blog link is clicked
		String Blog = driver.getCurrentUrl();
		//We do not expect the Blog information to be on the home page
		Assert.assertEquals(Blog, "https://venosacase.com/blogs/leather-apple-watch-band-for-woman");
	
	}
	@Test
	//VGINF4 Get information about Venosa from Home page link	
	public void VGINF4() throws InterruptedException {
		//1) From home page scroll down 
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on Home page link
		Reporter.log("Check Home page informstion");
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
		//Wait to allow time to open Home page link
		Thread.sleep(msToSleep);
		
		//Get the URL after Home page link is clicked
		String Home = driver.getCurrentUrl();
		//We do expect the Home information to be on the home page
		Assert.assertEquals(Home, "https://venosacase.com/");
	
	}
	@Test
	//VGINF5 Get information about Venosa from Shop link	
	public void VGINF5() throws InterruptedException {
		//1) From home page scroll down
		Reporter.log("Go to home page");
		driver.get("https://venosacase.com/");
		
		//2) Click on Shop link
		Reporter.log("Check Shop information");
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		
		//Wait to allow time to open Shop link page
		Thread.sleep(msToSleep);
		
		//Get the URL after Shop link is clicked
		String Shop = driver.getCurrentUrl();
		Thread.sleep(msToSleep);
		//We do not expect the Shop information to be on the home page
		Assert.assertEquals(Shop,"https://venosacase.com/collections");
	}
	
	
	@Test
	//VGINF6 About Venosa chat 
	public void VGINF6() throws InterruptedException {
		//1) From home page scroll down 
		Reporter.log("Go to home page and scroll down");
		driver.get("https://venosacase.com/");
		
		//2) Click on chat button
	    Reporter.log("Check chat");
		List<WebElement>element=driver.findElements(By.xpath("//span[@class='icon-chat appear']"));
        if(element.size()>0) {
	    	element.get(0).click();
		
		
        }
	    		
	}
	@AfterClass
	public void close() {
		driver.close();
	}
}
	
	
	
