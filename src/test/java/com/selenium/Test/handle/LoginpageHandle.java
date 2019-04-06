package com.selenium.Test.handle;

import com.selenium.Test.base.Driverbase;
import com.selenium.Test.page.LoginPage;

public class LoginpageHandle {
    public Driverbase driver;
    public LoginPage lp;

    public LoginpageHandle(Driverbase driver){
        this.driver =driver;
        lp= new LoginPage(driver);
    }

    //封装点击登录链接
    public void  clickLogin(){
        lp.click(lp.getloginElement());
    }

    public void  clickRegister(){
        driver.sleep();
        lp.click(lp.getregisterElement());
    }

    public void  sendKeyLoginame(){
        driver.sleep();
        lp.sendKey(lp.getUsernameElement(),lp.username());
    }

    public void sendKeyLogipwd(){
        lp.sendKey(lp.getpwdElement(),lp.password());
    }

    public void sendKeyLogipwds(){
        lp.sendKey(lp.getpwdsElement(),lp.password2());
    }

    public void  selectMobile(){
        lp.select(lp.getSelectMobileElement(),lp.selectMoblie());
    }

    public void sendKeyTextMobile(){
        lp.sendKey(lp.getTextMobileElement(),lp.Moblie());
    }

    public void sendKeyEmail(){
        lp.sendKey(lp.getEmailElement(),lp.email());
    }

    public void selectTrade(){
        lp.select(lp.getSelectTradeElement(),lp.selectTrade());
    }

    public void selectUserType(){
        lp.select(lp.getSelectUserElement(),lp.selectUsertype());
    }

    public void sendKeyYzm(){
        lp.sendKey(lp.getyzmElement(),lp.yanzhengma());
    }

    public  void clickSubmitBut(){
        lp.click(lp.getRegisterButElement());
    }

}
