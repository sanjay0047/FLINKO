package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog09 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(" k");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("#123,xyz,bangalore");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("karnataka");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560034");
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select dropdown=new Select(country);
		dropdown.selectByValue("FRANCE");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
