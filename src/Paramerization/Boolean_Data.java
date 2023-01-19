package Paramerization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_Data
{
public static void main(String[] args) throws Throwable 
{
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\Rupali\\\\Desktop\\\\selenium\\\\actiTime.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getBooleanCellValue();
	System.out.println(data);
}
}
