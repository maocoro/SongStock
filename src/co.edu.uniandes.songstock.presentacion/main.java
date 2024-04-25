package co.edu.uniandes.songstock.presentacion;

import co.edu.uniandes.songstock.business.*;
import co.edu.uniandes.songstock.persistent.DAOImplementacion;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciar clases de la capa de negocio
        Usuario usuario = new Usuario();
        Proveedor proveedor = new Proveedor();
        Administrador admin = new Administrador();
        Catalogo catalogo = new Catalogo();
        Carrito carrito = new Carrito();

        //  llamadas a métodos
        usuario.registrarUsuario("Juan Pérez", "contrasena123", "juan@example.com");
        proveedor.construirCatalogoVinilos();
        admin.editarCatalogoMP3();
        List<Cancion> canciones = catalogo.buscarCanciones("rock");
        carrito.agregarCancion(canciones.get(0));

        // Instanciar clase DAO y probar métodos
        DAOImplementacion dao = new DAOImplementacion();
        dao.insertarCancion(new Cancion("1", "Canción de Prueba", 1.99f, "3:45", 4.2f, 320, "MP3", "Artista X"));
        List<Cancion> cancionesDB = dao.obtenerCanciones();
        // otras operaciones con la base de datos
    }
}