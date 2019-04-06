package com.selenium.Test.CaseTest;

import com.selenium.Test.base.CaseBase;
import com.selenium.Test.base.Driverbase;
import com.selenium.Test.busines.LoginPro;
import com.selenium.Test.handle.LoginpageHandle;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegisterCase extends CaseBase {
    public LoginPro loginPro;
    public LoginpageHandle lph;
    public Driverbase driver;
    public RegisterCase(){
        this.driver = initDriver("firebox");
        loginPro=new LoginPro(driver);
        lph = new LoginpageHandle(driver);
    }

    @BeforeMethod
    public  void GetRegisterCase(){
        driver.get("https://seller.dhgate.com/");
        driver.maxWindow();
        driver.sleep();
        lph.clickLogin();
        driver.sleep();
        lph.clickRegister();
        //driver.get("https://seller.dhgate.com/merchant/register/pageLoad.do");
        driver.Gethandles();


    }
    @Test
    public void Register(){
        loginPro.register();
        System.out.println("测试成功！");
        System.out.println("测试成功！");
        System.out.println("测试成功！");
        System.out.println("测试成功！");
    }


    @AfterMethod
    public void close(){
        driver.close();
    }
}
