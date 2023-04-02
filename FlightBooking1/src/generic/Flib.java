package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//read data from excel file
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowCount);
		Cell cell = rw.getCell(cellCount);
		String value = cell.getStringCellValue();
		return value;
	}

	//write data in excel file
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowCount);
		Cell cell = rw.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	//read data from property file
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;		
	}
	
	//get row count
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}

}
