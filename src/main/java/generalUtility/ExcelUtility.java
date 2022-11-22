package generalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/*
	 * { /*public void getDataFromExcel(String excelpath,String sheet,int row,int
	 * cell) { FileInputStream fis=null; try { fis = new FileInputStream(excelpath);
	 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } Workbook wb=null; try { wb =
	 * WorkbookFactory.create(fis); } catch (EncryptedDocumentException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } catch (IOException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } Sheet sheet1 =
	 * wb.getSheet(sheet); String data = new
	 * DataFormatter().formatCellValue(sheet1.getRow(row).getCell(cell)); }
	 * 
	 * }
	 */

	/**
	 * This class consist of all the common actions required for excel
	 * 
	 * @author Divya
	 */

//steps to start and continue the method part
//method syntax: access specifier modifier returntype methodName(parameter){}
//step1: accessspecifier:public,private,protected,default
//step2: modifer:static,non-static
//step3: returntype: primitive class type
//step4: methodname:follow camelcase give meaningfulname
//step5: parameter:optional and based on the type of arguments required or to be passed

//access specifier modifer returntype methodname(parameter){}
	/**
	 * This method is used to get the input sheet from excel and to get the row
	 * number and column number
	 * 
	 * @author DivyaSiddappa
	 * @param excelpath
	 * @param sheetname
	 * @param rownumber
	 * @param cellnumber
	 * @return
	 */
	Workbook wb = null;

	public String inputFile(String excelpath, String sheetname, int rownumber, int cellnumber) 
	{
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(excelpath);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetname);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rownumber).getCell(cellnumber));
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}
	/**
	 * 
	 * @author Divyasiddappa
	 * this method can be used to open the excel file only
	 * @param filepath
	 */
	
	
	public  void opentheexcelfile(String filepath)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * this particular method is used to get the exceldatabased on key
	 * @param pathtoexcelfile
	 * @param sheetname
	 * @param key
	 * @return
	 */
	

	public String excelbasedonkey(String pathtoexcelfile, String sheetname,String key)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(pathtoexcelfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetname);
		String value=null;
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			DataFormatter df = new DataFormatter();
			String requireddata = df.formatCellValue(sheet.getRow(i).getCell(0));
			if(requireddata.equalsIgnoreCase(key))
			{
				 value = df.formatCellValue(sheet.getRow(i).getCell(1));
				break;
			}
		}
		return value;
	}
	
	public void closetheexcel()
	{
		try
		{
			wb.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method consist of typecasting of the excel data this method can be used
	 * for numbers which is more than integer value
	 * 
	 * @author DivyaSiddappa
	 * @param rownumber
	 * @param cellnumber
	 * @param excelpath
	 * @param sheetname
	 * @return
	 */
	public int typecastingmethod(int rownumber, int cellnumber, String excelpath, String sheetname) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetname);
		//String Username = new DataFormatter().formatCellValue(sheet.getRow(rownumber).getCell(cellnumber));
		int username = (int) sheet.getRow(rownumber).getCell(cellnumber).getNumericCellValue();
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return username;
	}
	/**
	 * to fetch multiple data from excel
	 * @param sheetname 
	 * @return 
	 * 
	 * 
	 */
	public List<Map<String,String>> getdatafromexcel(String sheetname)
	{
		Sheet sheet = wb.getSheet(sheetname);
		List<Map<String,String>> list = new ArrayList<>();
		DataFormatter df = new DataFormatter();
		for(int k=1;k<sheet.getRow(0).getLastCellNum();k++)
		{
			Map<String,String> map = new HashMap<>();
			for(int i =0;i<sheet.getLastRowNum();i++)
			{
				map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(k)));
			}
			list.add(map);
		}
		return list;
	}
	public String[][] gettwodimensionaldata(String sheet_name)
	{
		Sheet sheet = wb.getSheet(sheet_name);
		DataFormatter data = new DataFormatter();
		String[][] str = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				str[i-1][j]= data.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		return str;
	}
	
	
	
	
	
}
