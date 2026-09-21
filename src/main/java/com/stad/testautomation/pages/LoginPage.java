package com.stad.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "username")
    @CacheLookup
    WebElement txtFieldUsername;

    @FindBy(id = "password")
    @CacheLookup
    WebElement txtFieldPassword;

    @FindBy(id = "submit")
    @CacheLookup
    WebElement btnSubmit;
    
    @FindBy(id = "error")
    @CacheLookup
    WebElement errorTxt;
    
    @FindBy(xpath = "//a[text()='Log out']")
    @CacheLookup
    WebElement btnLogout;
    
    

    public void setUserName(String uname) {
    	txtFieldUsername.clear();
    	txtFieldUsername.sendKeys(uname);
    }

    public void setPassword(String pwd) {
    	txtFieldPassword.clear();
    	txtFieldPassword.sendKeys(pwd);
    }

    public void clickLogin() {
    	btnSubmit.click();
    }
    
    public String getErrorText() {
    	String errorMsgText=errorTxt.getText();
    	return errorMsgText;
    }
    
    public void clickOnLogout() {
    	btnLogout.click();
    }

}
