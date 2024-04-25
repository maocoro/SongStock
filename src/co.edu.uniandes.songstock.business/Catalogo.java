package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa el Catálogo de canciones y vinilos en el sistema SongStock.
 */
public class Catalogo {
    private String idCatalogo;
    private String nombre;
    private List<Cancion> canciones;
    private List<Vinilo> vinilos;
    private List<Cancion> cancionesMP3;

    /**
     * Método para agregar una canción al catálogo.
     *
     * @param cancion La canción a agregar.
     */
    public void agregarCancion(Cancion cancion) {
        // Lógica para agregar una canción al catálogo
    }

    /**
     * Método para agregar un vinilo al catálogo.
     *
     * @param vinilo El vinilo a agregar.
     */
    public void agregarVinilo(Vinilo vinilo) {
        // Lógica para agregar un vinilo al catálogo
    }

    /**
     * Método para eliminar una canción del catálogo.
     *
     * @param cancion La canción a eliminar.
     */
    public void eliminarCancion(Cancion cancion) {
        // Lógica para eliminar una canción del catálogo
    }

    /**
     * Método para eliminar un vinilo del catálogo.
     *
     * @param vinilo El vinilo a eliminar.
     */
    public void eliminarVinilo(Vinilo vinilo) {
        // Lógica para eliminar un vinilo del catálogo
    }

    /**
     * Método para actualizar una canción en el catálogo.
     *
     * @param cancion La canción a actualizar.
     */
    public void actualizarCancion(Cancion cancion) {
        // Lógica para actualizar una canción en el catálogo
    }

    /**
     * Método para actualizar un vinilo en el catálogo.
     *
     * @param vinilo El vinilo a actualizar.
     */
    public void actualizarVinilo(Vinilo vinilo) {
        // Lógica para actualizar un vinilo en el catálogo
    }

    /**
     * Método para buscar canciones en el catálogo.
     *
     * @param busqueda El término de búsqueda.
     * @return Una lista de canciones que coinciden con la búsqueda hecha por el usuario.
     */
    public List<Cancion> buscarCanciones(String busqueda) {
        // Lógica para buscar canciones en el catálogo
        return null;
    }

    /**
     * Método para buscar vinilos en el catálogo.
     *
     * @param busqueda El término de búsqueda.
     * @return Una lista de vinilos que coinciden con la búsqueda.
     */
    public List<Vinilo> buscarVinilos(String busqueda) {
        // Lógica para buscar vinilos en el catálogo
        return null;
    }

}