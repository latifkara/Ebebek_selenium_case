package com.javaGelisme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/latifkara/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("txtSearchBox"));
        search.sendKeys("biberon");
        Thread.sleep(1000);

        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement firstProduct = driver.findElement(By.className("product-item"));
        firstProduct.click();
        Thread.sleep(2000);

        WebElement productButton = driver.findElement(By.id("addToCartBtn"));
        productButton.click();
        Thread.sleep(2000);

        WebElement showProduct = driver.findElement(By.id("btnShowCart"));
        showProduct.click();







    }
}
