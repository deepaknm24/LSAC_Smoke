package com.Lsac.Scripts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SuperTestNG {
	WebDriver fdriver;
	EventFiringWebDriver driver;
	Logger logger;
	
	public SuperTestNG(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		String startTime=dateFormat.format(date);
		System.setProperty("logfile.name", "./logs/"+startTime+".log");
		
		logger = Logger.getLogger("com.Qsp.SuperTestNG");	
	}
	
	@Parameters({"environment"})
	@BeforeMethod
	public void precondition(String environment){
		if(environment.equalsIgnoreCase("webbrowser")){
		logger.info("Starting Execution");
		System.setProperty("webdriver.chrome.driver",".//src//chromedriver.exe");
		fdriver = new ChromeDriver();
		driver=new EventFiringWebDriver(fdriver);
		
		//CustomListener clistener = new CustomListener();
		CustomListener2 clistener2 = new CustomListener2();
      
		driver.register(clistener2);
	
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://familiar.lsac.org/");
		}
		if(environment.equalsIgnoreCase("moblebrowser")){
			AndroidDriver<AndroidElement>  driver;

			// TODO Auto-generated method stub
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	     
		}
		
	}
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		logger.info("Ending Execution");
	}		
	}
	


