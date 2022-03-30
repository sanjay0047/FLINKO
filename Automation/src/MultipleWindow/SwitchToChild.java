package MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChild 
{
	public static void main(String[] args) throws InterruptedException 
	{	int i=1;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String ParentHandle= driver.getWindowHandle();
		System.out.println("parent window: "+ParentHandle);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) 
		{
			System.out.println("child"+i+ ": "+handle);
			i++;
			if(!handle.equals(ParentHandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sanjay");
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("k");
				driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
				driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
				
				Thread.sleep(2000);
				driver.close();		
			}
		}
		driver.switchTo().window(ParentHandle);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sanjay");
	}
}
