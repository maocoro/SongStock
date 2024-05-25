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
     * Método para generar un reporte de ventas por género.
     *
     * @param genero El género del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por género.
     */
    public Reporte generarReportePorGenero(String genero, Date fechaInicio, Date fechaFin) {
        // Lógica para generar el reporte de ventas por género
        return null;
    }

    /**
     * Método para generar un reporte de ventas por artista.
     *
     * @param artista El artista del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por artista.
     */
    public Reporte generarReportePorArtista(String artista, Date fechaInicio, Date fechaFin) {
        // Lógica para generar el reporte de ventas por artista
        return null;
    }

    /**
     * Método para generar un reporte de ventas por región.
     *
     * @param region La región del reporte.
     * @param fechaInicio La fecha de inicio del rango del reporte.
     * @param fechaFin La fecha de fin del rango del reporte.
     * @return El reporte de ventas por región.
     */
    public Reporte generarReportePorRegion(String region, Date fechaInicio, Date fechaFin) {
        // Lógica para generar el reporte de ventas por región
        return null;
    }

}