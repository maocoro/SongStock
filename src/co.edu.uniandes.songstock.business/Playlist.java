package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa una Playlist de canciones en el sistema SongStock.
 */
public class Playlist {
    private String idPlaylist;
    private String nombre;
    private List<Cancion> canciones; 
    private boolean publica;

    /**
     * Método para agregar una canción a la playlist.
     *
     * @param cancion La canción a agregar.
     */
    public void agregarCancionAPlaylist(Cancion cancion) {
        // Lógica para agregar una canción a la playlist
    }

    /**
     * Método para eliminar una canción de la playlist.
     *
     * @param cancion La canción a eliminar.
     */
    public void eliminarCancionDePlaylist(Cancion cancion) {
        // Lógica para eliminar una canción de la playlist
    }

    /**
     * Método para cambiar el nombre de la playlist.
     *
     * @param nuevoNombre El nuevo nombre de la playlist.
     */
    public void cambiarNombre(String nuevoNombre) {
        // Lógica para cambiar el nombre de la playlist
    }

}