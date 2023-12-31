package keyboard_Actions;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tab_While_login {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		Actions A = new Actions(driver);                             
		driver.findElement(By.className("loginText")).sendKeys("premv");
		Thread.sleep(2000);
		A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("premv");
		Thread.sleep(2000);
		A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		 //   ****** the above Statement or the below statement can be used
	//	driver.findElement(By.name("Submit")).click();
		
     
	
		
		
		
		
	}

}
