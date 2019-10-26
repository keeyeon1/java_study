package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {
	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("exce.lxls");

		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		Cell cell = sh.getCell(0,0);
		String con = cell.getContents();
		System.out.println(con);
	}
}
