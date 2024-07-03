package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class DashBoardPage extends SeleniumBase {
	public DashBoardPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public void clickNewRepository() {
		WebElement newRepo = driver.findElement(By.linkText(properties.getProperty("DashBoardPage.newRepo.linkText")));
		click(newRepo);
	}
}
