package Sync;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sanjay%20K/Downloads/iframe.html");

		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Alert web = driver.switchTo().alert();
		web.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		
		
	}

}
