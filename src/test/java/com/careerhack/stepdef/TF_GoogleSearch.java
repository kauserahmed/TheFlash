package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.careerhack.common.FlashBase;
import com.careerhack.pages.HomePage_Objects;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class TF_GoogleSearch extends FlashBase{
	
	HomePage_Objects hpo = new HomePage_Objects(driver);

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();

	}

		@When("I enter search {string}")
		public void i_enter_search(String string) {
			//WebElement searchBox = driver.findElement(By.name("q"));
			//searchBox.sendKeys(string);
			//WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
			//searchBox.sendKeys(string);   
			hpo = new HomePage_Objects(driver);
			hpo.enterTerm(string);
		}

		@When("I click on google search button")
		public void i_click_on_google_search_button() {
			//WebElement searchButton = driver.findElement(By.name("btnK"));
			//searchButton.submit();
			//WebElement searchButton = driver.findElement(By.xpath("//input[@name='q']"));
			//searchButton.submit();
			
			hpo.clickButton();

		}

		@Then("I receive related search results")
		public void i_receive_related_search_results() {
		   String title = driver.getTitle();
		   System.out.println(title);
		}

		@Then("I capture number of search results returned")
		public void i_capture_number_of_search_results_returned() {
			WebElement searchNumber = driver.findElement(By.xpath("//div[@id='result-stats']"));
			String number = searchNumber.getText();
			System.out.println(number);
			
			closeAllBrowser();
		}

}
