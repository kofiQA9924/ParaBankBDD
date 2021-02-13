package com.ParaBank.pages;

import com.ParaBank.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 2/12/2021.
 */
public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    @CacheLookup
    WebElement username;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[2]/input")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    @CacheLookup
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
    @CacheLookup
    WebElement acoverview;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    @CacheLookup
    WebElement logoutButton;

    public void setUsername(String suname){
        username.sendKeys(suname);
    }
    public void setPassword(String cpswd){
        password.sendKeys(cpswd);
    }
    public void setLoginButton(){
        loginButton.click();
    }
    public void setacoverview(){
        acoverview.isDisplayed();
    }
    public void setLogoutButton(){
        logoutButton.click();
    }
}
