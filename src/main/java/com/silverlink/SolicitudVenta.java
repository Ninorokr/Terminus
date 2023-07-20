package com.silverlink;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.silverlink.Main.segmentos;

public class SolicitudVenta {

    //Datos ID
    private byte anio;
    private short nroOS;
    private short idSolicitud;

    //Datos SV
    private int nroSolicitud;
    private int nroOrdenVenta;
    private int nroCuenta;
    private LocalDate fecPagoSolicitud;
    private byte idSegmento;
    private byte idMunicipalidad;
    private boolean estaParalizado;
    private boolean enviadoAContratista;
    private boolean esViaMetropolitana;
    private boolean requiereOpinionTecnica;

    private String dependencias;

    private byte idSuperEstado;
    private byte idEstado;
    private LocalDateTime fecIngreso;
    private LocalDateTime fecFirmado;
    private LocalDate fecIngresoMuni;
    private LocalDateTime fecDescargado; //Fecha en que el cargo regresa a oficina
    private LocalDateTime fecUltimaSubsanacion; //Fecha en que se levanta la observacion y se corrige la carta
    private LocalDate fecAutorizado;
    private LocalDate fecInicioAuto;
    private LocalDate fecFinAuto;

    private short nroPaginas;
    private LocalDate fecEmision;
    private String nomSolicitante;
    private String direccion;
    private byte idContratista;
    private String nomIngResponsable;
    private String cipIngResponsable;
    private byte areaRotura;
    private boolean esAerea;
    private int nroAtComercial;
    private long nroOrden;

    public SolicitudVenta() { }

    public byte getAnio() {
        return anio;
    }

    public void setAnio(byte anio) {
        this.anio = anio;
    }

    public short getNroOS() {
        return nroOS;
    }

    public void setNroOS(short nroOS) {
        this.nroOS = nroOS;
    }

    public short getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(short idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(int nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    public int getNroOrdenVenta() {
        return nroOrdenVenta;
    }

    public void setNroOrdenVenta(int nroOrdenVenta) {
        this.nroOrdenVenta = nroOrdenVenta;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public LocalDate getFecPagoSolicitud() {
        return fecPagoSolicitud;
    }

    public void setFecPagoSolicitud(LocalDate fecPagoSolicitud) {
        this.fecPagoSolicitud = fecPagoSolicitud;
    }

    public byte getIdSegmento() {
        return idSegmento;
    }

    public void setIdSegmento(byte idSegmento) {
        this.idSegmento = idSegmento;
    }

    public void setIdSegmento(String nomSegmento) {
        for(Segmento segmento : segmentos) {
            if(segmento.getNomSegmento().equalsIgnoreCase(nomSegmento))
                this.idSegmento = segmento.getIdSegmento();
        }

    }

    public byte getIdMunicipalidad() {
        return idMunicipalidad;
    }

    public void setIdMunicipalidad(byte idMunicipalidad) {
        this.idMunicipalidad = idMunicipalidad;
    }

    public boolean isEstaParalizado() {
        return estaParalizado;
    }

    public void setEstaParalizado(boolean estaParalizado) {
        this.estaParalizado = estaParalizado;
    }

    public boolean isEnviadoAContratista() {
        return enviadoAContratista;
    }

    public void setEnviadoAContratista(boolean enviadoAContratista) {
        this.enviadoAContratista = enviadoAContratista;
    }

    public boolean isEsViaMetropolitana() {
        return esViaMetropolitana;
    }

    public void setEsViaMetropolitana(boolean esViaMetropolitana) {
        this.esViaMetropolitana = esViaMetropolitana;
    }

    public boolean isRequiereOpinionTecnica() {
        return requiereOpinionTecnica;
    }

    public void setRequiereOpinionTecnica(boolean requiereOpinionTecnica) {
        this.requiereOpinionTecnica = requiereOpinionTecnica;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }

    public byte getIdSuperEstado() {
        return idSuperEstado;
    }

    public void setIdSuperEstado(byte idSuperEstado) {
        this.idSuperEstado = idSuperEstado;
    }

    public byte getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(byte idEstado) {
        this.idEstado = idEstado;
    }

    public LocalDateTime getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(LocalDateTime fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public LocalDateTime getFecFirmado() {
        return fecFirmado;
    }

    public void setFecFirmado(LocalDateTime fecFirmado) {
        this.fecFirmado = fecFirmado;
    }

    public LocalDate getFecIngresoMuni() {
        return fecIngresoMuni;
    }

    public void setFecIngresoMuni(LocalDate fecIngresoMuni) {
        this.fecIngresoMuni = fecIngresoMuni;
    }

    public LocalDateTime getFecDescargado() {
        return fecDescargado;
    }

    public void setFecDescargado(LocalDateTime fecDescargado) {
        this.fecDescargado = fecDescargado;
    }

    public LocalDateTime getFecUltimaSubsanacion() {
        return fecUltimaSubsanacion;
    }

    public void setFecUltimaSubsanacion(LocalDateTime fecUltimaSubsanacion) {
        this.fecUltimaSubsanacion = fecUltimaSubsanacion;
    }

    public LocalDate getFecAutorizado() {
        return fecAutorizado;
    }

    public void setFecAutorizado(LocalDate fecAutorizado) {
        this.fecAutorizado = fecAutorizado;
    }

    public LocalDate getFecInicioAuto() {
        return fecInicioAuto;
    }

    public void setFecInicioAuto(LocalDate fecInicioAuto) {
        this.fecInicioAuto = fecInicioAuto;
    }

    public LocalDate getFecFinAuto() {
        return fecFinAuto;
    }

    public void setFecFinAuto(LocalDate fecFinAuto) {
        this.fecFinAuto = fecFinAuto;
    }

    public short getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(short nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public LocalDate getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(LocalDate fecEmision) {
        this.fecEmision = fecEmision;
    }

    public String getNomSolicitante() {
        return nomSolicitante;
    }

    public void setNomSolicitante(String nomSolicitante) {
        this.nomSolicitante = nomSolicitante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte getIdContratista() {
        return idContratista;
    }

    public void setIdContratista(byte idContratista) {
        this.idContratista = idContratista;
    }

    public String getNomIngResponsable() {
        return nomIngResponsable;
    }

    public void setNomIngResponsable(String nomIngResponsable) {
        this.nomIngResponsable = nomIngResponsable;
    }

    public String getCipIngResponsable() {
        return cipIngResponsable;
    }

    public void setCipIngResponsable(String cipIngResponsable) {
        this.cipIngResponsable = cipIngResponsable;
    }

    public byte getAreaRotura() {
        return areaRotura;
    }

    public void setAreaRotura(byte areaRotura) {
        this.areaRotura = areaRotura;
    }

    public boolean isEsAerea() {
        return esAerea;
    }

    public void setEsAerea(boolean esAerea) {
        this.esAerea = esAerea;
    }

    public int getNroAtComercial() {
        return nroAtComercial;
    }

    public void setNroAtComercial(int nroAtComercial) {
        this.nroAtComercial = nroAtComercial;
    }

    public long getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(long nroOrden) {
        this.nroOrden = nroOrden;
    }
}
