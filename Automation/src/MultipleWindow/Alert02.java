package MultipleWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert02 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		Alert web = driver.switchTo().alert();
		web.accept();
		Thread.sleep(2000);
		Alert web1 = driver.switchTo().alert();
		web1.accept();

	}

}
