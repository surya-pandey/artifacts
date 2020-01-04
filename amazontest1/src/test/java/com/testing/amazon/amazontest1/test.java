package com.testing.amazon.amazontest1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class test {
	AppiumDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","Nokia 6.1 plus");
//		capabilities.setCapability("deviceId", "192.168.1.4:5555");
		capabilities.setCapability("udid","DRGID18090212089");
		capabilities.setCapability("platformName","Android");
		 capabilities.setCapability("app", "C:\\Users\\Administrator\\Downloads\\Amazon Shopping Search Fast Browse Deals Easy_v18.21.2.100_apkpure.com.apk");
		capabilities.setCapability("platformVersion","9.0");

		capabilities.setCapability("noReset","true");
	//   capabilities.setCapability("appPackage", "com.google.android.calculator");
	  capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
	// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity"); // This is Launcher activity of your app (you can get it from apk info app)
	//Create RemoteWebDriver instance 
	 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		System.out.println("Application Started.....");
	}

	@Test
	public void testCal() throws Exception {
	   //locate the Text on the calculator by using By.name()
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")).click();
	    //driver.findElement( By.name("Shop by Category" )).click();
	     //driver.findElement(MobileBy.xpath("//android.widget.LinearLayout[@index='1']"));
		//driver.findElementsByXPath("//[@resource-id='in.amazon.mShop.android.shopping:id/anp_drawer_item' and @index='1']");
		//driver.findElementsByXPath("//[@class='android.widget.LinearLayout' and @index='1']");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index = '1']")).click();
		driver.findElement(By.xpath("//android.view.View[@text = 'TV, Appliances, Electronics']")).click();
		driver.findElement(By.xpath("//android.view.View[@text = 'Televisions ']")).click();
		
		//Boolean isFoundElement;
//		By myElement = By.xpath("//android.view.View[@text = 'Samsung TVs']");
//
//		isFoundElement = driver.findElements(myElement).size() > 0;
//		        while (isFoundElement == false){
//		            swipeVertical((AppiumDriver) driver,0.9,0.1,0.5,2000);
//		            isFoundElement = driver.findElements(myElement).size() > 0;
//		        }
//		        driver.findElement(myElement).click();
		        
		        
		driver.findElement(By.xpath("//android.view.View[@text = 'Samsung TVs']")).click();
		driver.findElement(By.xpath("//android.view.View[@index = '11']")).click();
		//driver.findElement(By.xpath("//android.view.View[@text = 'Qty:']")).click();
		//driver.findElement(By.xpath("//android.widget.Spinner[@resource-id = 'mobileQuantityDropDown']")).click();
		//driver.findElement(By.id("mobileQuantityDropDown_1")).click();
	    //driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sbdCategory7")).click();
		//driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Add to Cart']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Cart']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Delete']")).click();

	   //locate the edit box of the calculator by using By.tagName()
	     
		//Check the calculated value on the edit box
	    

	}
	
	

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
	};