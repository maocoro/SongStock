package co.edu.uniandes.songstock.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un Proveedor de vinilos en el sistema SongStock.
 */
public class Proveedor {
    private String idProveedor;
    private String nombre;
    private String contrasena;
    private String correo;
    private boolean estadoSesion;
    private List<Vinilo> catalogoVinilos;
    private List<Pedido> ordenesPedido;
    private List<Reporte> reportesVentas;

    // Constructor
    public Proveedor(String idProveedor, String nombre, String contrasena, String correo) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        this.estadoSesion = false;
        this.catalogoVinilos = new ArrayList<>();
        this.ordenesPedido = new ArrayList<>();
        this.reportesVentas = new ArrayList<>();
    }

    // Getters y setters
    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
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

    public List<Vinilo> getCatalogoVinilos() {
        return catalogoVinilos;
    }

    public void setCatalogoVinilos(List<Vinilo> catalogoVinilos) {
        this.catalogoVinilos = catalogoVinilos;
    }

    public List<Pedido> getOrdenesPedido() {
        return ordenesPedido;
    }

    public void setOrdenesPedido(List<Pedido> ordenesPedido) {
        this.ordenesPedido = ordenesPedido;
    }

    public List<Reporte> getReportesVentas() {
        return reportesVentas;
    }

    public void setReportesVentas(List<Reporte> reportesVentas) {
        this.reportesVentas = reportesVentas;
    }

    // L�gica para registrar un nuevo Proveedor
    public void registrarProveedor(String nombre, String contrasena, String correo) {
        // Aqu� puedes implementar la l�gica para registrar un nuevo proveedor, como validar datos y almacenar en una base de datos.
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
        System.out.println("Proveedor registrado: " + nombre);
    }

    // L�gica para autenticar un Proveedor
    public boolean autenticarProveedor(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            this.estadoSesion = true;
            System.out.println("Proveedor autenticado: " + nombre);
            return true;
        } else {
            System.out.println("Autenticaci�n fallida para el proveedor: " + nombre);
            return false;
        }
    }

    // L�gica para recuperar la contrase�a
    public void recuperarContrasena(String correo) {
        if (this.correo.equals(correo)) {
            // Aqu� puedes implementar la l�gica para recuperar la contrase�a, como enviar un correo electr�nico con la contrase�a o un enlace para restablecerla.
            System.out.println("Correo de recuperaci�n enviado a: " + correo);
        } else {
            System.out.println("Correo no encontrado: " + correo);
        }
    }

    // L�gica para cerrar sesi�n
    public void cerrarSesion() {
        this.estadoSesion = false;
        System.out.println("Sesi�n cerrada para el proveedor: " + nombre);
    }

    // L�gica para confirmar o rechazar una orden de pedido
    public void confirmarPedido(String idPedido, String accion, String observacion) {
        for (Pedido pedido : ordenesPedido) {
            if (pedido.getIdPedido().equals(idPedido)) {
                if (accion.equalsIgnoreCase("Aceptar")) {
                    pedido.setEstadoPedido("Aceptado");
                    System.out.println("Pedido aceptado: " + idPedido);
                } else if (accion.equalsIgnoreCase("Rechazar")) {
                    pedido.setEstadoPedido("Rechazado");
                    pedido.setObservacion(observacion);
                    System.out.println("Pedido rechazado: " + idPedido);
                }
                break;
            }
        }
    }

    // L�gica para consultar las �rdenes de pedido de vinilos
    public List<Pedido> consultarOrdenesPedido() {
        // Aqu� puedes implementar la l�gica para obtener y retornar las �rdenes de pedido desde una base de datos o un sistema de almacenamiento.
        return this.ordenesPedido;
    }

    // L�gica para construir el cat�logo de vinilos del Proveedor
    public void construirCatalogoVinilos() {
        // Implementar la l�gica para construir el cat�logo de vinilos, posiblemente cargando datos desde una base de datos.
        System.out.println("Construyendo el cat�logo de vinilos del proveedor: " + nombre);
    }

    // L�gica para agregar un nuevo vinilo al cat�logo
    public void agregarVinilo(Vinilo vinilo) {
        this.catalogoVinilos.add(vinilo);
        System.out.println("Vinilo agregado al cat�logo: " + vinilo.getNombre());
    }

    // L�gica para consultar las ventas realizadas y pendientes del Proveedor
    public List<Reporte> consultarVentas() {
        // Implementar la l�gica para obtener y retornar el reporte de ventas desde una base de datos o un sistema de almacenamiento.
        System.out.println("Consultando ventas del proveedor: " + nombre);
        return this.reportesVentas;
    }
}