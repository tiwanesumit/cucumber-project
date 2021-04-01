package com.automation.stepdefn;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class allsteps {

	

	WebDriver driver;
    String base_url = "https://amazon.in";
    int implicit_wait_timeout_in_sec = 20;
    String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";


	@Before
	public void executed_always_before_each_scenario()
	{
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
        
	}
	
	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
		driver.get(base_url);
        String actual =driver.getTitle();
        Assert.assertEquals("Page Title validation",expected,actual);

	   
	}
	@When("User Search for product {string}")
	public void user_search_for_product(String productName) {
		 WebDriverWait webDriverWait = new WebDriverWait(driver,20);
	        WebElement elementSearchBox = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

	        elementSearchBox.sendKeys(productName);
	        driver.findElement(By.xpath("//input[@value='Go']")).click();

	   
	}
	@Then("Search Result page is displayed")
	public void search_result_page_is_displayed() {
		 WebDriverWait webDriverWait1 = new WebDriverWait(driver,20);
	        webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));

	  
	        Assert.assertEquals("Page Title validation","Amazon.in : Laptop", driver.getTitle());

	    
	}
	
	
	@After
	public void executed_always_after_each_scenario()
	{
		driver.quit();
	}
}
