package VentaDeCaramelos.Clases;

import ProcesoDeElaboracion.Clases.MateriaPrima;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductosDeConfituras implements Serializable {
    private String descripcion;
    private String lote;
    private int cantidad;

    public ProductosDeConfituras() {
    }

    public ProductosDeConfituras(String descripcion, String lote, int cantidad) {
        this.descripcion = descripcion;
        this.lote = lote;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}
