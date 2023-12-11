package ProcesoDeElaboracion.Clases;

import Autentificacion.Clases.Proveedor;

import java.io.Serializable;

public class MateriaPrima implements Serializable {
    private int cantidad;

    private String tipoDeMateria;
    private float costo;
    private Proveedor proveedor;

    public MateriaPrima() {
    }

    public MateriaPrima(int cantidad, String tipoDeMateria, float costo) {
        this.cantidad = cantidad;
        this.tipoDeMateria = tipoDeMateria;
        this.costo = costo;
    }

    public MateriaPrima(int cantidad, String tipoDeMateria, float costo, Proveedor proveedor) {
        this.cantidad = cantidad;
        this.tipoDeMateria = tipoDeMateria;
        this.costo = costo;
        this.proveedor = proveedor;
    }

    public String getTipoDeMateria() {
        return tipoDeMateria;
    }

    public void setTipoDeMateria(String tipoDeMateria) {
        this.tipoDeMateria = tipoDeMateria;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }


}
