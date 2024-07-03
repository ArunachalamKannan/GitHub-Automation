package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class SettingsPage extends SeleniumBase {
	public SettingsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public void clickDeleteThisRepo() {
		click(driver.findElement(By.xpath("SettingsPage.deletethisrepository.xpath")));
	}

}
