package com.testinium.test;

import com.testinium.Methods.Methods;
import com.testinium.driver.MainTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class FawTest extends MainTest {
    @Test
    public void fawTest(){

        Methods methods = new Methods();

        // Favorliler ekleyip kntorol edilir
        String text1 = methods.getText(By.xpath("(//a[@title='Oyuncak Tamirhanesi'])[1]"));
        methods.waitBySeconds(1);
        String text2 = methods.getText(By.xpath("//a[@title='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        String text3 = methods.getText(By.xpath("//a[@title='Candy Doktor Çantası (01923)']"));
        methods.waitBySeconds(1);
        String text4 = methods.getText(By.xpath("//a[@title='Oyuncak Ev - Duygularımı Fark Ediyorum']"));
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[6]"));
        methods.click(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id='product-table']/div[8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id='product-table']/div[9]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));

        String expectedtext1 = methods.getText(By.xpath("//a[@title='Oyuncak Tamirhanesi']"));
        methods.waitBySeconds(1);
        String expectedtext2 = methods.getText(By.xpath("//a[@title='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        String expectedtext3 = methods.getText(By.xpath("//a[@title='Candy Doktor Çantası (01923)']"));
        methods.waitBySeconds(1);
        String expectedtext4 = methods.getText(By.xpath("//a[@title='Oyuncak Ev - Duygularımı Fark Ediyorum']"));
        methods.waitBySeconds(1);


        System.out.println("text:" + expectedtext1);
        System.out.println("text:" + expectedtext2);
        System.out.println("text:" + expectedtext3);
        System.out.println("text:" + expectedtext4);

        Assert.assertEquals(text1, expectedtext1);
        Assert.assertEquals(text2, expectedtext2);
        Assert.assertEquals(text3, expectedtext3);
        Assert.assertEquals(text4, expectedtext4);

        // Ana sayfaya geri dönülür ve puan kataloğundaki türk kalsikleri seçilir
        methods.click(By.xpath("//div[@class='logo-text']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));

        methods.selectByText(By.cssSelector(".sort > select"), "Yüksek Oylama");
        methods.waitBySeconds(1);

        // Hobi kısmı seçilir
        driver.get("https://www.kitapyurdu.com/kategori/kitap-hobi/1_212.html");

        // Random bir kitap seçilir ve sepete eklenir ve favrolirden bir kitap silinir
        methods.randomElement(By.xpath("/html/body/div[5]/div/div[3]/div/div[1]/div/div[2]/ul/li"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//span[.='Sepete Ekle']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath(" //a[.='Listelerim']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath(" //div[@class='menu top my-list']//a[.='Favorilerim']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//div[@class='product-list']/div[3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//div[@id='cart']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(2);

        // Sepetteki ürün arttırlır
        WebElement input = methods.findElement(By.xpath("//input[@name='quantity']"));
        input.clear();
        methods.waitBySeconds(1);
        input.sendKeys("2");
        methods.click(By.xpath(" //i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(1);

        // Ürün satın alınır, yeni adrs eklenir
        methods.click(By.xpath("//div[@class='right']/a[contains(.,'Satın Al')]"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBySeconds(1);

        WebElement ad = methods.findElement(By.xpath(" //input[@id='address-firstname-companyname']"));
        ad.sendKeys("Mehmet");

        WebElement soyad = methods.findElement(By.xpath(" //input[@id='address-lastname-title']"));
        soyad.sendKeys("Colakoglu");

        methods.selectByText(By.xpath("//select[@id='address-country-id']"), "Türkiye");
        methods.waitBySeconds(1);

        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(1);

        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "KARTAL");
        methods.waitBySeconds(1);

        WebElement mahalle= methods.findElement(By.xpath("//input[@id='district']"));
        mahalle.sendKeys("yeni mahalle");

        WebElement adres = methods.findElement(By.xpath("//textarea[@id='address-address-text']"));
        adres.sendKeys("126 sokak no:14");

        WebElement postakodu = methods.findElement(By.xpath("//input[@id='address-postcode']"));
        postakodu.sendKeys("31284");

        WebElement ceptel = methods.findElement(By.xpath("//input[@id='address-mobile-telephone']"));
        ceptel.sendKeys("5435282521");

        WebElement sabittel = methods.findElement(By.xpath("//input[@id='address-telephone']"));
        sabittel.sendKeys("3266649317");

        methods.click(By.xpath("//input[@value='2']"));
        methods.waitBySeconds(1);

        WebElement vno = methods.findElement(By.xpath("//input[@name='company_id']"));
        vno.sendKeys("aaa");

        WebElement tcno = methods.findElement(By.xpath("//input[@id='address-tax-id']"));
        tcno.sendKeys("1010101010");

        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);

        // Kart bilgileri yanlış girilerek kontrol edilir.
        WebElement kartsahibi = methods.findElement(By.xpath("//input[@id='credit-card-owner']"));
        kartsahibi.sendKeys("Mehmet Ali Çolakoğlu");
        methods.waitBySeconds(1);
        WebElement bosluk1 = methods.findElement(By.xpath("//table[@class='form']//tr[5]//input[1]"));
        bosluk1.sendKeys("1234");
        methods.waitBySeconds(1);
        WebElement bosluk2 = methods.findElement(By.xpath("//input[2]"));
        bosluk2.sendKeys("1234");
        methods.waitBySeconds(1);
        WebElement bosluk3 = methods.findElement(By.xpath("//input[3]"));
        bosluk3.sendKeys("1234");
        methods.waitBySeconds(1);
        WebElement bosluk4 = methods.findElement(By.xpath("//input[4]"));
        bosluk4.sendKeys("1234");
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "10");
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2026");
        methods.waitBySeconds(1);
        WebElement cvvkod = methods.findElement(By.xpath("//input[@id='credit-card-security-code']"));
        cvvkod.sendKeys("345");


        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(1);

        WebElement gecersiz = methods.findElement(By.xpath(" //span[@class='error']"));
        assert gecersiz.getText().equals("Kart numarası geçersiz. Kontrol ediniz!");

        // Ana sayfaya dönülür ve çıkış yapılır.
        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(1);

        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).build().perform();
        methods.waitBySeconds(2);

        WebElement option = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        option.click();
        methods.waitBySeconds(2);


    }

}
