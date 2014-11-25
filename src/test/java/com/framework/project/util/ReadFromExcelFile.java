package com.framework.project.util;

public class ReadFromExcelFile{
		
		    public String user() throws Exception{
		    	Excel ex=new Excel();
				ex.setExcel("src/test/resources/Data/Book2.xls","sheet1");
		    String usnm=ex.getCellValue(1,0);
		    return usnm;
		    
		    }
		    public String paswrd() throws Exception{
		    	Excel ex=new Excel();
				ex.setExcel("src/test/resources/Data/Book2.xls","sheet1");
		    String paswd=ex.getCellValue(1,1);
		    return paswd;
		}
}
			
		
		


	 
	 


