package GradleDemoProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelOperation {

	private static File file = new File("./resources/Reader.xlsx");
	private static FileInputStream fis;
	private static XSSFWorkbook wb;

	public static void main(String[] args) {
		
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("TestCase");
			int row = sheet.getLastRowNum();
			System.out.println(row);
			
			for(int i=1;i<=row;i++)
			{
				if(sheet.getRow(i).getCell(2).toString().equalsIgnoreCase("Yes"))
				{
					System.out.println(sheet.getRow(i).getCell(0).toString());
					System.out.println(sheet.getRow(i).getCell(2).toString());
					String tc=sheet.getRow(i).getCell(1).toString();
					executeTC(tc);
				}
			}
			wb.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	private static void executeTC(String tc) {
XSSFSheet tcSheet = wb.getSheet(tc);
System.out.println(tcSheet.getRow(0).getCell(0).toString());
		
	}

}
