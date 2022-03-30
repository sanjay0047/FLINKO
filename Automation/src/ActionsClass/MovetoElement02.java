package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement02 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement 	comp=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		action.moveToElement(comp).build().perform();
		
		WebElement 	sel=driver.findElement(By.xpath("//a[@href='/notebooks']"));
		action.moveToElement(sel).click().perform();
	}

}
