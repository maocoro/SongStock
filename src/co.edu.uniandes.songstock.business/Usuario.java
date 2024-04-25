package co.edu.uniandes.songstock.business;

import java.util.List;

/**
 * Clase que representa a un Usuario del sistema SongStock.
 */
public class Usuario {
    private String idUsuario;
    private String nombre;
    private String contrasena;
    private String correo;
    private boolean estadoSesion;
    private String correoRecuperacion;
    private int numeroCompras;

    /**
     * Método para registrar un nuevo Usuario en el sistema.
     *
     * @param nombre     El nombre del Usuario. 
     * @param contrasena La contraseña del Usuario.
     * @param correo     El correo electrónico del Usuario.
     */
    public void registrarUsuario(String nombre, String contrasena, String correo) {
        // Lógica de registro de Usuario
    }

    /**
     * Método para autenticar a un Usuario en el sistema.
     *
     * @param contrasena La contraseña del Usuario.
     * @return true si la autenticación es exitosa, false en caso contrario.
     */
    public boolean autenticarUsuario(String contrasena) {
        // Lógica de autenticación de Usuario
        return false;
    }

    /**
     * Método para recuperar la contraseña de un Usuario.
     *
     * @param correo El correo electrónico del Usuario.
     */
    public void recuperarContrasena(String correo) {
        // Logica recuperación de contraseña
    }

    /**
     * Método para cerrar la sesión del Usuario.
     */
    public void cerrarSesion() {
        //Lógica de cierre de sesión
    }

    /**
     * Método para visualizar el catálogo de canciones.
     *
     * @return Lista de Canciones disponibles en el catálogo.
     */
    public List<Cancion> visualizarCatalogoCanciones() {
        // Lógica para obtener y retornar el catálogo de canciones
        return null;
    }


}