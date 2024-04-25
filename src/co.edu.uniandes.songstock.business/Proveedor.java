package co.edu.uniandes.songstock.business;

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

    /**
     * Método para registrar un nuevo Proveedor en el sistema.
     *
     * @param nombre     El nombre del Proveedor.
     * @param contrasena La contraseña del Proveedor.
     * @param correo     El correo electrónico del Proveedor.
     */
    public void registrarProveedor(String nombre, String contrasena, String correo) {
        // Lógica de registro de Proveedor

    }

    /**
     * Método para autenticar a un Proveedor en el sistema.
     *
     * @param contrasena La contraseña del Proveedor.
     * @return true si la autenticación es exitosa, false en caso contrario.
     */
    public boolean autenticarProveedor(String contrasena) {
        // Lógica de autenticación de Proveedor 
        return false;
    }

    /**
     * Método para recuperar la contraseña de un Proveedor.
     *
     * @param correo El correo electrónico del Proveedor.
     */
    public void recuperarContrasena(String correo) {
        // Lógica de recuperación de contraseña
    }

    /**
     * Método para cerrar la sesión del Proveedor.
     */
    public void cerrarSesion() {
        // Lógica de cierre de sesión
    }

    /**
     * Método para confirmar o rechazar una orden de pedido.
     *
     * @param idPedido        El ID del pedido.
     * @param accion          "Aceptar" o "Rechazar" la orden de pedido.
     * @param observacion     Observación en caso de rechazar el pedido.
     * @param fechaEstimadaEnvio Fecha estimada de envío si se acepta el pedido.
     */
    public void confirmarPedido(String idPedido, String accion, String observacion, String fechaEstimadaEnvio) {
        // Lógica para confirmar o rechazar un pedido
    }

    /**
     * Método para consultar las órdenes de pedido de vinilos.
     *
     * @return Una lista de Pedidos de vinilos.
     */
    public List<Pedido> consultarOrdenesPedido() {
        // Lógica para obtener y retornar las órdenes de pedido
        return null;
    }

    /**
     * Método para construir el catálogo de vinilos del Proveedor.
     */
    public void construirCatalogoVinilos() {
        // Lógica para construir el catálogo de vinilos
    }

    /**
     * Método para agregar un nuevo vinilo al catálogo.
     *
     * @param vinilo El Vinilo a agregar al catálogo.
     */
    public void agregarVinilo(Vinilo vinilo) {
        // Lógica para agregar un vinilo al catálogo
    }

    /**
     * Método para consultar las ventas realizadas y pendientes del Proveedor.
     *
     * @return Un reporte de ventas del Proveedor.
     */
    public Reporte consultarVentas() {
        // Lógica para obtener y retornar el reporte de ventas
        return null;
    }

    
}