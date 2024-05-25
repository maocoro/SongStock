package co.edu.uniandes.songstock.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que representa el Catálogo de canciones y vinilos en el sistema SongStock.
 */
public class Catalogo {
    private String idCatalogo;
    private String nombre;
    private List<Cancion> canciones;
    private List<Vinilo> vinilos;

    public Catalogo(String idCatalogo, String nombre) {
        this.idCatalogo = idCatalogo;
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
        this.vinilos = new ArrayList<>();
    }

    // Métodos para agregar
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        System.out.println("Canción agregada al catálogo: " + cancion.getNombre());
    }

    public void agregarVinilo(Vinilo vinilo) {
        vinilos.add(vinilo);
        System.out.println("Vinilo agregado al catálogo: " + vinilo.getNombre());
    }

    // Métodos para eliminar
    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
        System.out.println("Canción eliminada del catálogo: " + cancion.getNombre());
    }

    public void eliminarVinilo(Vinilo vinilo) {
        vinilos.remove(vinilo);
        System.out.println("Vinilo eliminado del catálogo: " + vinilo.getNombre());
    }

    // Métodos para actualizar
    public void actualizarCancion(Cancion cancion) {
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getIdCancion().equals(cancion.getIdCancion())) {
                canciones.set(i, cancion);
                System.out.println("Canción actualizada en el catálogo: " + cancion.getNombre());
                return;
            }
        }
    }

    public void actualizarVinilo(Vinilo vinilo) {
        for (int i = 0; i < vinilos.size(); i++) {
            if (vinilos.get(i).getIdVinilo().equals(vinilo.getIdVinilo())) {
                vinilos.set(i, vinilo);
                System.out.println("Vinilo actualizado en el catálogo: " + vinilo.getNombre());
                return;
            }
        }
    }

    // Métodos para buscar
    public List<Cancion> buscarCanciones(String busqueda) {
        return canciones.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(busqueda.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Vinilo> buscarVinilos(String busqueda) {
        return vinilos.stream()
                .filter(v -> v.getNombre().toLowerCase().contains(busqueda.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Getters
    public List<Cancion> getCanciones() {
        return canciones;
    }

    public List<Vinilo> getVinilos() {
        return vinilos;
    }
}

