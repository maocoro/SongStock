package co.edu.uniandes.songstock.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogoTest {

    private Catalogo catalogo;
    private Cancion cancion1;
    private Cancion cancion2;
    private Vinilo vinilo1;
    private Vinilo vinilo2;

    @BeforeEach
    public void setUp() {
        catalogo = new Catalogo("1", "Catálogo de Prueba");
        cancion1 = new Cancion("1", "Canción 1", 9.99f, "3:30", 5.0f, 320, "MP3", "Artista 1", true);
        cancion2 = new Cancion("2", "Canción 2", 12.99f, "4:00", 6.0f, 320, "MP3", "Artista 2", true);
        vinilo1 = new Vinilo("1", "Vinilo 1", 19.99f, "Artista 1", 2020, true);
        vinilo2 = new Vinilo("2", "Vinilo 2", 24.99f, "Artista 2", 2021, true);
    }

    @Test
    public void testAgregarCancion() {
        catalogo.agregarCancion(cancion1);
        assertTrue(catalogo.getCanciones().contains(cancion1));
    }

    @Test
    public void testAgregarVinilo() {
        catalogo.agregarVinilo(vinilo1);
        assertTrue(catalogo.getVinilos().contains(vinilo1));
    }

    @Test
    public void testEliminarCancion() {
        catalogo.agregarCancion(cancion1);
        catalogo.eliminarCancion(cancion1);
        assertFalse(catalogo.getCanciones().contains(cancion1));
    }

    @Test
    public void testEliminarVinilo() {
        catalogo.agregarVinilo(vinilo1);
        catalogo.eliminarVinilo(vinilo1);
        assertFalse(catalogo.getVinilos().contains(vinilo1));
    }

    @Test
    public void testActualizarCancion() {
        catalogo.agregarCancion(cancion1);
        Cancion cancionActualizada = new Cancion("1", "Canción Actualizada", 10.99f, "3:45", 5.5f, 320, "MP3", "Artista 1", true);
        catalogo.actualizarCancion(cancionActualizada);
        assertTrue(catalogo.getCanciones().contains(cancionActualizada));
        assertEquals("Canción Actualizada", catalogo.getCanciones().get(0).getNombre());
    }

    @Test
    public void testActualizarVinilo() {
        catalogo.agregarVinilo(vinilo1);
        Vinilo viniloActualizado = new Vinilo("1", "Vinilo Actualizado", 20.99f, "Artista 1", 2020, true);
        catalogo.actualizarVinilo(viniloActualizado);
        assertTrue(catalogo.getVinilos().contains(viniloActualizado));
        assertEquals("Vinilo Actualizado", catalogo.getVinilos().get(0).getNombre());
    }

    @Test
    public void testBuscarCanciones() {
        catalogo.agregarCancion(cancion1);
        catalogo.agregarCancion(cancion2);
        List<Cancion> resultados = catalogo.buscarCanciones("Canción 1");
        assertEquals(1, resultados.size());
        assertEquals("Canción 1", resultados.get(0).getNombre());
    }

    @Test
    public void testBuscarVinilos() {
        catalogo.agregarVinilo(vinilo1);
        catalogo.agregarVinilo(vinilo2);
        List<Vinilo> resultados = catalogo.buscarVinilos("Vinilo 1");
        assertEquals(1, resultados.size());
        assertEquals("Vinilo 1", resultados.get(0).getNombre());
    }
}

