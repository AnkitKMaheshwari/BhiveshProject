package com.framework.project.classes;
import com.framework.project.util.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

import com.framework.project.util.Logs;

public class BaseTestClass {
	protected WebDriver driver;
	ReadPropertyFile rpf=new ReadPropertyFile();
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException{
		Logs.dynamicApp(System.getProperty("user.dir")+"\\src\\test\\resources\\Logs\\","gmail");
		driver=new FirefoxDriver();
		String gmailUrl=rpf.fetchUrl();
		driver.get(gmailUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
