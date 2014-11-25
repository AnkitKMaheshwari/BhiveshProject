package com.framework.project.util;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Excel {
	private FileInputStream file;
	 private HSSFWorkbook workbook;
	 private HSSFSheet sheet;
	 private HSSFCell cell;
	 private DataFormatter formatter;
	 
	 
	  public void setExcel(String path,String sheetName) throws Exception
	  {
		  file=new FileInputStream(path);
		  workbook=new HSSFWorkbook(file);
		  sheet=workbook.getSheet(sheetName);
		  
	  }
		public String getCellValue(int row,int col)
		{
			
			cell=sheet.getRow(row).getCell(col);
			formatter=new DataFormatter();
			return formatter.formatCellValue(cell);
		}
		
//		@Test
//		 public void mac() throws Exception
//		 {
//			 Excel ex=new Excel();
//			 ex.setExcel("D:\\Book1.xls","Sheet1");
//			 System.out.print(ex.getCellValue(1,1));
//			 
//			 
//		 }
		}



