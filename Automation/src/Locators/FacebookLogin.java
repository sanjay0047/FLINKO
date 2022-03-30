package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sanjay");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(" k");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mr.xyz@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
		driver.findElement(By.xpath("//body[@dir=\"ltr\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("mr.xyz@gmail.com");
		driver.findElement(By.xpath("//body[@dir=\"ltr\"]")).click();
		

	}

}
