package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	static WebDriver prem;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
prem= new ChromeDriver();
		prem.manage().window().maximize();
		prem.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		prem.findElement(By.name("txtUserName")).sendKeys("premv");
		prem.findElement(By.name("txtPassword")).sendKeys("premv");
		prem.findElement(By.name("Submit")).click();
		
		prem.switchTo().frame(prem.findElement(By.id("rightMenu")));
		//prem.switchTo().defaultContent();
		//prem.findElement(By.linkText("Logout")).click();
		WebElement dd = prem.findElement(By.id("loc_code"));
	//	prem.findElements(by.)
	List<WebElement> ddvalues= dd.findElements(By.tagName("option"));
		System.out.println("dd values size::-"+ddvalues.size());
		System.out.println("dd values size::-"+ddvalues.get(6));
		System.out.println("dd values size::-"+ddvalues.get(4).getText());
		
		
		
		
	}

}
