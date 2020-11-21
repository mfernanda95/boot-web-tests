package com.tsoft.boot.pages;

import com.tsoft.boot.base.BaseClass;
import com.tsoft.boot.utils.TakeScreenShots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateBDPage extends BaseClass {
    private WebDriver driver;
    //Elements
    private By lbl_title = By.cssSelector("#header>h2");
    private By txt_titleUpdateDatabase = By.xpath("//*[contains(text(),'Actualización de base de datos')]");
    private By field_username = By.id("username");
    private By field_password = By.id("password");
    private By button_update = By.xpath("//a/span[contains(text(),'Actualizar')]");
    private By lbl_result = By.cssSelector("#result.intro");
    private By txt_success_result = By.xpath("//*[contains(text(),'You must log in to continue.')]");


    public UpdateBDPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        String text = getText(driver, lbl_title);
        TakeScreenShots.takeScreenshot(driver, "Open Web");
        return text;
    }

    public void setUsername(String username){
        setText(driver, field_username, username);
        TakeScreenShots.takeScreenshot(driver, "Send username");
    }

    public void setPassword(String password){
        setText(driver, field_password, password);
        TakeScreenShots.takeScreenshot(driver, "Send Password");
    }

    public void clickUpdate() {
        click(driver, button_update);
        TakeScreenShots.takeScreenshot(driver, "Click button");
    }

    public String getResultText(){
        String text = getText(driver, lbl_result);
        TakeScreenShots.takeScreenshot(driver, "Result text");
        return text;
    }

    public boolean isVisibleUpdateDatabaseTitle(){
        TakeScreenShots.takeScreenshot(driver, "View Title Update Database");
        return isVisibleElement(driver, txt_titleUpdateDatabase);
    }

    public boolean isVisibleSuccessResult(){
        TakeScreenShots.takeScreenshot(driver, "View Success Result");
        return isVisibleElement(driver, txt_success_result);
    }

    public void takeScreenshot(String name){
        TakeScreenShots.takeScreenshot(driver, name);
    }
}