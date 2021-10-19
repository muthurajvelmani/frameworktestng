package org.dataproviderwithdatadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataproviderWithDataDrivn {
	public  static   Object[][] getData() throws IOException  {
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\MavenFrameWorkTestNg\\src\\test\\resources\\m1.xlsx");
		FileInputStream st=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(st);
		Sheet sh=w.getSheet("muthu1");
		Row r =sh.getRow(2);
		int rowcount=sh.getPhysicalNumberOfRows();
		int cellcount=r.getPhysicalNumberOfCells();
		Object[][] obj=new Object[rowcount][cellcount];
		for(int i=0;i<rowcount;i++) {
			Row row=sh.getRow(i);
		for(int j=0;j<cellcount;j++) {
			Cell cell=row.getCell(j);
			int type=cell.getCellType();
			String value =null;
			if(type==1) {
				value=cell.getStringCellValue();
			}
			else
			{
				if(DateUtil.isCellDateFormatted(cell)) {
					value=new SimpleDateFormat("dd-mm-yyyy").format(cell.getDateCellValue());
				}
			}
		obj[i][j]=value;
		}
		}
		return obj;
	}
@DataProvider(name="login")
private Object[][]data() throws IOException{
return getData();
}
@Test(dataProvider="login")
private void test1(String u,int p,String datein,String dateout,String firstname,String lastname,String address,long ccnum,int cvv) {
	System.out.println(u);
	System.out.println(p);
	System.out.println(datein);
	System.out.println(dateout);
    System.out.println(firstname);
    System.out.println(lastname);
    System.out.println(address);
    System.out.println(ccnum);
    System.out.println(cvv);
}
public static void main(String[] args) throws IOException  {
	Object[][]data=getData();
	System.out.println(data);
	System.out.println(data[4]);
	System.out.println(data[4][6]);
	for(Object[]x:data) {
		for(Object y:x) {
			System.out.println(y);
		}
	}

}
}
