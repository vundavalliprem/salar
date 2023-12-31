package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_hover {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.className("loginText")).sendKeys("premv");
		
		driver.findElement(By.name("txtPassword")).sendKeys("premv");
		driver.findElement(By.name("Submit")).click();
		Actions A = new Actions(driver);                             
		                                                // to perform a mouse hover "MOVETOELEMENT" will be used 
	A.moveToElement(driver.findElement(By.xpath("//*[@id=\"leave\"]/a/span"))).perform()	;
		//first the above will perform and next the below will perform
		driver.findElement(By.className("drop")).click();
		
		
		
		
		
	}

}
