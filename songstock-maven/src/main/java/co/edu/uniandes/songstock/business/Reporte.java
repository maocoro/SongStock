package co.edu.uniandes.songstock.business;

import java.util.Date;
import java.util.List;

/**
 * Clase que representa un Reporte de ventas en el sistema SongStock.
 */
public class Reporte {
    private String idReporte;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Transaccion> transacciones;
    private String tipo;

    /**
     * M�todo para generar un reporte de ventas por g�nero.
     *
     * @param genero El g�nero del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por g�nero.
     */
    public Reporte generarReportePorGenero(String genero, Date fechaInicio, Date fechaFin) {
        // L�gica para generar el reporte de ventas por g�nero
        return null;
    }

    /**
     * M�todo para generar un reporte de ventas por artista.
     *
     * @param artista El artista del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por artista.
     */
    public Reporte generarReportePorArtista(String artista, Date fechaInicio, Date fechaFin) {
        // L�gica para generar el reporte de ventas por artista
        return null;
    }

    /**
     * M�todo para generar un reporte de ventas por regi�n.
     *
     * @param region La regi�n del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por regi�n.
     */
    public Reporte generarReportePorRegion(String region, Date fechaInicio, Date fechaFin) {
        // L�gica para generar el reporte de ventas por regi�n
        return null;
    }

}