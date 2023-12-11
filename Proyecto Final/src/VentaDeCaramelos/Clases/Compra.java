package VentaDeCaramelos.Clases;

import Autentificacion.Clases.Cliente;

import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable {
    private Cliente cliente;
    private ArrayList<ProductosDeConfituras> productosDeConfituras;

    public Compra() {
    }

    public Compra(Cliente cliente, ArrayList<ProductosDeConfituras> productosDeConfituras) {
        this.cliente = cliente;
        this.productosDeConfituras = productosDeConfituras;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ProductosDeConfituras> getProductosDeConfituras() {
        return productosDeConfituras;
    }

    public void setProductosDeConfituras(ArrayList<ProductosDeConfituras> productosDeConfituras) {
        this.productosDeConfituras = productosDeConfituras;
    }
}
