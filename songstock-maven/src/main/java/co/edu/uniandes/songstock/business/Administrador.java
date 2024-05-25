package co.edu.uniandes.songstock.business;

import java.util.HashMap;
import java.util.Map;

public class Administrador {
    private String idAdministrador;
    private String nombre;
    private String contrasena;
    private String correo;

    // Almacenamiento simulado de administradores
    private static Map<String, Administrador> administradoresRegistrados = new HashMap<>();

    // Constructores
    public Administrador() {}

    public Administrador(String idAdministrador, String nombre, String contrasena, String correo) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    // Getters y setters
    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Lógica para registrar un nuevo administrador
    public void registrarAdministrador() {
        if (!administradoresRegistrados.containsKey(idAdministrador)) {
            administradoresRegistrados.put(idAdministrador, this);
            System.out.println("Administrador registrado exitosamente: " + nombre);
        } else {
            System.out.println("El administrador ya está registrado: " + idAdministrador);
        }
    }

    // Lógica para autenticar un administrador
    public boolean autenticarAdministrador(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            System.out.println("Autenticación exitosa para el administrador: " + nombre);
            return true;
        } else {
            System.out.println("Autenticación fallida para el administrador: " + nombre);
            return false;
        }
    }

    // Lógica para crear o editar el catálogo de canciones MP3
    public void editarCatalogoMP3() {
        // Implementar lógica específica para editar el catálogo de MP3
        System.out.println("Editando catálogo de MP3...");
    }

    // Lógica para crear o editar el catálogo de vinilos
    public void editarCatalogoVinilos() {
        // Implementar lógica específica para editar el catálogo de vinilos
        System.out.println("Editando catálogo de vinilos...");
    }

    // Lógica para revisar y aprobar valoraciones de transacciones
    public void revisarValoracionesTransacciones() {
        // Implementar lógica específica para revisar valoraciones
        System.out.println("Revisando valoraciones de transacciones...");
    }

    // Lógica para visualizar ventas abiertas
    public void visualizarVentasAbiertas() {
        // Implementar lógica específica para visualizar ventas abiertas
        System.out.println("Visualizando ventas abiertas...");
    }

    // Lógica para generar reportes de ventas
    public void generarReporteVentas() {
        // Implementar lógica específica para generar reportes de ventas
        System.out.println("Generando reporte de ventas...");
    }

    // Lógica para cerrar sesión
    public void cerrarSesion() {
        System.out.println("Sesión cerrada para el administrador: " + nombre);
    }

    // Método estático para buscar un administrador por ID
    public static Administrador buscarAdministrador(String idAdministrador) {
        return administradoresRegistrados.get(idAdministrador);
    }
}

