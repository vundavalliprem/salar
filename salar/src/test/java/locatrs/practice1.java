package locatrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {
static WebDriver prem;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
prem= new ChromeDriver();
prem.get("https://formy-project.herokuapp.com/");
prem.findElement(By.linkText("Checkbox")).click();         // using link test
prem.findElement(By.xpath("//a[@class='btn btn-lg' and @href='/checkbox']")).click();      // by using xpath    
//prem.findElement(By.xpath("//div[@id='checkbox-1']")).click(); // not comeing


	}

}
