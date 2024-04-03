package utils.sec01_poi.part02_template;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.sec01_poi.ExcelUtils;

public class templateExample {

	public static void main(String[] args) {
		XSSFWorkbook wb = null;
		try {
			// Workbook 생성
			// wb = (XSSFWorkbook) ExcelUtils.generateWorkBook(templateExample.class, "ExcelTemplate.xls");
			wb = (XSSFWorkbook) ExcelUtils.generateWorkBook(templateExample.class, "StorageTemplate.xlsx");
			
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
