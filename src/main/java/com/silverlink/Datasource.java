package com.silverlink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {

    public static Connection conn;

    public static void open() {

        String connURL = "jdbc:sqlserver://192.168.1.2\\SQLS19;" +
                "database=TEST;" +
                "user=sa;" +
                "password=Usuari0LSF;" +
                "encrypt=true;" +
                "trustServerCertificate=true;";

        //    String connURL = "jdbc:sqlserver://SILVERLINK\\SQLEXPRESS;" +
//            "database=TEST;" +
//            "user=ninorokr;" +
//            "password=vecomamak;" +
//            "encrypt=true;" +
//            "trustServerCertificate=true;";

        try {
            conn = DriverManager.getConnection(connURL);
            System.out.println("Conectado");
        } catch (SQLException sqle) {
            System.out.println("No se pudo conectar a la BD");
            sqle.printStackTrace();
        }
    }

//    public void close() {
//        try {
//            if (conn != null) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("No se pudo cerrar la conexión :?");
//        }
//    }
}
