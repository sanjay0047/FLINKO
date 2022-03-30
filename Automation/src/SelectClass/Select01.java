package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select01 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sanjay%20K/Downloads/dropDown%20(1).html");
		driver.manage().window().maximize();	
		WebElement manual=driver.findElement(By.xpath("//select[@id='s1']"));
		Select drop=new Select(manual);
		drop.selectByValue("1");	
		WebElement fruit1=driver.findElement(By.xpath("//select[@id='m1']"));
		Select drop01=new Select(fruit1);
		drop01.selectByValue("6");
		Thread.sleep(2000);
		drop01.selectByIndex(2);
		Thread.sleep(2000);
		drop01.selectByVisibleText("Orange");
		Thread.sleep(2000);
		drop01.deselectByValue("4");
		Thread.sleep(2000);
		drop01.deselectByIndex(2);
		Thread.sleep(2000);
		drop01.deselectByVisibleText("Jackfruit");	
	}
} 
