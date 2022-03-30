package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog03 {

	public static void main(String[] args) 
	{
		int count=0;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> objlinks = driver.findElements(By.className("answer"));
		for(int i=0;i<objlinks.size();i++)
		{
			count=count+1;
		}
System.out.println(count);
	}

}
