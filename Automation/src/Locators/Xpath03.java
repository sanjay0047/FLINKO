package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath03 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href=\"/apparel-shoes\"])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
	}

}
