package com.selenium.Test.handle;

import com.selenium.Test.base.Driverbase;
import com.selenium.Test.page.LoginPage;
import com.selenium.Test.page.LoginPageJS;
import org.openqa.selenium.Alert;
import org.openqa.selenium.security.Credentials;

public class LoginPageJsHandle {
    public Driverbase driver;
    public LoginPageJS lpJ;

    public LoginPageJsHandle(Driverbase driver){
        this.driver =driver;
        lpJ= new LoginPageJS(driver);
    }
    //输入用户名
    public void SendkeyLogin(){lpJ.sendKey(lpJ.getJsloginElement(),lpJ.Jsusername());}

    //输入密码
    public void Sendkeypwd(){lpJ.sendKey(lpJ.getJspwdElement(),lpJ.Jsuserpwd());}

    //选择下拉框
    public void selectLogin(){lpJ.click(lpJ.getSelectElement());}

    //选择下拉框2
    public void selectLogin2(){lpJ.click(lpJ.getSelect2Element());}

    //点击登录按钮
    public void ClickLogin(){lpJ.click(lpJ.getJsloginbutElement());}

    //点击新建按钮
    public void ClicknewJs(){lpJ.click(lpJ.getnewjs1Element());

    }

    //点击便签按钮
    public void ClicknewMessage(){lpJ.click(lpJ.getnewmessageElement());}

    //输入主题
    public void SendkeyZhuti(){lpJ.sendKey(lpJ.getnewzhutiElement(),lpJ.Jsnewzhuti());}

    //输入内容
    public void Sendkeyneirong(){lpJ.sendKey(lpJ.getnewneironiElement(),lpJ.Jsnewneiron());}

    //点击暂存
    public void Clickzancun(){lpJ.click(lpJ.getzancenElement());}

    public void Get(){
        driver.get("http://117.184.59.230:8093/jsyc/form/180725211151MgNpFAPjuujDnazJd9N.xform?YEgnUfwWm08kb6gAf4ZtQMGgcpneBAJErFxOaZvTYHbv1wOwcHuG1yi86fut+7s+u432ID7g+pjg0QmTMz7tI2ntKyXNC1vtC6+bPs8YaVE2x1K6Ufqce2a37VVtLGPdUbjXe50ZB0BCv3Hel9tT4Q==");
    }
}
