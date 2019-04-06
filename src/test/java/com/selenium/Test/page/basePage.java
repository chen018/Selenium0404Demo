package com.selenium.Test.page;

import com.selenium.Test.base.Driverbase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basePage {
    public Driverbase driver;
    public  basePage(Driverbase driver){
        this.driver = driver;
    }

    /**
     * 封装查找元素的方法（又可以用于查找父节点）
     */
    public WebElement element(By by){
        WebElement element = driver.findelement(by);
        return  element;
    }

    /**
     * 封装点击操作
     * @param element
     */

    public  void click(WebElement element){
        if (element!=null){
            element.click();
        }else{
            System.out.println(element+"找不到该元素element,无法点击");
        }
    }

    /**
     * 封装输入方法
     * @param element
     * @param value
     */

     public void sendKey(WebElement element,String value){
        if (element!=null){
            element.sendKeys(value);
        }else {
            System.out.println(element+"该输入的元素elment为空没找到,无法输入"+value);
        }
     }

    /**
     * 封装查看元素是否可用的方法
     * @param element
     * @return
     */
     public boolean isDisplayd(WebElement element){
        return  element.isDisplayed();
    }

    /**
     * 封装移动鼠标方法moveTo
     * @param element
     */
    public void  moveTo(WebElement element){
         if (element!=null){
             Actions actions = new Actions(Driverbase.driver);
             actions.moveToElement(element).perform();
         }else{
             System.out.println(element+"元素为空定位不到无法将鼠标移过去");
         }
    }

    /**
     *封装层级定位,通过父节点定位到子节点
     * 需要传入父节点和子节点的By
     * @return
     */
    public  WebElement nodeElement(By by,By by2){
        WebElement father = this.element(by);
        return  father.findElement(by2);
    }

    /**
     * 封装获取元素文本的方法
     * @param element
     * @return
     */
    public String getText(WebElement element){
           return element.getText();
    }

    //封装通过索引点击下拉框操作
    public void select(WebElement element,int num){
        Select s  = new Select(element);
        s.selectByIndex(num);
    }

}
