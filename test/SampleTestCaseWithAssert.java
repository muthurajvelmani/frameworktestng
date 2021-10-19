package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.Date;

import org.base.BaseClass;
import org.page.LoginFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTestCaseWithAssert extends BaseClass {
@BeforeClass
private void beforeclass() {
	launchbrowser("chrome");
	System.out.println("before class");
}
@AfterClass
private void afterclass() {
	System.out.println("after class"); 
}
@BeforeMethod
private void beforemethod() {
	System.out.println("test case start time"+new Date());
}
@AfterMethod
private void aftermethod() {
	System.out.println("test case end time"+new Date());
}
@Test(dataProvider="login")
private void test1() throws InterruptedException {
	launchurl("https://www.facebook.com/");
	LoginFb l=new LoginFb();
	SoftAssert s=new SoftAssert();
	Thread.sleep(5000);
	filltext(l.getUsername(),"muthurajvelmani@");
	AssertJUnit.assertEquals(getattribute(l.getUsername()),"muthurajvelmani@","verify username");
	filltext(l.getpassword(),"741852");
	AssertJUnit.assertEquals(getattribute(l.getpassword()),"74115","verify password");
	btnclick(l.getlogin());
	s.assertAll();
	System.out.println("test1");
}
@Test(priority=1,invocationCount=5)
private void test2() throws InterruptedException {
	launchurl("https://www.facebook.com/");
	LoginFb l=new LoginFb();
	SoftAssert s=new SoftAssert();
	Thread.sleep(5000);
	filltext(l.getUsername(),"muthurajvelmani@g.com");
	AssertJUnit.assertEquals(getattribute(l.getUsername()),"muthurajvelmani@g","verify username");
	filltext(l.getpassword(),"14122998");
	AssertJUnit.assertEquals(getattribute(l.getpassword()),"1419918","verify password");
	btnclick(l.getlogin());
	s.assertAll();
	System.out.println("test2");
}
@Test(priority=-1,invocationCount=10)
 private void test3() throws InterruptedException {
	launchurl("https://www.facebook.com/");
	LoginFb l=new LoginFb();
	SoftAssert s=new SoftAssert();
	Thread.sleep(5000);
	filltext(l.getUsername(),"muthurajvelmani");
	AssertJUnit.assertEquals(getattribute(l.getUsername()),"muthurajvelmani","verify username");
	filltext(l.getpassword(),"1419988");
	AssertJUnit.assertEquals(getattribute(l.getpassword()),"1419988","verify password");
	btnclick(l.getlogin());
	System.out.println("test3");
}
@DataProvider
private Object[][]getdata(){
	Object[][]p=new Object[][] {
		{"muthu","74185"},{"jhg","526"}
	};
		return p;	}
}
