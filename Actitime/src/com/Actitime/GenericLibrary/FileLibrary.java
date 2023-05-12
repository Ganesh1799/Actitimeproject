package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
	/**
	 * this is a generic method which is use to handle the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/cd.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * this is a generic method which is  use to read the data from Excel file
	 * @param sheetname
	 * @param r
	 * @param c
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readExcelFile(String sheetname,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/TD.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		String data = work.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
		return data;
	}
	/**
	 * this is a generic method which is used to update the data in Excel file
	 * @param sheetname
	 * @param r
	 * @param c
	 * @param name
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void updateExcelFile(String sheetname,int r,int c,String name) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/TD.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		work.getSheet(sheetname).getRow(r).getCell(c).setCellValue(name);
		FileOutputStream fos=new FileOutputStream("./Test data/TD.xlsx");
		work.write(fos);
	}
	/**
	 * 
	 * @param sheetname
	 * @param r
	 * @param c
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void readAllExcelfileData(String sheetname,int r,int c) throws EncryptedDocumentException, IOException{
		FileInputStream fou=new FileInputStream("./Testdata/TD.xlsx");
		Workbook work = WorkbookFactory.create(fou);
		int lrow = work.getSheet(sheetname).getLastRowNum();
		for (int i = 0; i <=lrow; i++) {
			short lcell = work.getSheet(sheetname).getRow(i).getLastCellNum();
			for (int j = 1; j <lcell; j++) {
				String alldata = work.getSheet(sheetname).getRow(i).getCell(j).getStringCellValue();
				System.out.print(alldata+"    ");
			}
			System.out.println();
		}
	}
}
