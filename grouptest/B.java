package org.grouptest;

import org.base.BaseClass;
import org.page.LoginFb;
import org.testng.annotations.Test;

public class B extends BaseClass{

	@Test(groups="smoke")
	private void testB1() {
		launchbrowser("edge");
	System.out.println("...testA1..");
	}
	@Test(groups="sanity")
	private void testB2() {
		launchbrowser("chrome");
		launchurl("https://www.google.com/");
	}
	@Test(groups="regression")
	private void testB3() {
		launchbrowser("chrome");
		launchurl("https://www.facebook.com/");
	  LoginFb l=new LoginFb() ;
	  filltext(l.getpassword(), "141998");
	  filltext(l.getUsername(), "muthurajvelmani@gmail.com");
	  btnclick(l.getlogin());


	}


}
