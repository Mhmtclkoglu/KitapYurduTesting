package com.testinium.test;

import com.testinium.Methods.Methods;
import com.testinium.driver.MainTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends MainTest {

    @Test
    public void loginTest(){
        Methods methods = new Methods();

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"), "m.ali.18524@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "12345qwert");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class ='ky-checkbox-input']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
    }

}