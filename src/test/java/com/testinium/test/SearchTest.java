package com.testinium.test;

import com.testinium.Methods.Methods;
import com.testinium.driver.MainTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class SearchTest extends MainTest {
    @Test
    public void searchTest(){
        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
    }
}
