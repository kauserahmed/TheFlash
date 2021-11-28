package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandledropDown {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:7080/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select sel = new Select(dropdown);
		
		// 3 way to select drop down -- index, visible text, and value
		
		sel.selectByIndex(2);
		Thread.sleep(50000);
		
		sel.deselectByVisibleText("Option 1");
		Thread.sleep(50000);
		
		sel.selectByValue("2");
		Thread.sleep(50000);
		
		//driver.close();
		

}
}
