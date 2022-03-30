package MultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame(driver.findElement(By.id("a077aa5e")));
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		//driver.switchTo().frame(0);

	}

}
