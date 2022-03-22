package com.etlecommerce.steps;

import com.etlecommerce.page.EcommercePage;
import com.etlecommerce.runner.EcommerceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    public static WebDriver driver = EcommerceRunner.driver;
    public static EcommercePage ecommercePage = EcommerceRunner.ecommercePage;

    @Given("The User on the Register page")
    public void the_user_on_the_register_page(){
        driver.get("http://localhost:8080/ETL-E-Commerce/");
        ecommercePage.register.click();
    }
    @When("The User fills out First Name Box")
    public void the_user_fills_out_first_name_box(){
        ecommercePage.firstName.sendKeys("Ta");

    }
    @When("The User fills out Last Name Box")
    public void the_user_fills_out_last_name_box(){
        ecommercePage.lastName.sendKeys("To");

    }
    @When("The User fills out Username Box")
    public void the_user_fills_out_username_box(){
        ecommercePage.regUsername.sendKeys("T2");

    }
    @When("The User fills out Password box")
    public void the_user_fills_out_password_box(){
        ecommercePage.regPassword.sendKeys("pass");

    }
    @When("The User fills out Confirm Password Box")
    public void the_user_fills_out_confirm_password_box(){
        ecommercePage.confPassword.sendKeys("pass");

    }
    @Then("The User is added")
    public void the_user_is_added() throws InterruptedException {
        ecommercePage.regButton.click();
        driver.get("http://localhost:8080/ETL-E-Commerce/");
        ecommercePage.login.sendKeys("tcg");
        ecommercePage.password.sendKeys("pass");
        ecommercePage.signin.click();
        Thread.sleep(250);
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/dashboard.html", driver.getCurrentUrl());

    }
}
