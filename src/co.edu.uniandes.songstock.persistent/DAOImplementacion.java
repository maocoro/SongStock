package co.edu.uniandes.songstock.persistent;

import co.edu.uniandes.songstock.business.Cancion;
import co.edu.uniandes.songstock.business.Vinilo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementacion implements DAO {
    private Connection conexion;

    public DAOImplementacion() {
        // Establecer conexión con la base de datos
        // ...
    }

    @Override
    public void insertarCancion(Cancion cancion) {
        try {
            PreparedStatement stmt = conexion.prepareStatement("INSERT INTO canciones (id, nombre, precio, duracion, tamano, calidad, formato, artista) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, cancion.getIdCancion());
            stmt.setString(2, cancion.getNombre());
            stmt.setFloat(3, cancion.getPrecio());
            stmt.setString(4, cancion.getDuracion());
            stmt.setFloat(5, cancion.getTamano());
            stmt.setInt(6, cancion.getCalidad());
            stmt.setString(7, cancion.getFormato());
            stmt.setString(8, cancion.getArtista());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizarCancion(Cancion cancion) {
        // Lógica para actualizar una canción en la base de datos
    }

    @Override
    public void eliminarCancion(String idCancion) {
        // Lógica para eliminar una canción de la base de datos
    }

    @Override
    public List<Cancion> obtenerCanciones() {
        List<Cancion> canciones = new ArrayList<>();
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM canciones");
            while (rs.next()) {
                Cancion cancion = new Cancion(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getFloat("precio"),
                        rs.getString("duracion"),
                        rs.getFloat("tamano"),
                        rs.getInt("calidad"),
                        rs.getString("formato"),
                        rs.getString("artista")
                );
                canciones.add(cancion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return canciones;
    }

    @Override
    public void insertarVinilo(Vinilo vinilo) {
        // Lógica para insertar un vinilo en la base de datos
    }

    @Override
    public void actualizarVinilo(Vinilo vinilo) {
        // Lógica para actualizar un vinilo en la base de datos
    }

    @Override
    public void eliminarVinilo(String idVinilo) {
        // Lógica para eliminar un vinilo de la base de datos
    }

    @Override
    public List<Vinilo> obtenerVinilos() {
        // Lógica para obtener vinilos de la base de datos
        return null;
    }
}