package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector02 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-male")).click();
		driver.findElement(By.cssSelector("input.text-box")).sendKeys("abc");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("defg");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("san.sanjay.k@gmail.com");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input#register-button")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");

	}

}
