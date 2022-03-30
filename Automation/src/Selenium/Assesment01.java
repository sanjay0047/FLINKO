package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment01 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys(" k");
		driver.findElement(By.cssSelector("input#username")).sendKeys("Dozer$123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input.whsOnd")).sendKeys("Password@123");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

	}

}
