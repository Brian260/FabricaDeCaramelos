package FabricaApp.Clases;

import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import Controlers.BaseDatos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable {
    private String nombre;
    private ArrayList<Empleado> emplead;
    private ArrayList<Proveedor> proveedors;
    private float presupuesto;

    public Empresa() {
    }

    public Empresa(String nombre, ArrayList<Empleado> emplead, ArrayList<Proveedor> proveedors, float presupuesto) {
        this.nombre = nombre;
        this.emplead = emplead;
        this.proveedors = proveedors;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getemplead() {
        return emplead;
    }

    public void setemplead(ArrayList<Empleado> emplead) {
        this.emplead = emplead;
    }

    public ArrayList<Proveedor> getProveedors() {
        return proveedors;
    }

    public void setProveedors(ArrayList<Proveedor> proveedors) {
        this.proveedors = proveedors;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void despedirEmpleado(String id) {
        ArrayList<Empleado> m = new BaseDatos().leerDatosEmpleado();
        System.out.println(m.size());
        int index = 0;
        for (Empleado empleado : m) {
            if (empleado.getId().equals(id)) {
                index = m.indexOf(empleado);
            }
        }
        Empleado p = m.remove(index);
        System.out.println(p.getName());
        System.out.println(m.size());
        // m.removeIf(empleado -> empleado.getId().equals(id));
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(BaseDatos.ruta + "Empleado.txt", false))) {
            oos.writeObject(m);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void elimiarProveedor(String id) {
        ArrayList<Proveedor> proveedoresBD = new BaseDatos().leerDatosProveedor();
        proveedoresBD.removeIf(proveedor -> proveedor.getId().equals(id));
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(BaseDatos.ruta + "Proveedor.txt", false))) {
            oos.writeObject(proveedoresBD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
