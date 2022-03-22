package com.etlecommerce.steps;

import com.etlecommerce.page.EcommercePage;
import com.etlecommerce.runner.EcommerceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DashboardSteps {
    public static WebDriver driver = EcommerceRunner.driver;
    public static EcommercePage ecommercePage = EcommerceRunner.ecommercePage;

    @Given("The User is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() throws InterruptedException {
        driver.get("http://localhost:8080/ETL-E-Commerce/");
        ecommercePage.login.sendKeys("admin");
        ecommercePage.password.sendKeys("admin");
        ecommercePage.signin.click();
        Thread.sleep(500);
        //driver.get("http://localhost:8080/ETL-E-Commerce/dashboard.html");
    }
    @When("The User clicks View Details for Marketing Team")
    public void the_user_clicks_view_detail_for_marketing_team(){
        ecommercePage.firstviewdetail.click();
    }
    @Then("The User see Marketing details")
    public void the_user_see_marketing_details() throws InterruptedException {
            //Thread.sleep(3000);
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/marketingDashboard.html", driver.getCurrentUrl());
    }
    @When("The User clicks View Detail for Research Team")
    public void the_user_clicks_view_detail_for_research_team(){
        driver.get("http://localhost:8080/ETL-E-Commerce/dashboard.html");
        ecommercePage.secondviewdetail.click();
    }
    @Then("The User see Research details")
    public void the_user_see_research_details(){
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/researchDashboard.html", driver.getCurrentUrl());
    }
    @When("The User clicks View Details for Management Team")
    public void the_user_clicks_view_details_for_management_team(){
        driver.get("http://localhost:8080/ETL-E-Commerce/dashboard.html");
        ecommercePage.thirdviewdetail.click();
    }
    @Then("The User see Management details")
    public void the_user_see_management_details(){
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/managementDashboard.html", driver.getCurrentUrl());

    }
    @When("The User clicks View Details for Data Resources")
    public void the_user_clicks_view_detail_for_data_resources(){
        driver.get("http://localhost:8080/ETL-E-Commerce/dashboard.html");
        ecommercePage.fourthviewdetail.click();
    }
    @Then("The User see Data details")
    public void the_user_see_data_details(){
        Assert.assertEquals("http://localhost:8080/ETL-E-Commerce/dataQuality.html", driver.getCurrentUrl());
    }
}
