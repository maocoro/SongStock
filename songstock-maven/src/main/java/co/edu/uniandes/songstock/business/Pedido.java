package co.edu.uniandes.songstock.business;

import java.util.Date;
import java.util.List;

/**
 * Clase que representa un Pedido de vinilos en el sistema SongStock.
 */
public class Pedido {
    private String idPedido;
    private Date fechaPedido;
    private String medioPago;
    private String estadoPedido;
    private Date fechaEnvio;
    private Date fechaEstimadaEnvio;
    private String observacion;
    private String comentario;
    private Usuario usuario;
    private List<Vinilo> vinilos;
    private Valoracion valoracion;

    // Constructores
    public Pedido(String idPedido, Date fechaPedido, String medioPago, String estadoPedido, Usuario usuario, List<Vinilo> vinilos) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.medioPago = medioPago;
        this.estadoPedido = estadoPedido;
        this.usuario = usuario;
        this.vinilos = vinilos;
    }

    public Pedido() {}

    // Getters y setters
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaEstimadaEnvio() {
        return fechaEstimadaEnvio;
    }

    public void setFechaEstimadaEnvio(Date fechaEstimadaEnvio) {
        this.fechaEstimadaEnvio = fechaEstimadaEnvio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Vinilo> getVinilos() {
        return vinilos;
    }

    public void setVinilos(List<Vinilo> vinilos) {
        this.vinilos = vinilos;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }

    // Método para registrar una nueva transacción
    public void registrarTransaccion(Date fechaPedido, String medioPago, List<Vinilo> vinilos) {
        this.fechaPedido = fechaPedido;
        this.medioPago = medioPago;
        this.vinilos = vinilos;
        this.estadoPedido = "Registrado";
        // Aquí puedes implementar la lógica adicional para registrar una transacción, como interactuar con la base de datos.
        System.out.println("Transacción registrada: " + idPedido);
    }

    // Método para valorar una transacción
    public void valorarPedido(Valoracion valoracion) {
        this.valoracion = valoracion;
        this.estadoPedido = "Valorado";
        // Aquí puedes implementar la lógica adicional para valorar una transacción, como guardar la valoración en la base de datos.
        System.out.println("Pedido valorado: " + idPedido + " con valoración: " + valoracion.getCalificacion());
    }

    // Método para actualizar el estado del pedido
    public void actualizarEstado(String nuevoEstado) {
        this.estadoPedido = nuevoEstado;
        System.out.println("Estado del pedido actualizado a: " + nuevoEstado);
    }

    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (Vinilo vinilo : vinilos) {
            total += vinilo.getPrecio();
        }
        return total;
    }

    // Método para enviar el pedido
    public void enviarPedido(Date fechaEnvio, Date fechaEstimadaEnvio) {
        this.fechaEnvio = fechaEnvio;
        this.fechaEstimadaEnvio = fechaEstimadaEnvio;
        this.estadoPedido = "Enviado";
        System.out.println("Pedido enviado el: " + fechaEnvio + ", fecha estimada de entrega: " + fechaEstimadaEnvio);
    }
}