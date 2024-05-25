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

    // L�gica para registrar un nuevo administrador
    public void registrarAdministrador() {
        if (!administradoresRegistrados.containsKey(idAdministrador)) {
            administradoresRegistrados.put(idAdministrador, this);
            System.out.println("Administrador registrado exitosamente: " + nombre);
        } else {
            System.out.println("El administrador ya est� registrado: " + idAdministrador);
        }
    }

    // L�gica para autenticar un administrador
    public boolean autenticarAdministrador(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            System.out.println("Autenticaci�n exitosa para el administrador: " + nombre);
            return true;
        } else {
            System.out.println("Autenticaci�n fallida para el administrador: " + nombre);
            return false;
        }
    }

    // L�gica para crear o editar el cat�logo de canciones MP3
    public void editarCatalogoMP3() {
        // Implementar l�gica espec�fica para editar el cat�logo de MP3
        System.out.println("Editando cat�logo de MP3...");
    }

    // L�gica para crear o editar el cat�logo de vinilos
    public void editarCatalogoVinilos() {
        // Implementar l�gica espec�fica para editar el cat�logo de vinilos
        System.out.println("Editando cat�logo de vinilos...");
    }

    // L�gica para revisar y aprobar valoraciones de transacciones
    public void revisarValoracionesTransacciones() {
        // Implementar l�gica espec�fica para revisar valoraciones
        System.out.println("Revisando valoraciones de transacciones...");
    }

    // L�gica para visualizar ventas abiertas
    public void visualizarVentasAbiertas() {
        // Implementar l�gica espec�fica para visualizar ventas abiertas
        System.out.println("Visualizando ventas abiertas...");
    }

    // L�gica para generar reportes de ventas
    public void generarReporteVentas() {
        // Implementar l�gica espec�fica para generar reportes de ventas
        System.out.println("Generando reporte de ventas...");
    }

    // L�gica para cerrar sesi�n
    public void cerrarSesion() {
        System.out.println("Sesi�n cerrada para el administrador: " + nombre);
    }

    // M�todo est�tico para buscar un administrador por ID
    public static Administrador buscarAdministrador(String idAdministrador) {
        return administradoresRegistrados.get(idAdministrador);
    }
}

