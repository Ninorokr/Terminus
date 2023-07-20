package com.silverlink;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.silverlink.Datasource.conn;

public class Querier {

    public static ArrayList<Distrito> queryDistritosLimaYCallao() {
        String distritosQuery = "SELECT idDepartamento, idDistrito, nomDistrito FROM tblDistritos" +
                "WHERE (idDepartamento = 15 OR id Departamento = 7) AND idProvincia = 1";

        ArrayList<Distrito> distritos = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(distritosQuery)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                distritos.add(new Distrito(rs.getByte(1), rs.getByte(2),  rs.getString(3)));
            }
        } catch (SQLException sqle) {
            System.out.println("No se pudo consultar los distritos");
            sqle.printStackTrace();
        }

        return distritos;
    }

    public static ArrayList<Segmento> querySegmentos() {
        String segmentosQuery = "SELECT idSegmento, nomSegmento FROM pm.Segmento";

        ArrayList<Segmento> segmentos = new ArrayList<>();
        try(PreparedStatement ps = conn.prepareStatement(segmentosQuery)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                segmentos.add(new Segmento(rs.getByte(1), rs.getString(2)));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return segmentos;
    }

}
