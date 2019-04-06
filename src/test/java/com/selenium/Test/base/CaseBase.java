package com.selenium.Test.base;

public class CaseBase {
    public  Driverbase initDriver(String browser){
        Driverbase driver = new Driverbase(browser);
        return driver;
    }
}
