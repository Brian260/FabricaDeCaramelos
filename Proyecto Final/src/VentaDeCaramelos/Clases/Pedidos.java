package VentaDeCaramelos.Clases;

import Autentificacion.Clases.Empleado;
import Controlers.BaseDatos;
import Controlers.GenerarID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedidos implements Serializable {
    private String id ;
    private int cantidad;
    private String descripcion;
    private LocalTime tiempo;

    public Pedidos() {
    }

    public Pedidos(int cantidad, String descripcion, LocalTime tiempo) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.id = new GenerarID().generarRandomID();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public void elimiarDatos(){
        ArrayList<Pedidos> pedidos = new BaseDatos().leerDatosPedidos();
        pedidos.removeIf(pedido -> pedido.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BaseDatos.ruta+"Pedidios.txt", false))) {
            oos.writeObject(pedidos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
