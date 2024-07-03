package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.base.SeleniumBase;

public class NewRepositoryPage extends SeleniumBase {
	public NewRepositoryPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public void enterNewRepositoryDetails(String repoName, String desc) {
		type(driver.findElement(By.id("NewRepositoryPage.repoName.id")), repoName);
		type(driver.findElement(By.id("NewRepositoryPage.repoDesc.id")), desc);
	}

	public boolean getSelectedRepoType() {
		return driver.findElement(By.id("NewRepositoryPage.public-RadioBtn.id")).isSelected();
	}

	public void clickCreateRepositoryBtn() {
		click(driver.findElement(By.xpath("NewRepositoryPage.createRepoBtn.XPath")));
	}
}
