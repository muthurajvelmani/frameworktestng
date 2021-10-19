package org.test;

import org.base.BaseClass;
import org.page.HotelBookpage;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseWithDataProvider extends BaseClass {
	@Test(dataProvider="login",dataProviderClass=Hoteltestcasewithdataprovider.class)
	private void test1(String user,String pass,String datein,String dateout,String firstname,String lastname,String address,String ccnum,String cvv) throws InterruptedException {
		launchbrowser("chrome");
		Thread.sleep(2000);
	launchurl("http://adactinhotelapp.com/");
	HotelBookpage hb=new HotelBookpage();
	filltext(hb.getusername(), user);
	filltext(hb.getpassword(), pass);
	btnclick(hb.getclicklogin());
	selectbyvalue(hb.getlocation(), "New York");
	selectbyindex(hb.gethotelname(), 2);
	selectbyindex(hb.getroomtype(), 4);
	selectbyvalue(hb.getnumberofrooms(), "2");
	clear(hb.getcheckin());
	filltext(hb.getcheckin(), datein);
	clear(hb.getcheckout());
	filltext(hb.getcheckout(), dateout);
	selectbyvalue(hb.getadultnumber(), "4");
	selectbyindex(hb.getchildnumber(), 0);
	btnclick(hb.getsubmit());
	btnclick(hb.getclickbutton());
	btnclick(hb.getclickcontinue());
	filltext(hb.getfirstname(), firstname);
	filltext(hb.getlastname(), lastname);
	filltext(hb.getaddress(), address);
	filltext(hb.getccnumber(), ccnum);
	selectbyindex(hb.getcctype(), 3);
	selectbyindex(hb.getccexpmonth(), 4);
	selectbyvalue(hb.getccexpyear(), "2022");
	filltext(hb.getcvv(), cvv);
	btnclick(hb.getboook());
	

}
}