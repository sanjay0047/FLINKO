package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog02 {

	public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			List<WebElement> objlinks = driver.findElements(By.tagName("a"));
			for(WebElement objcurrentlink:objlinks)
			{
				String Strlinktext = objcurrentlink.getText();
				System.out.println(Strlinktext);
			};
			//for(int i=0;i<objlinks.size();i++)
			//{
			//	System.out.println(objlinks.get(i).getAttribute("text"));
			//}
		} 

}
