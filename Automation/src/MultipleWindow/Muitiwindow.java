package MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Muitiwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		System.out.println("Parrent: "+parent);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String child:handles)
		{
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
				System.out.println("child: "+child);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("san.sanjay.k@gmail.com");
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@123");
				Thread.sleep(2000);
		}	}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		//driver.quit();
	}
}
