package com.tsoft.boot.tests;

import com.tsoft.boot.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdatingBD_HBK_Test extends BaseTest {

    @Test
    public void updateDatabase(){
        System.out.println("[LOG] : Ingrese a la web: "+System.getProperty("url"));
        if(updateBDPage.getTitleText().contains("Actualizacion de base de datos")){
            System.out.println("[LOG] : Se realizará la actualizacion de base de datos  ");
            updateBDPage.setUsername(System.getProperty("username")); //"APP_DEVOPS_HB_DESA"
            updateBDPage.setPassword(System.getProperty("password")); //4ppHBd3vops
            updateBDPage.clickUpdate();
            if(updateBDPage.isVisibleResultText() && !updateBDPage.getResultText().contains("Error conectandose a la base de datos")){
                System.out.println("[LOG] : Se realizo la actualizacion de la base de datos  ");
            }else{
                System.err.println("[ERROR] : "+updateBDPage.getResultText());
            }
        }else{
            System.err.println("[ERROR] : No es necesario realizar la actualizacion de Base de Datos");
        }
    }

}
