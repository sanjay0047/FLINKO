package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement 	women=driver.findElement(By.xpath("//a[text()='Women']"));
		action.moveToElement(women).build().perform();
		WebElement kurta=driver.findElement(By.xpath("//a[text()='Kurtas & Suits']"));
		action.moveToElement(kurta).click().perform();

	}

}
