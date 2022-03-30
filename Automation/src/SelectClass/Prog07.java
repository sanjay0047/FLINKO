package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
		
		WebElement view=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select dropdown=new Select(view);
		dropdown.selectByValue("http://demowebshop.tricentis.com/books?viewmode=list");

	}

}
