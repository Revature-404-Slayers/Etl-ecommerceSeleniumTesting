package com.etlecommerce.runner;


import com.etlecommerce.page.EcommercePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", glue ="com.etlecommerce.steps" )
public class EcommerceRunner {

    public static WebDriver driver;

    public static EcommercePage ecommercePage;

    @BeforeClass
    public static void setUp(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        driver = new ChromeDriver();

        ecommercePage = new EcommercePage(driver);


        }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }


}
