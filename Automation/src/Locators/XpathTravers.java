package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTravers {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]/../../..//input[@value='Add to cart']")).click();

	}

}
