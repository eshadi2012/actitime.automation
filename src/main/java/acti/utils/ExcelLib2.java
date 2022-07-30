package acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Name:Excel Helper class
 * Developed by: Arith
 * Approved by: dekha
 * Last Modified Date: 7/26/2022
 * Description : used to fetch the data from excel sheet
 */


public class ExcelLib2 {
	
	XSSFWorkbook wb;
	
	   //this constructor is used to load the excel file
		public ExcelLib2(String excelPath) {
			
			
			try {
				File file = new File(excelPath);
				FileInputStream fis = new FileInputStream(file);
				wb = new XSSFWorkbook(fis);

			} 
			catch (Exception e)
			{
				System.out.println("please check unable to load the excel file "+e.getMessage());

			}

		}
		
		//this method return the active number of the rows
		public int getRowCount(int sheetname)
		{
			return wb.getSheetAt(sheetname).getLastRowNum()+1;
		}
		public int getRowCount(String sheetname)
		{
			return wb.getSheet(sheetname).getLastRowNum()+1;
		}
		
		
		//this method is using to get the cell data by using sheet index
		public String getCellData(int sheetname, int row, int col) 
		{
			return wb.getSheetAt(sheetname).getRow(row).getCell(col).toString();

		}
		
		//this method is using to get the cell data by using sheet name 
		public String getCellData(String sheetname,int row, int col)
		{
			return wb.getSheet(sheetname).getRow(row).getCell(col).toString();
		}

}
