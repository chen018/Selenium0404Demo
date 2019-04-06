package com.selenium.Test.util;

import java.io.*;
import java.util.Properties;

public class ProUtila {
    private Properties pror;
    private String filePath;

    public ProUtila(String FilePath) {
        this.filePath = FilePath;
        this.pror = readProperties();
    }

    private Properties readProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    public String getPro(String key){
    if (pror.containsKey(key)){
        String username = pror.getProperty(key);
        return  username;
    }else {
        System.out.println("你获取的key值不对");
        return  "";
        }
    }


}
