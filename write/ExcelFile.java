package file.read.write;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
public static void main(String[] args) throws IOException {
	String location = "C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\JUnitProject\\src\\test\\resources\\TestData\\file.xlsx";

	XSSFWorkbook wb = new XSSFWorkbook(location);
	XSSFSheet sheet = wb.getSheetAt(0);
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(1);
	String value = cell.getStringCellValue();
	System.out.println(value);
}
}
