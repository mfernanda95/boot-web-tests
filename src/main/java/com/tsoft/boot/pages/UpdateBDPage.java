package com.tsoft.boot.pages;

import com.tsoft.boot.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateBDPage extends BaseClass {
    private WebDriver driver;
    //Elements
    By lbl_title = By.cssSelector("#header>h2");


    public UpdateBDPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return getText(driver, lbl_title);
    }
}
