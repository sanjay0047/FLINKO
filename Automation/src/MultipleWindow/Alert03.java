package MultipleWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert03 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
		Thread.sleep(2000);
		
		Alert web = driver.switchTo().alert();
		web.dismiss();
		
	}

}
