package utils.sec01_poi.part03_sheets;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.sec01_poi.ExcelUtils;

public class cloneSheetExample {

	public static void main(String[] args) {
		Workbook wb = null;
		try {
			// Workbook 생성
			// wb = (HSSFWorkbook) ExcelUtils.generateWorkBook(cloneSheetExample.class, "ExcelTemplate.xls");
			wb = (XSSFWorkbook) ExcelUtils.generateWorkBook(cloneSheetExample.class, "StorageTemplate.xlsx");
			
			// 월별 Sheet 생성
			Sheet[] sheets = ExcelUtils.copySheet(wb, 12, "월");
			
			//data 입력
			
			
			// 다운로드(저장)
			String fileName = ExcelUtils.getFileName(null, wb, true);
			FileOutputStream fos = new FileOutputStream(new File("E:\\utils\\poi\\excelTest", fileName));
			wb.write(fos);

			// resource close
			if (fos != null) {
				fos.close();
			}
			
			if (wb != null) {
				wb.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
