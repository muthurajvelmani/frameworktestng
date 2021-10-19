package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hoteltestcasewithdataprovider {
@Test(dataProvider="login")
private void testh1(String user,String pass,String datein,String dateout,String firstname,String lastname,String address,String ccnum,String cvv) {
	System.out.println(user);
   System.out.println(pass);
   System.out.println(datein);
   System.out.println(dateout);
   System.out.println(firstname);
   System.out.println(lastname);
   System.out.println(address);
   System.out.println(ccnum);
   System.out.println(cvv);
System.out.println("testh1");
}
@DataProvider(name="login")
private Object[][] getData(){
	Object[][] hotel=new Object[][] {
		{"muthurajvelmani","123456","20/10/2021","22/10/2021","muthuraj","v","chennai","7418529638527418","741"},
		{"muthurajvelmani","123456","21/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","22/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","15/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","17/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","13/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","19/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
		{"muthurajvelmani","123456","11/11/2021","22/11/2021","muthuraj","v","chennai","7418529688527418","741"},
	};
return  hotel;
}
}
