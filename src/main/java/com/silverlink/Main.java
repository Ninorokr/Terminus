package com.silverlink;

import java.util.ArrayList;
import java.util.Scanner;

import static com.silverlink.Querier.querySegmentos;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Segmento> segmentos;

    static {
        Datasource.open();
        segmentos = querySegmentos();
    }

//    public static void main(String[] args) { /*menuPrincipal();*/ }
    public static void main(String[] args) {
        ExtractorDatos extractor = new ExtractorDatos();
        extractor.extraerNuevasSVs("Z:\\Servicios ENEL\\002 - Permisos municipales\\Temp\\nuevasSV_Solicitudes.xlsx");
    }

//    public static void menuPrincipal(){
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("1 - Actualizar BD\n" +
//                    "2 - Asignar\n" +
//                    "3 - Descargar\n" +
//                    "4 - Publicar\n" +
//                    "5 - Exportar\n" +
//                    "6 - Ingresar otros docs a BD\n" +
//                    "9431 - Eliminar datos\n" +
//                    "9 - Salir");
//
//            switch (scanner.nextInt()) {
//                case 1: scanner.nextLine(); menuIngresarDatosABD(); break;
//                case 2: scanner.nextLine(); menuAsignar(); break;
//                case 3: scanner.nextLine(); menuDescargar(); break;
//                case 4: scanner.nextLine(); publicar(); break;
//                case 5: scanner.nextLine(); menuExportar(); break;
//                case 6: scanner.nextLine(); ingresarOtrosDocs(); break;
//                case 9431: scanner.nextLine(); menuEliminarDatos(); break;
//                case 9: System.exit(0);
//            }
//        }
//    }
}
