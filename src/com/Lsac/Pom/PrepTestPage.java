package com.Lsac.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lsac.Scripts.SuperTestNG;

public class PrepTestPage extends SuperTestNG {
	@FindBy(xpath="//a[contains(text(),'The Official LSAT PrepTest 71')]")
	private WebElement testlink;
	
	@FindBy(className="sectionHeader")
	private WebElement sectionHeader;
	
	public PrepTestPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTestLink(){
		return testlink;
	}
	
	public WebElement getsectionHeader(){
		return sectionHeader;
	}

}
