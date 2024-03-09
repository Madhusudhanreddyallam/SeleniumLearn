package Utility;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOperations {

	private static final String excelPath = "src/test/java/Utility/prodigylabs_TestData.xlsx";

	public XSSFWorkbook getWorkbookInstance() {
		try(XSSFWorkbook workbook = new XSSFWorkbook(excelPath)) {	
			return workbook;
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return null;	
	}

	public XSSFSheet getSheetByName(String sheetName) {
		XSSFWorkbook workbook = getWorkbookInstance();
		XSSFSheet sheet = workbook.getSheet(sheetName);
		return sheet;
	}

	public XSSFSheet getSheetByIndex(int index) {
		XSSFWorkbook workbook = getWorkbookInstance();
		XSSFSheet sheet = workbook.getSheetAt(index);
		return sheet;
	}

	public String getCellValueAsString(Cell cell) {
		String cellValue;
		DataFormatter df = new DataFormatter ();
		switch(cell.getCellType()) {
		case STRING:
			cellValue = cell.getStringCellValue();
			break;
		case NUMERIC:
			cellValue = df.formatCellValue(cell);
			break;
		default :
			throw new RuntimeException("unsupported CellType");
		}

		return cellValue;

	}

	@Test
	public  void getExcelData() {
		HashMap<String, String> data = new HashMap<String, String> ();
		XSSFSheet sheet = getSheetByName("Contact");
		Row headerRow = sheet.getRow(0);
		Row dataRow = sheet.getRow(1);
		int lastColumn = headerRow.getLastCellNum();
		for(int i=0 ; i< lastColumn ; i++) {
			String key = getCellValueAsString(headerRow.getCell(i));
			String value = getCellValueAsString(dataRow.getCell(i));
			data.put(key , value);
		}

		data.forEach((k,v) -> {
			System.out.println(k + " = " + v);
		});

	}



}
