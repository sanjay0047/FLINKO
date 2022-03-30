package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement01 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement 	job1=driver.findElement(By.xpath("//a[@class='main-nav-link']"));
		action.moveToElement(job1).build().perform();
		WebElement 	job2=driver.findElement(By.xpath("//a[text()='Jobs by Skills']"));
		action.moveToElement(job2).build().perform();
		
		WebElement java=driver.findElement(By.xpath("//a[@href='https://www.monsterindia.com/search/java-jobs']"));
		action.moveToElement(java).click().perform();

	}

}
