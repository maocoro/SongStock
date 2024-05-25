package co.edu.uniandes.songstock.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    private Usuario usuario;
    private Cancion cancion;
    private Vinilo vinilo;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("1", "Malcom Andres Paz", "password1234", "malcomAnP@example.com");
        cancion = new Cancion("1", "Canción 1", 10.99f, "3:45", 4.5f, 320, "MP3", "Artista 1", true);
        vinilo = new Vinilo("1", "Vinilo 1", 20.99f, "Artista 1", 2020, true);
    }

    @Test
    public void testAgregarCancionDisponible() {
        Carrito carrito = new Carrito(usuario);
        carrito.agregarCancion(cancion);
        assertTrue(carrito.getCanciones().contains(cancion), "La canción debería estar en el carrito.");
    }

    @Test
    public void testAgregarViniloCantidadDisponible() {
        Carrito carrito = new Carrito(usuario);
        carrito.agregarVinilo(vinilo);
        assertTrue(carrito.getVinilos().contains(vinilo), "El vinilo debería estar en el carrito.");
    }

    @Test
    public void testCalcularTotal() {
        Carrito carrito = new Carrito(usuario);
        carrito.agregarCancion(cancion);
        carrito.agregarVinilo(vinilo);
        double total = carrito.calcularTotal();
        assertEquals(31.98, total, 0.01, "El total del carrito debería ser 29.98.");
    }

    @Test
    public void testRealizarCompra() {
        Carrito carrito = new Carrito(usuario);
        carrito.agregarCancion(cancion);
        carrito.agregarVinilo(vinilo);
        carrito.realizarCompra();
        
        assertTrue(carrito.getCanciones().isEmpty(), "El carrito debería estar vacío después de la compra.");
        assertTrue(carrito.getVinilos().isEmpty(), "El carrito debería estar vacío después de la compra.");
    }

    @Test
    public void testAgregarCancionNoDisponible() {
        Cancion cancionNoDisponible = new Cancion("2", "Canción #2", 9.99f, "4:00", 5.0f, 320, "MP3", "Artista 2", false);
        Carrito carrito = new Carrito(usuario);
        carrito.agregarCancion(cancionNoDisponible);
        assertFalse(carrito.getCanciones().contains(cancionNoDisponible), "La canción no disponible no debería estar en el carrito.");
    }

    @Test
    public void testAgregarViniloNoDisponible() {
        Vinilo viniloNoDisponible = new Vinilo("2", "Vinilo 2", 19.99f, "Artista 2", 2021, false);
        Carrito carrito = new Carrito(usuario);
        carrito.agregarVinilo(viniloNoDisponible);
        assertFalse(carrito.getVinilos().contains(viniloNoDisponible), "El vinilo no disponible no debería estar en el carrito.");
    }
}




