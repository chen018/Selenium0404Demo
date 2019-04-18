package com.selenium.Test.page;

import com.selenium.Test.base.Driverbase;
import com.selenium.Test.util.getBylocator;
import org.openqa.selenium.WebElement;

public class LoginPageJS extends basePage {
    public LoginPageJS(Driverbase driver){
        super(driver);
    }
    //登录
    public WebElement getJsloginElement(){
        return  element(getBylocator.getlocator("Jsloginame"));
    }
    //密码
    public WebElement getJspwdElement(){
        return  element(getBylocator.getlocator("Jspassword"));
    }
    //单选框
    public WebElement getSelectElement(){
        return  element(getBylocator.getlocator("inputJs"));
    }

    //单选框操作2
    public WebElement getSelect2Element(){
        return  element(getBylocator.getlocator("inputJs2"));
    }

    //登录按钮
    public WebElement getJsloginbutElement(){
        return  element(getBylocator.getlocator("Jsloginbut"));
    }
    //新建1
    public WebElement getnewJSElement(){
        return  element(getBylocator.getlocator("newJS"));
    }
    //新建xpath
    public WebElement getnewjs1Element(){
        return  element(getBylocator.getlocator("newjs1"));
    }
    //便签
    public WebElement getnewmessageElement(){
        return  element(getBylocator.getlocator("newmessage"));
    }
    //主题
    public WebElement getnewzhutiElement(){
        return  element(getBylocator.getlocator("newzhuti"));
    }
    //内容
    public WebElement getnewneironiElement(){
        return  element(getBylocator.getlocator("newneiron"));
    }
    //暂存
    public WebElement getzancenElement(){
        return  element(getBylocator.getlocator("zancen"));
    }
    //获取配置文件里的账号
    public String Jsusername(){
        return  getBylocator.getLogonMessage("JsLogin");
    }
    //获取配置文件里的密码
    public String Jsuserpwd(){
        return  getBylocator.getLogonMessage("Jspwd");
    }
    public int Jstype(){
        return Integer.valueOf(getBylocator.getLogonMessage("Jstype"));
    }
    //获取配置文件里的主题
    public String Jsnewzhuti(){
        return  getBylocator.getLogonMessage("Jszhuti");
    }
    //获取配置文件里的内容
    public String Jsnewneiron(){
        return  getBylocator.getLogonMessage("Jsneiron");
    }
    //获取配置文件里的









}
