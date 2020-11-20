package com.tsoft.boot.tests;

import com.tsoft.boot.base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdatingBD_HBK  extends BaseTest {

    @Test
    public void testOpenLink(){
        if(updateBDPage.getTitleText().contains("Actualización de base de datos")){
            System.out.println("Ingrese a la web");
            updateBDPage.setUsername("APP_DEVOPS_HB_DESA");
            updateBDPage.setPassword("4ppHBd3vops");

        }else{
            System.err.println("No se pudo ingresar a la web");
        }
    }
}
