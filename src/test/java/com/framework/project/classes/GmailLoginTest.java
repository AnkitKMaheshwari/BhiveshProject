package com.framework.project.classes;

//import junit.framework.Assert;

import org.testng.annotations.Test;

import com.framework.project.pages.HomePage;
import com.framework.project.pages.LoginPage;
import com.framework.project.util.Logs;
import com.framework.project.util.ReadFromExcelFile;

import com.framework.project.util.ScreenShots;

public class GmailLoginTest extends BaseTestClass {
	LoginPage login;
	HomePage home;
	
        @Test
       public void gmailTest() throws Exception
       {
        	Thread.sleep(3000);
        	login=new LoginPage(driver);
        	Logs.start("gmailTest");
        	ReadFromExcelFile rfef=new ReadFromExcelFile();
        	String username=rfef.user();
        	login.enterUserName(username);
        	String password=rfef.paswrd();
        	//Logs.info();
        	login.enterPassword(password);
        	Logs.info("password entered");
        	String s=login.checkLink();
        	//Logs.start("gmailTest");
        	Logs.info(s);
        	//login.clickChckBox();
            ScreenShots.screenshots(driver);
        	home=login.clickLoginButton();
        	Logs.end();
        	//String s1=home.mthd();
        	//home.secondMailDelete();
        	//Assert.assertEquals(s1,"21");
        	
       }
}
