package lessonMentor15.Task2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class ExcelExporter {

    public static void exportToExcel(List<?> list, String filePath) throws IOException, IllegalAccessException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        Row headerRow = sheet.createRow(0);
        Object firstObject = list.get(0);
        Field[] fields = firstObject.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(fields[i].getName());
        }

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            Row dataRow = sheet.createRow(i + 1);

            for (int j = 0; j < fields.length; j++) {
                Field field = fields[j];
                Object value = field.get(obj);

                Cell cell = dataRow.createCell(j);
                if (value != null) {
                    cell.setCellValue(value.toString());
                }
            }
        }

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        }

        workbook.close();
        System.out.println("Excel export completed: " + filePath);
    }
}

