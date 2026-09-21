package com.stad.testautomation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.stad.testautomation.pages.HomePage;
import com.stad.testautomation.pages.LoginPage;
import com.stad.testautomation.pages.PracticePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	PracticePage pp;
	
	
	@Before
	public void setup() {
		   
		driver=new ChromeDriver();
		
		hp=new HomePage(driver);
		pp=new PracticePage(driver);
		lp=new LoginPage(driver);
		
		
	}
	
	//Login
	@Given("User launches the chrome browser")
	public void user_launches_the_chrome_browser() {
	   
		Assert.assertTrue(driver!=null);
		
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("User clicks on Practice link")
	public void user_clicks_on_practice_link() {
		
		 
		 hp.clickOnPracticeLink();
	   
	}
	
	

	@When("User clicks on Test Login Page link")
	public void user_clicks_on_test_login_page_link() {
		
		
		pp.clickOnTestLoginPageLink();
	   
	}

	@When("User enters Username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	   
		
		lp.setUserName(username);
		lp.setPassword(password);
	}

	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
		lp.clickLogin();
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		
		if(driver.getTitle().contains("Successfully")) {
			
			Assert.assertEquals(driver.getTitle(), title);
		}else {
			Assert.assertEquals(driver.getTitle(), title);
				
		}
	    
	}
	
	@Then("Page title should be either {string} or {string}")
	public void page_title_should_be_either_or(String title1, String title2) throws InterruptedException {
     
		if(driver.getTitle().contains(title1)) {
			
			Assert.assertEquals(driver.getTitle(), title1);
		}else {
			Thread.sleep(2000);
			String errorText=lp.getErrorText();
			System.out.println(errorText);
			Assert.assertEquals(driver.getTitle(), title2);
			Assert.assertEquals(errorText, "Your password is invalid!");
				
		}
	}
	
	@Then("Click on Logout button")
	public void click_on_logout_button() {
		lp.clickOnLogout(); 
	}
	
	//Test Exceptions
	@When("User clicks on Test Exceptions link")
	public void user_clicks_on_test_exceptions_link() {
	  
		pp.clickOnTestExceptionsLink();
		
	}
	
	

	@Then("Close browser")
	public void close_browser() {
		//driver.quit();
		
		Assert.assertTrue(driver!=null);
		
	}

	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	


}
