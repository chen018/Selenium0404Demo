package com.selenium.Test.util;

import org.openqa.selenium.By;

public class getBylocator {
    public static By getlocator(String key){

        ProUtila properties = new ProUtila("element");
        String local=  properties.getPro(key);

        String localtype = local.split(">")[0].trim();
        System.out.println(localtype);
        String localValue = local.split(">")[1].trim();
        System.out.println(localValue);
        if (localtype.equalsIgnoreCase("id")) {
            return By.id(localValue);
        } else if (localtype.equalsIgnoreCase("name")) {
            System.out.println("name:"+localtype);
            System.out.println("loginname:"+localValue);
            return By.name(localValue);
        } else if (localtype.equalsIgnoreCase("className")) {

            return By.className(localValue);
        } else if (localtype.equalsIgnoreCase("tagName")) {
            return By.tagName(localValue);
        } else if (localtype.equalsIgnoreCase("linkText")) {
            return By.linkText(localValue);
        } else if (localtype.equalsIgnoreCase("cssSelector")) {
            return By.cssSelector(localValue);
        } else {
            return By.xpath(localValue);
        }

    }
//获取配置信息
    public static String getLogonMessage(String key){
        ProUtila properties = new ProUtila("register");
        String local =properties.getPro(key);
        return local;
    }
}
