package com.stad.testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
	// Constructor- To initialize the driver

	WebDriver driver;

	public PracticePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	// Locators/Page Elements

	//By link_Practice_TestLoginPage = By.xpath("//a[text()='Test Login Page']");
	
	@FindBy(xpath="//a[text()='Test Login Page']")
	WebElement link_Practice_TestLoginPage;
	
	@FindBy(xpath="//a[text()='Test Exceptions']")
	WebElement link_Practice_TestExceptions;
	

	// Action Methods

	public void clickOnTestLoginPageLink() {

		link_Practice_TestLoginPage.click();
	}
	
	public void clickOnTestExceptionsLink() {

		link_Practice_TestExceptions.click();
	}
	
	

}
