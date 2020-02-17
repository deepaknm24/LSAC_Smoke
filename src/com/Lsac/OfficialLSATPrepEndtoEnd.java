package com.Lsac;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OfficialLSATPrepEndtoEnd extends SuperTestNG{
	@Test
	public void OfficialLSATPrepEndtoEndTest(){
		//All locators will be sent in separate file
		driver.findElement(By.xpath("//a[contains(text(),'The Official LSAT PrepTest 71')]")).click();
		driver.findElement(By.className("sectionHeader")).isDisplayed();
	}

}
