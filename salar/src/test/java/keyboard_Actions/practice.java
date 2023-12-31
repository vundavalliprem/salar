package keyboard_Actions;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Actions A = new Actions(driver);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.className("loginText")).sendKeys("premv");
	//	Thread.sleep(2000);
		A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("premv");
	//	Thread.sleep(2000);
		A.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//Thread.sleep(2000);
		A.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	
	A.moveToElement(driver.findElement(By.id("pim"))).perform();
	Thread.sleep(2000);
	Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		driver.findElement(By.id("txtEmployeeId")).sendKeys("9494");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("prem");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("vundavalli");
		driver.findElement(By.id("txtEmpMiddleName")).sendKeys("kumar");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("premmm");
	A.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
	
	StringSelection s = new StringSelection("C:\\Users\\vunda\\OneDrive\\Desktop\\photoooo.png");
		
		
		stringselection p = new stringselection();
		
		
	}

}
