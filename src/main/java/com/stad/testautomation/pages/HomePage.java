package com.stad.testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Constructor- To initialize the driver
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this); //Mandatory
	}
	
	//Locators/Page Elements
	
	//By link_Home_Practice=By.xpath("//a[text()='Practice']");
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement link_Home_Practice;
	
	
	
	//Action Methods
	
	public void clickOnPracticeLink() {
		
		//driver.findElement(link_Home_Practice).click();
		link_Home_Practice.click();
	}
	

}
