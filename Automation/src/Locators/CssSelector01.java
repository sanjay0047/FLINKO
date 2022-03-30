package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector01 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("input[name='Gender']")).click();
		driver.findElement(By.cssSelector("input[class='text-box single-line']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("defg");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("san.sanjay.k@gmail.com");
		driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");

	}

}
