package comcast.vtiger.genericUtility2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.record.chart.DataFormatRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	/**
	 
	 * This method is used for fetch the data from excel
	 * @author Muneera
	 * */

	public String getDatatExcelsheet(String sheetName,int RowNum,int cellNum) throws Throwable
	{
			
    FileInputStream fis=new FileInputStream("./data/xlsheet.xlsx"); 
    Workbook book = WorkbookFactory.create(fis);
	Sheet sheet=book.getSheet(sheetName);
    Row row=sheet.getRow(RowNum);
	Cell cell=row.getCell(cellNum);
	String data=cell.getStringCellValue();
	return data;
    
    	
	//Dataformater
	//DataFormatter format=new DataFormatter();
	//return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(cellNum));
	
	}
}
