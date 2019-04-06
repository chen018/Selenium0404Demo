package com.selenium.Test.page;

import com.selenium.Test.base.Driverbase;
import org.openqa.selenium.WebElement;
import com.selenium.Test.util.getBylocator;

public class LoginPage extends basePage{

    public LoginPage(Driverbase driver){
        super(driver);
    }

   //获取首页登录链接Element
    public  WebElement getloginElement(){
        return  element(getBylocator.getlocator("Loginliketext"));
    }
    //获取注册链接Element
    public  WebElement getregisterElement(){
        return  element(getBylocator.getlocator("register"));
    }
    //获取用户名文本框Element
    public  WebElement getUsernameElement(){
        return  element(getBylocator.getlocator("name"));
    }
    //获取登陆密码文本框Element
    public  WebElement getpwdElement(){
        return  element(getBylocator.getlocator("Loginpwd"));
    }
    //获取确认密码文本框Element
    public  WebElement getpwdsElement(){
        return  element(getBylocator.getlocator("Loginpwds"));
    }

    //获取手机号码下拉框Element
    public  WebElement getSelectMobileElement(){
        return  element(getBylocator.getlocator("selectMobile"));
    }
    //获取手机号码输入文本框Element
    public  WebElement getTextMobileElement(){
        return  element(getBylocator.getlocator("textMobile"));
    }
    //获取邮箱文本框Element
    public  WebElement getEmailElement(){
        return  element(getBylocator.getlocator("email"));
    }
    //获取主营行业文本框Element
    public  WebElement getSelectTradeElement(){
        return  element(getBylocator.getlocator("selecttrade"));
    }
    //获取用户类型文本框Element
    public  WebElement getSelectUserElement(){
        return  element(getBylocator.getlocator("selectUser"));
    }
    //获取验证码Element
    public  WebElement getyzmElement(){
        return  element(getBylocator.getlocator("yanzhenma"));
    }
    //获取提交按钮Element
    public  WebElement getRegisterButElement(){
        return  element(getBylocator.getlocator("registerBut"));
    }
    //获取配置文件里的用户名
    public String username(){
        return  getBylocator.getLogonMessage("username");
    }
    //获取配置文件里的密码1
    public String password(){
        return  getBylocator.getLogonMessage("pwd");
    }
    //获取配置文件里的密码2
    public String password2(){
        return  getBylocator.getLogonMessage("pwds");
    }
    //获取配置文件里的手机号select
    public int selectMoblie(){
       return  Integer.valueOf(getBylocator.getLogonMessage("MoblieText"));
    }
    //获取配置文件里的手机号码
    public String Moblie(){
        return  getBylocator.getLogonMessage("Moblie");
    }
    //获取配置文件里的email
    public String email(){
        return  getBylocator.getLogonMessage("email");
    }

    public int selectTrade(){
        return  Integer.valueOf(getBylocator.getLogonMessage("Tardetype"));
    }

    public int selectUsertype(){
        return  Integer.valueOf(getBylocator.getLogonMessage("Usertype"));
    }

    public  String  yanzhengma(){
        return  getBylocator.getLogonMessage("yzm");
    }
}
