package com.Lsac;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class CustomListener2 extends AbstractWebDriverEventListener{
	
	Logger logger;
	
    public CustomListener2(){
    	logger=Logger.getLogger("com.Qsp.CustomListener2");
    }
    
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		
		//logger = Logger.getLogger("com.Qsp.CustomListener2");
		
		//System.out.println("Calling afterChangeValueof method");
		logger.info("Calling afterChangeValueof method");
		
		String v = arg0.getAttribute("value");
		if(v.length()>0){
			//System.out.println("value entered is "+v);
			logger.info("value entered is "+v);
		}
		else{
			//System.out.println("no value entered");
			logger.info("no value entered");
			
		}
		
		
	}

}
