package com.Lsac.Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Lsac.Pom.PrepTestPage;

public class OfficialLSATPrepEndtoEnd extends SuperTestNG{
	@Test
	public void OfficialLSATPrepEndtoEndTest(){
		//All locators will be sent in separate file
		PrepTestPage ptp = new PrepTestPage(fdriver);
		ptp.getTestLink().click();
		ptp.getsectionHeader().isDisplayed();
	}

}
