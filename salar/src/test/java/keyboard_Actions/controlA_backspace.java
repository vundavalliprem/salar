package keyboard_Actions;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class controlA_backspace {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
		driver.get("https://www.google.co.in/");
		Actions A = new Actions(driver);                             
		driver.findElement(By.className("gLFyf")).sendKeys("my name is prem kumar vundavalli");
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
	//	Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		A.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		A.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		A.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
     driver.close();
	
   
		//Actions A ==
     StringSelection = new StringSelection("C:\\Users\\vunda\\OneDrive\\Desktop\\photoooo.png");
		
	}

}
