package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog02 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dropdown1=new Select(date);
		dropdown1.selectByIndex(6);
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dropdown2=new Select(month);
		dropdown2.selectByIndex(8);
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dropdown3=new Select(year);
		dropdown3.selectByIndex(24);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
