package com.Lsac.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lsac.Scripts.SuperTestNG;

public class HomePage extends SuperTestNG {
	@FindBy(id="lsacLogo")
	private WebElement lsacLogo;

	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getlogo(){
		return lsacLogo;
	}

}
