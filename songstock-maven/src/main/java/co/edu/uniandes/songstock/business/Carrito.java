package co.edu.uniandes.songstock.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Carrito de compras en el sistema SongStock.
 */
public class Carrito {
    private List<Cancion> canciones;
    private List<Vinilo> vinilos;
    private Usuario usuario;

    // Constructor
    public Carrito(Usuario usuario) {
        this.canciones = new ArrayList<>();
        this.vinilos = new ArrayList<>();
        this.usuario = usuario;
    }

    // Métodos para agregar elementos al carrito
    public void agregarCancion(Cancion cancion) {
        if (cancion.isDisponible()) {
            canciones.add(cancion);
            System.out.println("Canción agregada al carrito: " + cancion.getNombre());
        } else {
            System.out.println("Canción no disponible: " + cancion.getNombre());
        }
    }

    public void agregarVinilo(Vinilo vinilo) {
        if (vinilo.isDisponible()) {
            vinilos.add(vinilo);
            System.out.println("Vinilo agregado al carrito: " + vinilo.getNombre());
        } else {
            System.out.println("Vinilo no disponible: " + vinilo.getNombre());
        }
    }

    // Método para calcular el total
    public double calcularTotal() {
        double total = 0;
        for (Cancion cancion : canciones) {
            total += cancion.getPrecio();
        }
        for (Vinilo vinilo : vinilos) {
            total += vinilo.getPrecio();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    // Método para realizar la compra
    public void realizarCompra() {
        if (canciones.isEmpty() && vinilos.isEmpty()) {
            System.out.println("El carrito está vacío. No se puede realizar la compra.");
            return;
        }

        // Implementar la lógica de la compra, como reducir el stock, registrar la transacción, etc.
        System.out.println("Compra realizada por: " + usuario.getNombre());
        System.out.println("Total a pagar: $" + calcularTotal());
        
        // Aquí se pueden implementar más detalles sobre la compra,
        // como registrar la transacción en una base de datos, etc.
        
        // Limpiar el carrito después de la compra
        canciones.clear();
        vinilos.clear();
        System.out.println("El carrito ha sido vaciado después de la compra.");
    }

    // Getters y Setters
    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public List<Vinilo> getVinilos() {
        return vinilos;
    }

    public void setVinilos(List<Vinilo> vinilos) {
        this.vinilos = vinilos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
