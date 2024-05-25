package co.edu.uniandes.songstock.business;

import java.util.List;
import java.util.ArrayList;

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

    // Constructores
    public Vinilo() {
        this.canciones = new ArrayList<>();
    }

    public Vinilo(String idVinilo, String nombre, float precio, String artista, int anio, boolean disponible) {
        this.idVinilo = idVinilo;
        this.nombre = nombre;
        this.precio = precio;
        this.artista = artista;
        this.anio = anio;
        this.disponible = disponible;
        this.canciones = new ArrayList<>();
    }

    // Getters y setters
    public String getIdVinilo() {
        return idVinilo;
    }

    public void setIdVinilo(String idVinilo) {
        this.idVinilo = idVinilo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para agregar una canción al vinilo
    public void agregarCancion(Cancion cancion) {
        if (cancion != null) {
            canciones.add(cancion);
        }
    }

    // Método para quitar una canción del vinilo
    public void quitarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    // Método para actualizar la disponibilidad del vinilo
    public void actualizarDisponibilidad(boolean estado) {
        this.disponible = estado;
    }

    /**
     * Método para agregar un vinilo al carrito de compras.
     *
     * @param carrito El carrito de compras al que se agregará el vinilo.
     */
    public void agregarACarrito(Carrito carrito) {
        if (carrito != null && disponible) {
            carrito.agregarVinilo(this);
            System.out.println("Vinilo " + nombre + " agregado al carrito.");
        }
    }
}