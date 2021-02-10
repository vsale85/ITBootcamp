package automobil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainAutomobil {

	public static void main(String[] args) throws IOException {

		File file = new File("data/automobili.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Automobili");

		

		Automobil bmw = new Automobil("Bmw", "525d", 1234567891, "Sasa Vasiljevic");
		Automobil vw = new Automobil("VW", "Pasat", 1657007891, "Petar Petrovic");
		unosData(bmw, sheet);
		unosData(vw, sheet);
		wb.write(fos);
		
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wbRead = new XSSFWorkbook(fis);
		sheet = wbRead.getSheet("Automobili");
		
		ispisData(sheet);

		wb.close();
		fos.close();
		fis.close();
		// bmw.ispisAuto();
		// System.out.println("*******************************");
		// bmw.setVlasnik("Novi Vlasnik");
		// bmw.ispisAuto();
	}

	public static void unosData(Automobil auto, XSSFSheet sheet) throws IOException {

		XSSFRow red = sheet.createRow(sheet.getLastRowNum() + 1);
		XSSFCell marka = red.createCell(0);
		XSSFCell model = red.createCell(1);
		XSSFCell serijskiBroj = red.createCell(2);
		XSSFCell vlasnik = red.createCell(3);

		marka.setCellValue(auto.getMarka());
		model.setCellValue(auto.getModel());
		serijskiBroj.setCellValue(auto.getSerijskiBroj());
		vlasnik.setCellValue(auto.getVlasnik());

	}

	public static void ispisData(XSSFSheet sheet) {

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell marka = row.getCell(0);
			XSSFCell model = row.getCell(1);
			XSSFCell serijskiBroj = row.getCell(2);
			XSSFCell vlasnik = row.getCell(3);
			System.out.println(marka.getStringCellValue() + ", " + model.getStringCellValue() + ", " + (int)serijskiBroj.getNumericCellValue() + ", " + vlasnik.getStringCellValue());
		}
	}
}
