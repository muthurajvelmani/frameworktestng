package org.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.InterruptedIOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.page.HotelBookpage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class HotelUser1 extends BaseClass{
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
		@Parameters({"username","password"})
		@Test
		public void test1(String username,String password) throws InterruptedException {
			launchurl("http://adactinhotelapp.com/");
			HotelBookpage hb=new HotelBookpage();
			SoftAssert s=new SoftAssert();
			filltext(hb.getusername(), username);
			Assert.assertEquals(getattribute(hb.getusername()), "muthurajvelmani","verify username");
		filltext(hb.getpassword(), password);
			btnclick(hb.getclicklogin());
			s.assertAll();
			System.out.println("test1");
		}
	@Parameters({"username","password","checkindate","checkoutdate","firstname","lastname","address","ccnumber","cvv"})
		@Test
		public void test2(String user,String pass,String checkin,String checkout,String firstname,String lastname,String address,String ccnumber,String cvv) throws InterruptedIOException {
			launchurl("http://adactinhotelapp.com/");
			HotelBookpage hb=new HotelBookpage();
			SoftAssert s=new SoftAssert();
			filltext(hb.getusername(), user);
			Assert.assertEquals(getattribute(hb.getusername()), "muthurajvelmani","verify username");
			filltext(hb.getpassword(),pass);
			btnclick(hb.getclicklogin());
			selectbyvalue(hb.getlocation(), "New York");
			selectbyindex(hb.gethotelname(), 2);
			selectbyindex(hb.getroomtype(), 4);
			selectbyvalue(hb.getnumberofrooms(), "2");
			clear(hb.getcheckin());
			filltext(hb.getcheckin(),checkin );
			clear(hb.getcheckout());
			filltext(hb.getcheckout(),checkout);
			selectbyvalue(hb.getadultnumber(), "4");
			selectbyindex(hb.getchildnumber(), 0);
			btnclick(hb.getsubmit());
			btnclick(hb.getclickbutton());
			btnclick(hb.getclickcontinue());
			filltext(hb.getfirstname(), firstname);
			filltext(hb.getlastname(), lastname);
			filltext(hb.getaddress(), address);
			filltext(hb.getccnumber(), ccnumber);
			selectbyindex(hb.getcctype(), 3);
			selectbyindex(hb.getccexpmonth(), 4);
			selectbyvalue(hb.getccexpyear(), "2022");
			filltext(hb.getcvv(),cvv);
			btnclick(hb.getboook());	
			System.out.println("test2");

	}
}
	

