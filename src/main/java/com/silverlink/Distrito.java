package com.silverlink;

public class Distrito {

    private byte idDepartamento;
    private byte idDistrito;
    private String nomDistrito;

    public Distrito(){

    }

    public Distrito(byte idDepartamento, byte idDistrito, String nomDistrito) {
        this.idDepartamento = idDepartamento;
        this.idDistrito = idDistrito;
        this.nomDistrito = nomDistrito;
    }

    public byte getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(byte idDepartamento) { this.idDepartamento = idDepartamento; }
    public byte getIdDistrito() { return idDistrito; }
    public void setIdDistrito(byte idDistrito) { this.idDistrito = idDistrito; }
    public String getNomDistrito() { return nomDistrito; }
    public void setNomDistrito(String nomDistrito) { this.nomDistrito = nomDistrito; }
}
