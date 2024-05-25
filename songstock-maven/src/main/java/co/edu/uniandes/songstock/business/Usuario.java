package co.edu.uniandes.songstock.business;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String contrasena;
    private String correo;
    private boolean estadoSesion;
    private int numeroCompras;

    // Almacenamiento simulado de usuarios sin base de datos
    private static Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    // Constructores
    public Usuario() {}

    public Usuario(String idUsuario, String nombre, String contrasena, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.estadoSesion = false;
        this.numeroCompras = 0;
    }

    // Getters y setters
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public boolean isEstadoSesion() {
        return estadoSesion;
    }

    public void setEstadoSesion(boolean estadoSesion) {
        this.estadoSesion = estadoSesion;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    // Lógica para registrar un nuevo usuario
    public void registrarUsuario() {
        if (!usuariosRegistrados.containsKey(idUsuario)) {
            usuariosRegistrados.put(idUsuario, this);
            System.out.println("Usuario registrado exitosamente: " + nombre);
        } else {
            System.out.println("El usuario ya está registrado: " + idUsuario);
        }
    }

    // Lógica para autenticar un usuario
    public boolean autenticarUsuario(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            estadoSesion = true;
            System.out.println("Autenticación exitosa para el usuario: " + nombre);
            return true;
        } else {
            System.out.println("Autenticación fallida para el usuario: " + nombre);
            return false;
        }
    }

    // Lógica para cerrar sesión
    public void cerrarSesion() {
        estadoSesion = false;
        System.out.println("Sesión cerrada para el usuario: " + nombre);
    }

    // Método estático para buscar un usuario por ID
    public static Usuario buscarUsuario(String idUsuario) {
        return usuariosRegistrados.get(idUsuario);
    }
}