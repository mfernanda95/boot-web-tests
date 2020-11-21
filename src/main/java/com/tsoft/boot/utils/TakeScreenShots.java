package com.tsoft.boot.utils;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShots {
    public static void takeScreenshot(WebDriver driver, String name){
        new File("screenshots").mkdir();
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot, new File("screenshots/" + name + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
