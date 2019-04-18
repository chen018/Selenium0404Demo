package com.selenium.Test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Driverbase {
    public static WebDriver driver;
     public Driverbase(String browser){
         selectDriver selectDriver = new selectDriver();
         this.driver =  selectDriver.driverName(browser);
     }

    /**
     *封装findelement方法
     */
     public WebElement findelement(By by){
         WebElement element = driver.findElement(by);
         return  element;
     }

    /**
     *
     * 封装get方法
     */
     public  void  get(String url){
         driver.get(url);
     }

    /**
     * 封装最大化窗口方法
     */
    public void maxWindow(){
        driver.manage().window().maximize();
    }

    /**
     * 封装返回方法
     */

    public  void back(){
    driver.navigate().back();
    }
    //封装全局等待方法
    public void sleep(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public  void Thread(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Gethandles(){
        String handles1 = driver.getWindowHandle();
        for (String handles:driver.getWindowHandles()){
            if (handles.equals(handles1)){
                continue;
            }else {
                driver.switchTo().window(handles);
            }
        }
    }


    public void close(){
        driver.quit();
    }

}
