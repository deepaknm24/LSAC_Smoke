package com.Lsac;

import org.apache.xml.serializer.utils.Messages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageUIValidation extends SuperTestNG{
	@Test
	public void UIValidationofHomePageTest(){
		//Validating whether logo is present in homepage or not
		//All locators will be sent in separate file
		if(driver.findElement(By.id("lsacLogo")).isDisplayed()){
			logger.info("Logo is present in home page");
		}
		else{
			logger.info("Logo is not present in home page");
		}
	}

}
