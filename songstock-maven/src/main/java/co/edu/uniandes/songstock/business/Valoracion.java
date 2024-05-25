package co.edu.uniandes.songstock.business;

/**
 * Clase que representa una Valoraci�n de una transacci�n en el sistema SongStock.
 */
public class Valoracion {
    private int calificacion;
    private String comentario;

    // Constructores
    public Valoracion() {}

    public Valoracion(int calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    // Getters y setters
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    // M�todo para mostrar la valoraci�n
    @Override
    public String toString() {
        return "Valoracion{" +
                "calificacion=" + calificacion +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
