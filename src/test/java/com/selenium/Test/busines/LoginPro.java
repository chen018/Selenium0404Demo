package com.selenium.Test.busines;

import com.selenium.Test.base.Driverbase;
import com.selenium.Test.handle.LoginpageHandle;

public class LoginPro {
    public LoginpageHandle lph;
    public Driverbase driver;
    public LoginPro(Driverbase driver){
        lph=new LoginpageHandle(driver);
    }


    public void register(){
        lph.sendKeyLoginame();
        lph.sendKeyLogipwd();
        lph.sendKeyLogipwds();
        lph.selectMobile();
        lph.sendKeyTextMobile();
        lph.sendKeyEmail();
        lph.selectTrade();
        lph.selectUserType();
        lph.sendKeyYzm();
        lph.clickSubmitBut();
    }
}
