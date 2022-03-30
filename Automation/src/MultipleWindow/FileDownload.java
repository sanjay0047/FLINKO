package MultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chromedriver.chromium.org/");
		driver.findElement(By.xpath("//a[text()='ChromeDriver 100.0.4896.20']")).click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		driver.switchTo().window(null);
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();

	}

}
