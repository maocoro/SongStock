package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa un Vinilo en el sistema SongStock.
 */
public class Vinilo {
    private String idVinilo;
    private String nombre;
    private List<Cancion> canciones;
    private float precio;
    private String artista;
    private int anio;
    private boolean disponible;

    /**
     * Método para agregar un vinilo al carrito de compras.
     *
     * @param carrito El carrito de compras al que se agregará el vinilo.
     */
    public void agregarACarrito(Carrito carrito) {
        // Lógica para agregar el vinilo al carrito de compras
    }

    
}