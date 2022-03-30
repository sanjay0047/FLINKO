package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sanjay%20K/Downloads/dropDown%20(1).html");
		driver.manage().window().maximize();	
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"m1\"]"));
		Select element1=new Select(dropdown);
		System.out.println(element1.isMultiple());

	}

}
