package com.silverlink;

public class Segmento {

    private byte idSegmento;
    private String nomSegmento;

    public Segmento() {

    }

    public Segmento(byte idSegmento, String nomSegmento) {
        this.idSegmento = idSegmento;
        this.nomSegmento = nomSegmento;
    }

    public byte getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(byte idSegmento) {
        this.idSegmento = idSegmento;
    }

    public String getNomSegmento() {
        return nomSegmento;
    }

    public void setNomSegmento(String nomSegmento) {
        this.nomSegmento = nomSegmento;
    }
}
