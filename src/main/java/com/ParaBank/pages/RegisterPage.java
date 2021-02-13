package com.ParaBank.pages;

import com.ParaBank.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 2/11/2021.
 */
public class RegisterPage extends BaseClass{
    public RegisterPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a")
    @CacheLookup
    WebElement mainregister;

    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    @CacheLookup
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    @CacheLookup
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    @CacheLookup
    WebElement address;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    @CacheLookup
    WebElement city;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    @CacheLookup
    WebElement state;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    @CacheLookup
    WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    @CacheLookup
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    @CacheLookup
    WebElement ssn;

    @FindBy(xpath = "//*[@id=\"customer.username\"]")
    @CacheLookup
    WebElement username;

    @FindBy(xpath = "//*[@id=\"customer.password\"]")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//*[@id=\"repeatedPassword\"]")
    @CacheLookup
    WebElement confirmpassword;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    @CacheLookup
    WebElement registerButton;

    public void setMainregister(){
        mainregister.click();
    }
    public void setFirstName(String fName){
        firstName.sendKeys(fName);
    }
    public void setLastName(String lName){
        lastName.sendKeys(lName);
    }
    public void setAddress(String add){
        address.sendKeys(add);
    }
    public void setCity(String cty){
        city.sendKeys(cty);
    }
    public void setState(String ste){
        state.sendKeys(ste);
    }
    public void setZipcode(String zip){
        zipcode.sendKeys(zip);
    }
    public void setPhoneNumber(String phone){
        phoneNumber.sendKeys(phone);
    }
    public void setSsn(String sn){
        ssn.sendKeys(sn);
    }
    public void setUsername(String uname){
        username.sendKeys(uname);
    }
    public void setPassword(String pwsd){
        password.sendKeys(pwsd);
    }
    public void setConfirmpassword(String cpswd){
        confirmpassword.sendKeys(cpswd);
    }
    public void setRegisterButton(){
        registerButton.click();
    }
}
