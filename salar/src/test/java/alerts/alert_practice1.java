package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_practice1 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("file:///C:/dsp/selinium%20elements/Alert%20Message.html");
		driver.findElement(By.xpath("/html/body/button")).click();
	Alert z =	driver.switchTo().alert();
		Thread.sleep(2000);
		z.accept();
		
		
		
		
		
		
		
	}

}
