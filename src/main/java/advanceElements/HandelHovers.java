package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelHovers {
public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:7080/hovers");
		driver.manage().window().maximize();
		
		WebElement img2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		WebElement img3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
		
		WebElement pr2 = driver.findElement(By.xpath("(//a[text()='View profile'])[2]"));
		//WebElement pr2 = driver.findElement(By.linktext("View profile"));
		
		
		Actions act = new Actions(driver);
		//act.moveToElement(img2).perform(); //to select profile. 
		act.moveToElement(img2).moveToElement(pr2).click(pr2).perform(); //to view profile. 

    }
}