package org.grouptest;

import org.base.BaseClass;
import org.page.LoginFb;
import org.testng.annotations.Test;

public class A extends BaseClass {
@Test(groups="smoke")
private void testA1() {
	launchbrowser("edge");
System.out.println("...testA1..");
}
@Test(groups="sanity")
private void testA2() {
	launchbrowser("chrome");
	launchurl("https://www.google.com/");
}
@Test(groups="regression")
private void testA3() {
	launchbrowser("chrome");
	launchurl("https://www.facebook.com/");
  LoginFb l=new LoginFb() ;
  filltext(l.getpassword(), "741852");
  filltext(l.getUsername(), "muthuraj");
  btnclick(l.getlogin());


}











}
