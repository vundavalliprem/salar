package locatrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {
	static WebDriver prem;

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		prem = new ChromeDriver();
		prem.manage().window().maximize();
		prem.get("https://support.orangehrm.com/portal/en/signin");
		//Thread.sleep(3000);
	    prem.switchTo().frame(0);                              // move to the frame based on index
	 	prem.findElement(By.name("username")).sendKeys("vundavalliprem");
        prem.findElement(By.name("password")).sendKeys("vundavalliprem");
     //   prem.findElement(By.linkText(""));
        prem.switchTo().defaultContent();                 //comes out of the frame
        
	}

}
