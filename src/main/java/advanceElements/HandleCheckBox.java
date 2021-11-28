package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {
	public static void main(String[]args) {
		//(//input[@type='checkbox'])[1]
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:7080/checkboxes");
		driver.manage().window().maximize();
		
		WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		chk1.click();
		
		WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(chk2.isSelected())
			System.out.println("Checkbox 2 is already Selected");
		driver.close();
		
		
		
	}

}
