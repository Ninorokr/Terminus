package com.silverlink;

public class Municipalidad {

    //Datos ID
    private byte idMunicipalidad;
    private String nomMunicipalidad;
    private String dirMunicipalidad;
    private Distrito distrito;

    //Acceso web
    private String sitioWeb;
    private String usuario;
    private String contrasenia;

    //Adicionales
    private float precioTUPA;
    private byte plazoRespuesta;
    private String nomContacto;
    private String nroTelefono;
    private String correoContacto;
    private byte modIngreso;
    private boolean esPagoPresencial;
    private boolean esVirtual;
    private boolean requiereFisico;
    private boolean requiereFUT;
    private boolean requiereFirmaOriginal;
    private boolean requiereFirmaTodasHojas;
    private boolean requiereFoliado;
    private boolean requiereFoliadoEnReversa;
    private boolean requierePlanoEnA3;
    private boolean requiereImpresionAUnaCara;

    private boolean esAutomatico;

    public Municipalidad() { }

    public Municipalidad(byte idMunicipalidad, String nomMunicipalidad, String dirMunicipalidad, Distrito distrito, float precioTUPA, byte plazoRespuesta, byte modIngreso, boolean esPagoPresencial, boolean esVirtual, boolean requiereFisico, boolean requiereFUT, boolean requiereFirmaOriginal, boolean requiereFirmaTodasHojas, boolean requiereFoliado, boolean requiereFoliadoEnReversa, boolean requierePlanoEnA3, boolean requiereImpresionAUnaCara) {
        this.idMunicipalidad = idMunicipalidad;
        this.nomMunicipalidad = nomMunicipalidad;
        this.dirMunicipalidad = dirMunicipalidad;
        this.distrito = distrito;
        this.precioTUPA = precioTUPA;
        this.plazoRespuesta = plazoRespuesta;
        this.modIngreso = modIngreso;
        this.esPagoPresencial = esPagoPresencial;
        this.esVirtual = esVirtual;
        this.requiereFisico = requiereFisico;
        this.requiereFUT = requiereFUT;
        this.requiereFirmaOriginal = requiereFirmaOriginal;
        this.requiereFirmaTodasHojas = requiereFirmaTodasHojas;
        this.requiereFoliado = requiereFoliado;
        this.requiereFoliadoEnReversa = requiereFoliadoEnReversa;
        this.requierePlanoEnA3 = requierePlanoEnA3;
        this.requiereImpresionAUnaCara = requiereImpresionAUnaCara;
    }

    public byte getIdMunicipalidad() {
        return idMunicipalidad;
    }

    public void setIdMunicipalidad(byte idMunicipalidad) {
        this.idMunicipalidad = idMunicipalidad;
    }

    public String getNomMunicipalidad() {
        return nomMunicipalidad;
    }

    public void setNomMunicipalidad(String nomMunicipalidad) {
        this.nomMunicipalidad = nomMunicipalidad;
    }

    public String getDirMunicipalidad() {
        return dirMunicipalidad;
    }

    public void setDirMunicipalidad(String dirMunicipalidad) {
        this.dirMunicipalidad = dirMunicipalidad;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public float getPrecioTUPA() {
        return precioTUPA;
    }

    public void setPrecioTUPA(float precioTUPA) {
        this.precioTUPA = precioTUPA;
    }

    public byte getPlazoRespuesta() {
        return plazoRespuesta;
    }

    public void setPlazoRespuesta(byte plazoRespuesta) {
        this.plazoRespuesta = plazoRespuesta;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public byte getModIngreso() {
        return modIngreso;
    }

    public void setModIngreso(byte modIngreso) {
        this.modIngreso = modIngreso;
    }

    public boolean isEsPagoPresencial() {
        return esPagoPresencial;
    }

    public void setEsPagoPresencial(boolean esPagoPresencial) {
        this.esPagoPresencial = esPagoPresencial;
    }

    public boolean isEsVirtual() {
        return esVirtual;
    }

    public void setEsVirtual(boolean esVirtual) {
        this.esVirtual = esVirtual;
    }

    public boolean isRequiereFisico() {
        return requiereFisico;
    }

    public void setRequiereFisico(boolean requiereFisico) {
        this.requiereFisico = requiereFisico;
    }

    public boolean isRequiereFUT() {
        return requiereFUT;
    }

    public void setRequiereFUT(boolean requiereFUT) {
        this.requiereFUT = requiereFUT;
    }

    public boolean isRequiereFirmaOriginal() {
        return requiereFirmaOriginal;
    }

    public void setRequiereFirmaOriginal(boolean requiereFirmaOriginal) {
        this.requiereFirmaOriginal = requiereFirmaOriginal;
    }

    public boolean isRequiereFirmaTodasHojas() {
        return requiereFirmaTodasHojas;
    }

    public void setRequiereFirmaTodasHojas(boolean requiereFirmaTodasHojas) {
        this.requiereFirmaTodasHojas = requiereFirmaTodasHojas;
    }

    public boolean isRequiereFoliado() {
        return requiereFoliado;
    }

    public void setRequiereFoliado(boolean requiereFoliado) {
        this.requiereFoliado = requiereFoliado;
    }

    public boolean isRequiereFoliadoEnReversa() {
        return requiereFoliadoEnReversa;
    }

    public void setRequiereFoliadoEnReversa(boolean requiereFoliadoEnReversa) {
        this.requiereFoliadoEnReversa = requiereFoliadoEnReversa;
    }

    public boolean isRequierePlanoEnA3() {
        return requierePlanoEnA3;
    }

    public void setRequierePlanoEnA3(boolean requierePlanoEnA3) {
        this.requierePlanoEnA3 = requierePlanoEnA3;
    }

    public boolean isRequiereImpresionAUnaCara() {
        return requiereImpresionAUnaCara;
    }

    public void setRequiereImpresionAUnaCara(boolean requiereImpresionAUnaCara) {
        this.requiereImpresionAUnaCara = requiereImpresionAUnaCara;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }
}


