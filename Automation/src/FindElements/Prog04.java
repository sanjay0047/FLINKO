package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog04 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> objlink=driver.findElements(By.tagName("td"));
		//for(int i=0;i<objlink.size();i++)
		//{
		//	System.out.println(objlink.get(i).getAttribute("text"));
		//}
		for(WebElement objcurrentlink:objlink)
		{
			String Strlinktext = objcurrentlink.getText();
			System.out.println(Strlinktext);
		};

	}

}
