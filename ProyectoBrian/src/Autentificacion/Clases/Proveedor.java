package Autentificacion.Clases;

import Controlers.BaseDatos;
import FabricaApp.Clases.Empresa;
import ProcesoDeElaboracion.Clases.MateriaPrima;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Proveedor extends Persona implements Serializable {
    private float credito;


    public Proveedor() {

    }

    public Proveedor(String id, String name, String email, String password, float credito) {
        super(id, name, email, password);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
    public void setCredito(float credito) {
        this.credito = credito;
    }


    public void actualizar(){
        ArrayList<Proveedor> proveedores = new BaseDatos().leerDatosProveedor();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId().equals(this.getId())){
                proveedores.remove(proveedores.indexOf(proveedor));
                proveedores.add(this);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BaseDatos.ruta+"Proveedor.txt", false))) {
                    oos.writeObject(proveedores);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void elimiarDatos(){
        new Empresa().elimiarProveedor(this.getId());
    }

}
