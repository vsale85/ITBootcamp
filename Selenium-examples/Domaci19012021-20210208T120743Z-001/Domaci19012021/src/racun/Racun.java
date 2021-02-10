package racun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Racun {
	private String brRacuna = "123AB45";
	private double stanje = 0.0;

	public Racun() {

	}

	public Racun(String brRacuna, double stanje) {

		this.brRacuna = brRacuna;
		this.stanje = stanje;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public String getBrRacuna() {

		return brRacuna;
	}

	// public double dodavanje(double plus) throws IOException {
	//
	// this.stanje += plus;
	// return stanje;
	// }
	public void dodavanje(double plus) throws IOException {
		File file = new File("data/racun.xlsx");
		FileInputStream fis = new FileInputStream(file);		
		XSSFWorkbook wbRead = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbRead.getSheet("Racun");
		
		
		XSSFRow red = sheet.getRow(0);
		XSSFCell broj = red.getCell(0);
		XSSFCell stanje = red.getCell(1);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream fos = new FileOutputStream(file);
		XSSFSheet list1 = wb.createSheet("Racun");
		
		XSSFRow row = list1.createRow(0);
		XSSFCell num = row.createCell(0);
		XSSFCell novoStanje = row.createCell(1);

		num.setCellValue(this.brRacuna);
		novoStanje.setCellValue(stanje.getNumericCellValue() + plus);
		wb.write(fos);
	}

	public void oduzimanje(double minus) throws IOException {
		File file = new File("data/racun.xlsx");
		FileInputStream fis = new FileInputStream(file);		
		XSSFWorkbook wbRead = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbRead.getSheet("Racun");
		
		
		XSSFRow red = sheet.getRow(0);
		XSSFCell broj = red.getCell(0);
		XSSFCell stanje = red.getCell(1);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream fos = new FileOutputStream(file);
		XSSFSheet list1 = wb.createSheet("Racun");
		
		XSSFRow row = list1.createRow(0);
		XSSFCell num = row.createCell(0);
		XSSFCell novoStanje = row.createCell(1);

		num.setCellValue(this.brRacuna);
		novoStanje.setCellValue(stanje.getNumericCellValue() - minus);
		wb.write(fos);
	}  

	public void ispisRacuna() throws IOException {
		File fajl = new File("data/racun.xlsx");
		FileInputStream fis = new FileInputStream(fajl);		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  	
		XSSFSheet sheet = wb.getSheet("Racun");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);
			XSSFCell brojRacuna = row.getCell(0);
			XSSFCell stanje = row.getCell(1);
			
			System.out.println(brojRacuna.getStringCellValue() + ", " + stanje.getNumericCellValue());
					
		}
	}

}
