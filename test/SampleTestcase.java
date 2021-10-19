package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.base.BaseClass;
import org.page.LoginFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestcase extends BaseClass {
@BeforeClass
public void beforeclass() {
	launchbrowser("edge");
	System.out.println("before test");
}
	@AfterClass
	public void afterclass() {
	
		System.out.println("after classs");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@Test
	public void test1() {
		launchurl("https://www.facebook.com/");
		System.out.println("test1");
	}
@Test(priority=2)
public void test2() {
	launchurl("https://www.google.com/");
	System.out.println("test2");
}
@Test(priority=1)
public void test3() {
	launchurl("https://www.facebook.com/");
	LoginFb fb=new LoginFb();
    filltext(fb.getUsername(),"muthurajvelmani");
}
	
}
