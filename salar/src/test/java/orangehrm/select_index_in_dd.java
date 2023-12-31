package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_index_in_dd {
	static WebDriver prem;
	public static void main(String[] args) throws InterruptedException {
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
		  
		//now we are selecting values in dropdown
		// to select values in dropdown w use select keyword
		Thread.sleep(4000);
		
		Select S = new Select(dd);
		//S.selectByIndex(4);
		S.selectByVisibleText("Job Title");
		
	}

}
