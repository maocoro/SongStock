package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa el Carrito de compras en el sistema SongStock.
 */
public class Carrito {
    private List<Cancion> canciones;
    private List<Vinilo> vinilos;
    private float total;
    private Usuario usuario;

    /**
     * Método para agregar una canción al carrito de compras.
     *
     * @param cancion La canción a agregar.
     */
    public void agregarCancion(Cancion cancion) {
        // Lógica para agregar una canción al carrito
    }

    /**
     * Método para agregar un vinilo al carrito de compras.
     *
     * @param vinilo El vinilo a agregar.
     */
    public void agregarVinilo(Vinilo vinilo) {
        // Lógica para agregar un vinilo al carrito
    }

    /**
     * Método para eliminar una canción del carrito de compras.
     *
     * @param cancion La canción a eliminar.
     */
    public void eliminarCancion(Cancion cancion) {
        // Lógica para eliminar una canción del carrito
    }

    /**
     * Método para eliminar un vinilo del carrito de compras.
     *
     * @param vinilo El vinilo a eliminar.
     */
    public void eliminarVinilo(Vinilo vinilo) {
        // Lógica para eliminar un vinilo del carrito
    }

    /**
     * Método para realizar la compra de los productos en el carrito.
     */
    public void realizarCompra() {
        // Lógica para realizar la compra de los productos
    }

}