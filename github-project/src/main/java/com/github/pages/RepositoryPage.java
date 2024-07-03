package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class RepositoryPage extends SeleniumBase {
	public RepositoryPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public boolean checkRepositoryName(String repoName) {
		return driver.findElement(By.linkText("")).isDisplayed();
	}

	public void clickSettings() {
		WebElement settings = driver.findElement(By.id("RepositoryPage.settings.id"));
		click(settings);
	}

}
