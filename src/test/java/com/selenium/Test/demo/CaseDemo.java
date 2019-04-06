package com.selenium.Test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaseDemo {
    @Test
    public void SeleniumTest(){
        System.setProperty("webdriver.firefox.marionette", ".\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com");

    }


}
