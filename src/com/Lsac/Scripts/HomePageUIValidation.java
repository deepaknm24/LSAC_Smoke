package com.Lsac.Scripts;

import org.apache.xml.serializer.utils.Messages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Lsac.Pom.HomePage;

public class HomePageUIValidation extends SuperTestNG{
	@Test
	public void UIValidationofHomePageTest(){
		//Validating whether logo is present in homepage or not
		HomePage hp = new HomePage(fdriver);
		if(hp.getlogo().isDisplayed()){
			logger.info("Logo is present in home page");
		}
		else{
			logger.info("Logo is not present in home page");
		}
	}

}
