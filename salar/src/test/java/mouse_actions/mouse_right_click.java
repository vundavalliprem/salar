package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_right_click {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///C:/dsp/selinium%20elements/Drag%20and%20Drop.html");
		Actions A = new Actions(driver);                             
        WebElement S = driver.findElement(By.id("drag1"));
        WebElement T = driver.findElement(By.id("draghere"));
	A.dragAndDrop(S,T).perform()	;
			
		
		
		
	}

}
