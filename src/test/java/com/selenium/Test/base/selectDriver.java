package com.selenium.Test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class selectDriver {
    public WebDriver driverName(String browser){
        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette",".\\driver\\geckodriver.exe");
            return  new FirefoxDriver();
        }else{
            System.setProperty("webdriver.firefox.marionette", ".\\driver\\geckodriver.exe");
            return new FirefoxDriver();
        }

    }

}
