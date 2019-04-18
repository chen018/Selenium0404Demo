package com.selenium.Test.busines;

import com.selenium.Test.base.Driverbase;
import com.selenium.Test.handle.LoginPageJsHandle;
import com.selenium.Test.handle.LoginpageHandle;

public class LoginJsPro {
    public LoginPageJsHandle lphj;
    public Driverbase driver;
    public LoginJsPro(Driverbase driver){
        lphj=new LoginPageJsHandle(driver);
    }


    public  void Jslogin(){
        lphj.SendkeyLogin();
        lphj.Sendkeypwd();
        lphj.selectLogin();
        lphj.selectLogin2();
        lphj.ClickLogin();
        //lphj.ClicknewJs();
        lphj.Get();
        //driver.get("http://117.184.59.230:8093/jsyc/form/180725211151MgNpFAPjuujDnazJd9N.xform?YEgnUfwWm08kb6gAf4ZtQMGgcpneBAJErFxOaZvTYHbv1wOwcHuG1yi86fut+7s+u432ID7g+pjg0QmTMz7tI2ntKyXNC1vtC6+bPs8YaVE2x1K6Ufqce2a37VVtLGPdUbjXe50ZB0BCv3Hel9tT4Q==");
        lphj.SendkeyZhuti();
        lphj.Sendkeyneirong();
        lphj.Clickzancun();
    }

}
