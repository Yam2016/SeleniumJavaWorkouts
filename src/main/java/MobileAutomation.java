import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAutomation {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        //To tell Appium server whether to perform the automation on Android or iOS device, specify the framework name:
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        //Name of the emulator in android studio
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_XL_API_28");

        //To tell Appium server which app to open:
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk");


        //Driver object creation to perform the automation. Takes 2 arguments -
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Some text goes here");
        driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
    }
}