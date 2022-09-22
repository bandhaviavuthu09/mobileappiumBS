package org.appium.TestUtils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
public class testBS {

//	AndroidDriver driver
   AndroidDriver driver;
   public static String userName = "bandhavi_OQa1sZ";  
   public static String accessKey = "tY9r13NstMiedt2MnF7i";
   @BeforeTest
   public void setup() throws MalformedURLException {
	   
      DesiredCapabilities caps = new DesiredCapabilities();
      HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
      // Set your access credentials
      
      // Set other BrowserStack capabilities
      /*browserstackOptions.put("appiumVersion", "1.22.0");
      browserstackOptions.put("projectName", "First Java Project");
      browserstackOptions.put("buildName", "browserstack-build-1");
      browserstackOptions.put("sessionName", "first_test");
      // Passing browserstack capabilities inside bstack:options
      caps.setCapability("bstack:options", browserstackOptions);*/
      // Set URL of the application under test
      /*caps.setCapability("app", "bs://fcc88b12f233104abe007a321333f770213703fa");
      // Specify deviceName and platformName for testing
      caps.setCapability("deviceName", "Galaxy S22");
      caps.setCapability("platformName", "android");
      caps.setCapability("platformVersion", "12.0");*/
      
      caps.setCapability("os_version", "10.0");
      caps.setCapability("deviceName", "Samsung Galaxy S20");
      caps.setCapability("platformName", "android");
      caps.setCapability("app", "bs://fcc88b12f233104abe007a321333f770213703fa");
      driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
   }

   @Test
   public void testSearchAppium() {

      /*driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
      driver.findElement(By.id("android:id/text1")).click();
      driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
      driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
      driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
      String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
      AssertJUnit.assertEquals(toastMessage,"Please enter your name");*/
	   System.out.println("success Passed");
   }@AfterTest
   public void tearDown() {
      driver.quit();
   }

}