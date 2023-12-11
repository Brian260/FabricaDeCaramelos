package Autentificacion.Clases;

import Controlers.BaseDatos;
import VentaDeCaramelos.Clases.Compra;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable {
    private float creditos;
    private Compra compra;
    private String ruta = BaseDatos.ruta;

    public Cliente() {

    }

    public Cliente(String id, String name, String email, String password, float creditos, Compra compra) {
        super(id, name, email, password);
        this.creditos = creditos;
        this.compra = compra;
    }

    public float getCreditos() {
        return creditos;
    }
    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }
    public Compra getCompra() {
        return compra;
    }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public void actualizar(){
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        clientes.removeIf(cliente -> cliente.getId().equals(this.getId()));
        clientes.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+"Cliente.txt", false))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void elimiarDatos(){
        ArrayList<Cliente> clientesBD = new BaseDatos().leerDatosCliente();
        clientesBD.removeIf(cliente -> cliente.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+"Cliente.txt", false))) {
            oos.writeObject(clientesBD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
