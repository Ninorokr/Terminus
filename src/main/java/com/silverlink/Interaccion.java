package com.silverlink;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Interaccion {

    private int nroSolicitud;
    private int nroOrdenDeVenta;
    private int nroCuenta;
    private boolean usuario; //0 = ENEL; 1 = LSF //obtener este dato de una tabla? Overkill...
    private short tipoEvento; //TODO obtener datos de la tabla
    private LocalDate fecha; //Fecha que el usuario registró en el formulario
    private LocalTime hora;
    private short medioEnvio; //1 = FÍSICO | 2 = VIRTUAL | 3 = FÍSICO / VIRTUAL
    private LocalDateTime fechaActual; //Fecha en que el sistema registró la interacción
    private short nroCorrelativo;
    private String nroExpediente; //TODO Se puede colocar sólo números??
    private Distrito distrito;

}
