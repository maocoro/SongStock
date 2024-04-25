package co.edu.uniandes.songstock.persistencia;

import co.edu.uniandes.songstock.business.Cancion;
import co.edu.uniandes.songstock.business.Vinilo;

import java.util.List;

public interface DAO {
    void insertarCancion(Cancion cancion);
    void actualizarCancion(Cancion cancion);
    void eliminarCancion(String idCancion);
    List<Cancion> obtenerCanciones();

    void insertarVinilo(Vinilo vinilo);
    void actualizarVinilo(Vinilo vinilo);
    void eliminarVinilo(String idVinilo);
    List<Vinilo> obtenerVinilos();
}