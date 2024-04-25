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
    private String observacion;
    private String comentario;
    private Usuario usuario;
    private List<Vinilo> vinilos;

    /**
     * Método para registrar una nueva transacción
     *
     * @param fechaPedido La fecha del pedido.
     * @param medioPago   El medio de pago utilizado por el usuario.
     * @param vinilos     La lista de vinilos comprados por el usuario.
     */
    public void registrarTransaccion(Date fechaPedido, String medioPago, List<Vinilo> vinilos) {
        // Lógica para registrar una transacción 
    }

    /**
     * Método para valorar una transacción.
     *
     * @param valoracion La valoración de la transacción.
     */
    public void valorarPedido(Valoracion valoracion) {
        // Lógica para valorar una transacción 
    }

}