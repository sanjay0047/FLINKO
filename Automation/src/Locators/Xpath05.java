package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath05 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'/register')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys(" k");
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("san.sanjay.k@gmail.com");	
		driver.findElement(By.xpath("//input[contains(@name,'Password')]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
	}

}
