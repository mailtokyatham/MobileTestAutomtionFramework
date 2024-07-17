package org.scripts;


import org.webdriverutil.AppiumDriver;

public class StartUpAppium {
    public static void main(String[] args) {
        try{

            AppiumDriver.getAndriodDriverInstant(System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk");

        }
        catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
