package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa una transacción en el sistema SongStock.
 */
public class Transaccion {
    private Usuario usuario;
    private List<Cancion> canciones;
    private List<Vinilo> vinilos;
    private float total;
    private String fecha; // Podrías usar una clase de fecha/hora más adecuada

    /**
     * Constructor de la clase Transaccion.
     *
     * @param usuario  El usuario que realiza la compra.
     * @param canciones Las canciones compradas.
     * @param vinilos Los vinilos comprados.
     * @param total   El total de la compra.
     */
    public Transaccion(Usuario usuario, List<Cancion> canciones, List<Vinilo> vinilos, float total) {
        this.usuario = usuario;
        this.canciones = canciones;
        this.vinilos = vinilos;
        this.total = total;
        this.fecha = java.time.LocalDate.now().toString(); // Asignar la fecha actual
    }

    /**
     * Método para registrar la transacción.
     */
    public void registrar() {
        // Lógica para registrar la transacción (por ejemplo, guardarla en una base de datos)
        System.out.println("Transacción registrada para el usuario: " + usuario.getNombre());
    }

    // Getters y Setters

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public List<Vinilo> getVinilos() {
        return vinilos;
    }

    public float getTotal() {
        return total;
    }

    public String getFecha() {
        return fecha;
    }
}