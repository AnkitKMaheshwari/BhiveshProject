package com.framework.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private By userName=By.id("Email");
	private By password=By.id("Passwd");
	private By click=By.id("signIn");
	private By checkLnk=By.xpath("//a[@id='link-signup']");
	private By clickCheckBox=By.id("PersistentCookie");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	public LoginPage enterUserName(String username){
		driver.findElement(userName).sendKeys(username);
		return new LoginPage(driver);
	}
	public LoginPage enterPassword(String paswrd){
		driver.findElement(password).sendKeys(paswrd);
		return new LoginPage(driver);
	}
	public LoginPage clickChckBox(){
		driver.findElement(clickCheckBox).click();
		return new LoginPage(driver);
	}
	public String checkLink(){
		String str=driver.findElement(checkLnk).getText();
		return str;
	}
	
	public HomePage clickLoginButton(){
		driver.findElement(click).click();
		return new HomePage(driver);
	}

}
