package com.selenium.Test.CaseTest;
import com.selenium.Test.base.CaseBase;
import com.selenium.Test.base.Driverbase;
import com.selenium.Test.busines.LoginJsPro;
import com.selenium.Test.handle.LoginPageJsHandle;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginJsCase extends CaseBase {
    public LoginJsPro loginJsPro;
    public LoginPageJsHandle lphj;
    public Driverbase driver;
    public LoginJsCase(){
        this.driver = initDriver("firebox");
        loginJsPro=new LoginJsPro(driver);
        lphj = new LoginPageJsHandle(driver);
    }
    @BeforeMethod
    public  void GetRegisterCase(){
        driver.get("http://117.184.59.230:8093/jsyc/ctrl/adminlogin");
        driver.maxWindow();
        driver.sleep();
    }

    @Test
    public void LoginJsCase(){
        loginJsPro.Jslogin();
        System.out.println("测试成功！");
        System.out.println("测试成功！");

    }


   // @AfterMethod
    //public void close(){
        //driver.close();
   // }
}
