package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_practice2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("file:///C:/dsp/selinium%20elements/Model%20Popup.html");
	driver.findElement(By.id("Modal")).click();
	Thread.sleep(3000);
		driver.findElement(By.className("close")).click();
		
		
	}

}
