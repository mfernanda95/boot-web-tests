package com.tsoft.boot.base;

import com.tsoft.boot.pages.UpdateBDPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest{
    private WebDriver driver;
    protected UpdateBDPage updateBDPage;
    @BeforeClass
    public void setUp(){

            WebDriverManager.chromedriver().setup();
            //WebDriverManager.chromedriver().version("78.0.3904.70").setup();
            driver = new ChromeDriver();
            driver.get(System.getProperty("url"));
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            updateBDPage = new UpdateBDPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
        }
    }

}
