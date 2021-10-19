package org.screenshot;

import static org.testng.Assert.assertEquals;

import org.base.BaseClass;
import org.page.LoginFb;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Fbloginfailedscreenshot.class)
public class Fblogin  extends BaseClass{
@BeforeClass
private void beforeclass() {
	launchbrowser("edge");
	System.out.println("beforeclass");}
@AfterClass
private void afterclass() {
	System.out.println("afterclasss");}
@BeforeMethod
private void beforemethod() {
	System.out.println("beforemethod");}
@AfterMethod
private void aftermethod() {
	System.out.println("aftermethod");}
@Test
private void test1() {
	launchurl("https://www.facebook.com/?nocaa=1");
	LoginFb l=new LoginFb();
	filltext(l.getUsername(), "muthurajvelmani");
	assertEquals(false, true);}
@Test
private void test2() {
	launchurl("https://www.facebook.com/?nocaa=1");
    LoginFb k=new LoginFb();
    filltext(k.getUsername(),"muthuraj");

}
}
