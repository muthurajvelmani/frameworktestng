package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.page.HotelBookpage;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HotelUser3 extends BaseClass{
	@BeforeClass
	public  void beforeclass() {
		System.out.println("before class");
		launchbrowser("chrome");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	@AfterClass
	public  void afterclass() {
		System.out.println("after class");}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("test starts"+new Date());
		System.out.println("before ");}
	@AfterMethod
	public  void aftermethod() {
		System.out.println("test ends"+new Date());
		System.out.println("after");}
	@Test(priority=2,invocationCount=5)
	public void test1() throws InterruptedException {
		launchurl("http://adactinhotelapp.com/");
		HotelBookpage hb=new HotelBookpage();
		SoftAssert s=new SoftAssert();
		filltext(hb.getusername(), "muthurajvelmani");
		Assert.assertEquals(getattribute(hb.getusername()), "muthurajvelmani","verify username");
		filltext(hb.getpassword(), "123456");
		AssertJUnit.assertEquals(getattribute(hb.getpassword()), "123456","verify password");
		btnclick(hb.getclicklogin());
		s.assertAll();
		System.out.println("test1");
}
	@Test(priority=1,invocationCount=1)
	public void test2() throws InterruptedException {
		launchurl("http://adactinhotelapp.com/");
		HotelBookpage hb=new HotelBookpage();
		SoftAssert s=new SoftAssert();
		Thread.sleep(5000);
		filltext(hb.getusername(), "muthurajvelmani");
		Assert.assertEquals(getattribute(hb.getusername()), "muthurajvelmani","verify username");
		filltext(hb.getpassword(), "123456");
		btnclick(hb.getclicklogin());
		selectbyvalue(hb.getlocation(), "New York");
		selectbyindex(hb.gethotelname(), 2);
		selectbyindex(hb.getroomtype(), 4);
		selectbyvalue(hb.getnumberofrooms(), "2");
		clear(hb.getcheckin());
		filltext(hb.getcheckin(), "01/10/2021");
		clear(hb.getcheckout());
		filltext(hb.getcheckout(), "03/10/2021");
		selectbyvalue(hb.getadultnumber(), "4");
		selectbyindex(hb.getchildnumber(), 0);
		btnclick(hb.getsubmit());
		btnclick(hb.getclickbutton());
		btnclick(hb.getclickcontinue());
		filltext(hb.getfirstname(), "Muthuraj");
		filltext(hb.getlastname(), "velmani");
		filltext(hb.getaddress(), "No:74,kkstreet,Guduvancheri-603202,Tn,India");
		filltext(hb.getccnumber(), "7412365498741236");
		selectbyindex(hb.getcctype(), 3);
		selectbyindex(hb.getccexpmonth(), 4);
		selectbyvalue(hb.getccexpyear(), "2022");
		filltext(hb.getcvv(), "123");
		btnclick(hb.getboook());
		
		System.out.println("test2");
}

}
