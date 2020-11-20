package com.tsoft.boot.pages;

import com.tsoft.boot.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateBDPage extends BaseClass {
    private WebDriver driver;
    //Elements
    private By lbl_title = By.cssSelector("#header>h2");
    private By field_username = By.id("username");
    private By field_password = By.id("password");


    public UpdateBDPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return getText(driver, lbl_title);
    }

    public void setUsername(String username){
        driver.findElement(field_username).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(field_password).sendKeys(password);
    }

}
