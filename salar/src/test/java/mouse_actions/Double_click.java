package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("file:///C:/dsp/selinium%20elements/Doubleclick.html");
		Actions A = new Actions(driver);                             
      A.doubleClick( driver.findElement(By.id("demo"))).perform(); 
	
		
		
		
		
	}

}
