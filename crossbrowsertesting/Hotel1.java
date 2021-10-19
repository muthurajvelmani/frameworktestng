package org.crossbrowsertesting;

import java.util.Date;

import javax.management.loading.PrivateClassLoader;

import org.base.BaseClass;
import org.page.HotelBookpage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hotel1 extends BaseClass {
	@Parameters({"browsername"})
	@BeforeClass
	private void beforeclass(String browser) {
		if(browser.equals("chrome")) {
			launchbrowser(browser);
		}
		else if(browser.equals("firefox")) {
			launchbrowser(browser);
		}
		else if(browser.equals("edge")) {
			launchbrowser(browser);
		}
		else {
			System.out.println(".....in valid browser name..");
		}
	}
		@AfterClass
		private void afterclass() {
			System.out.println("after class");
		}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("test start @ "+new Date());
	}
  @AfterMethod
private void aftermethod() {
	  System.out.println("test end @  "+new Date());
  }
  @Test
  private void test() throws InterruptedException {
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
		filltext(hb.getcheckin(), "10/10/2021");
		clear(hb.getcheckout());
		filltext(hb.getcheckout(), "10/10/2021");
		selectbyvalue(hb.getadultnumber(), "4");
		selectbyindex(hb.getchildnumber(), 0);
		btnclick(hb.getsubmit());
		btnclick(hb.getclickbutton());
		btnclick(hb.getclickcontinue());
		filltext(hb.getfirstname(), "Muthuraj");
		filltext(hb.getlastname(), "velmani");
		filltext(hb.getaddress(), "No:74,kkstreet,Guduvancheri-603202,Tn,India");
		filltext(hb.getccnumber(), "7412365498745236");
		selectbyindex(hb.getcctype(), 3);
		selectbyindex(hb.getccexpmonth(), 4);
		selectbyvalue(hb.getccexpyear(), "2022");
		filltext(hb.getcvv(), "123");
		btnclick(hb.getboook());
		
		System.out.println("test");
  }
}
