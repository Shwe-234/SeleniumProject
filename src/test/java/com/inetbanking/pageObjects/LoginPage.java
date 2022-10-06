package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements( rdriver,this);
    }
    @FindBy(name="uid")
    WebElement textUserName;
    @FindBy(name="password")
    WebElement textPassword;
    @FindBy(name="btnLogin")
    WebElement btnLogin;
    public void setUserName(String username)
    {
    	textUserName.sendKeys(username);
    }
    public void setPassword(String password)
    {
    	textPassword.sendKeys(password);
    }
    public void clickOnLoginButton()
    {
    	btnLogin.click();
    }
    
}
