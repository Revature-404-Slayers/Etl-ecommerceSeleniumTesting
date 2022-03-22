package com.etlecommerce.steps;

import com.etlecommerce.page.EcommercePage;
import com.etlecommerce.runner.EcommerceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    public static WebDriver driver = EcommerceRunner.driver;
    public static EcommercePage ecommercePage = EcommerceRunner.ecommercePage;
    private WebElement username;
    private WebElement password;

    @Given("The User on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("http://localhost:8080/ETL-E-Commerce/");
    }

    @When("The User fills in the username box and enters")
    public void the_user_fills_in_the_username_box_and_enters(){
        //driver.findElement(By.id("loginUser"));
        ecommercePage.login.sendKeys("admin");
    }
    @When("The User fills in the password box and enters")
    public void the_user_fills_in_the_password_box_and_enters() {
        //driver.findElement(By.id("loginPassword"));
        ecommercePage.password.sendKeys("admin");
    }
    @When("The User clicks login")
    public void the_user_clicks_login(){
        ecommercePage.signin.click();
    }


    @Then("The User should be on the Dashboard")
    public void the_user_should_be_on_dashboard() throws InterruptedException {
        Thread.sleep(350);
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/dashboard.html", driver.getCurrentUrl());

    }
}