package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_card {
	WebDriver driver;

@Given("I am on the amazon homepage")
public void i_am_on_the_amazon_homepage() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/ref=nav_logo");
	driver.manage().window().maximize();
    
}

@When("I click on the card")
public void i_click_on_the_card() {
	WebElement searchButton = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
	searchButton.click();
   
}
}