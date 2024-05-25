package co.edu.uniandes.songstock.business;

/**
 * Clase que representa una Canción en el sistema SongStock.
 */
public class Cancion {
    private String idCancion;
    private String nombre;
    private float precio;
    private String duracion;
    private float tamano;
    private int calidad;
    private String formato;
    private String artista;
    private boolean disponible;

    // Constructor
    public Cancion(String idCancion, String nombre, float precio, String duracion, float tamano, int calidad, String formato, String artista, boolean disponible) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tamano = tamano;
        this.calidad = calidad;
        this.formato = formato;
        this.artista = artista;
        this.disponible = disponible;
    }

    // Getters y setters
    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Método para agregar una canción al carrito de compras.
     *
     * @param carrito El carrito de compras al que se agregará la canción.
     */
    public void agregarACarrito(Carrito carrito) {
        if (this.disponible) {
            carrito.agregarCancion(this);
            System.out.println("Canción " + nombre + " agregada al carrito.");
        } else {
            System.out.println("Canción " + nombre + " no está disponible.");
        }
    }
}
