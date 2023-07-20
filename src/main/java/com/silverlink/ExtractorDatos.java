package com.silverlink;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.time.LocalDate;

import static com.silverlink.Main.scanner;

public class ExtractorDatos {

    public void extraerNuevasSVs(String rutaArchivo) {
        ZipSecureFile.setMinInflateRatio(0);

        String ruta = "Z:\\Servicios ENEL\\002 - Permisos municipales\\Temp\\nuevasSV_Solicitudes.xlsx";

        try(XSSFWorkbook wb = new XSSFWorkbook(ruta)) {
            XSSFSheet sheet = wb.getSheetAt(0);
            SolicitudVenta sv = new SolicitudVenta();

            System.out.println(sheet.getRow(5182).getCell(0).getCellType());

            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row.getCell(0).getCellType() == CellType.BLANK)
                    continue;
                for (int j = 0; j < 18; j++) {
                    XSSFCell cell = row.getCell(j);
                    switch(j){
                        case 0: sv.setNroSolicitud(Integer.parseInt(getCellValueAsString(cell))); break;
                        case 1: sv.setNroOrdenVenta(Integer.parseInt(getCellValueAsString(cell))); break;
                        case 2: sv.setNroCuenta(Integer.parseInt(getCellValueAsString(cell))); break;
                        case 3: sv.setFecPagoSolicitud(cell.getLocalDateTimeCellValue().toLocalDate()); break;
                        case 4: sv.setIdSegmento(getCellValueAsString(cell)); break;
                    }
                }
            }



        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("¿Salir?");
            scanner.nextLine();
        }
    }

    public static String getCellValueAsString(XSSFCell cell){
        CellType type = cell.getCellType();
        try{
            switch(type){
                case BLANK: break;
                case ERROR: return cell.getErrorCellString();
                case STRING: return cell.getStringCellValue();
                case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
                case FORMULA: return cell.getCellFormula();
                case NUMERIC: return String.valueOf((int)(cell.getNumericCellValue()));
            }
        } catch (IllegalStateException ise){
            ise.printStackTrace();
        }
        return null;
    }

}
