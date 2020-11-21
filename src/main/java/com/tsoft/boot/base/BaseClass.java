package com.tsoft.boot.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


    private static final long MAX_WAIT_TIME_SECONDS = 40;
    private static final long NEXT_TRY_TIME_MILISECONDS = 200;

    public String getText(WebDriver driver, By byWebElement) {
        return  waitForExistsOfElement( driver,  byWebElement).getText();
    }

    public void setText(WebDriver driver, By byWebElement, String text) {
        driver.findElement(byWebElement).sendKeys(text);
    }

    private WebElement waitForExistsOfElement(WebDriver driver, By byWebElement)  {
        WebDriverWait webDriverWait = new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS);
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byWebElement));
    }

    public void click(WebDriver driver, By byWebElement) {
        //driver.findElement(byWebElement).click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');", driver.findElement(byWebElement));
    }

    public boolean isVisibleElement(WebDriver driver, By byWebElement) {
        try{
            waitForExistsOfElement( driver,  byWebElement).isDisplayed();
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}

