package org.scripts;


import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.webdriverutil.AppiumDriver;

public class StartUpAppium {
    static AndroidDriver driver=null;
    @BeforeClass
    public static void InitiateDriver(){
            try{

                driver = AppiumDriver.getAndriodDriverInstant(System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk");

            }
            catch (Exception e){
                e.fillInStackTrace();
            }
    }
    @Test
    public void testPreference(){
        try{
            driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
            driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
            driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
            driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
            driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Home");
            driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();


        }
        catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
