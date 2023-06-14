package pkgpjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sauce {
FirefoxDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		
	}
@BeforeMethod
public void url()
{
	driver.get("https://www.saucedemo.com/ ");
	driver.manage().window().maximize();
}
@Test

public void test()
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-button\"]")));
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	WebElement sortlow = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
	Select sort=new Select(sortlow);
	sort.selectByIndex(2);
	
	//cart
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
			
	
			//cartloading
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
			
		
			//removing products below 15 dollar 
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
		
	
			//checkout
			driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Reshmi");
			driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("S R");
			driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("690530");
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
}
}
