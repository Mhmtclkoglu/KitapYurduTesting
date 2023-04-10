package com.testinium.test;

import com.testinium.Methods.Methods;
import com.testinium.driver.MainTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.lang.reflect.Method;

public class HomePageTest extends MainTest {

    @Test
    public void homeTest() {
        Methods methods = new Methods();
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));
        System.out.println("Anasayfa acildi");
    }
}

