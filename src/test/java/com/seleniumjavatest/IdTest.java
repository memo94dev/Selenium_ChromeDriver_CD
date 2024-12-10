package com.seleniumjavatest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IdTest {
    WebDriver driver;

    @Test
    public void ChromeOpen(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("SuperSecretPassword!");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.close();
    }
}