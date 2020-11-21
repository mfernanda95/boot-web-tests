package com.tsoft.boot.base;

import com.tsoft.boot.pages.UpdateBDPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest{
    //private WebDriver driver;
    private WebDriver driver;
    protected UpdateBDPage updateBDPage;
    @BeforeClass
    public void setUp(){
            WebDriverManager.chromedriver().setup();
            //WebDriverManager.chromedriver().version("78.0.3904.70").setup();
            //driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver","/u01/chromedriver/chromedriver");
            driver = new ChromeDriver(getChromeOptions());

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
        if(ITestResult.FAILURE == result.getStatus()){
        }
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("disable-infobars");
        return options;
    }
}
