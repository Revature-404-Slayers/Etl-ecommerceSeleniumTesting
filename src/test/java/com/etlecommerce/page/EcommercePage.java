package com.etlecommerce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class EcommercePage {

    private WebDriver driver;

    public EcommercePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //To find elements of Login
    @FindBy(id = "username")
    public WebElement login;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement signin;



    //To find element of Register
    @FindBy(id= "register")
    public WebElement register;

    @FindBy(id= "first-name")
    public WebElement firstName;

    @FindBy(id="last-name")
    public WebElement lastName;

    //register-username
    @FindBy(id="reg-username")
    public WebElement regUsername;

    @FindBy(id="reg-password")
    public WebElement regPassword;

    @FindBy(id="confirm-password")
    public WebElement confPassword;

    @FindBy(id="reg-button")
    public WebElement regButton;



    //To find elements of Dashboard
    @FindBy(xpath ="/html/body/main/div/div[2]/div[1]/div/div[2]/a")
    public WebElement firstviewdetail;

    @FindBy(xpath = "/html/body/main/div/div[2]/div[2]/div/div[2]/a")
    public WebElement secondviewdetail;

    @FindBy(xpath = "/html/body/main/div/div[2]/div[3]/div/div[2]/a")
    public WebElement thirdviewdetail;

    @FindBy(xpath = "/html/body/main/div/div[2]/center/div/div/div[2]/a")
    public WebElement fourthviewdetail;

}

