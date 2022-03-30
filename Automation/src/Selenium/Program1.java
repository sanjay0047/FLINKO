package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.quit();
	}

}
