package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(" k");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("san.sanjay.k@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
