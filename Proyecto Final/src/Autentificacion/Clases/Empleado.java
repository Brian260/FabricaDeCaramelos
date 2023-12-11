package Autentificacion.Clases;

import Controlers.BaseDatos;
import FabricaApp.Clases.Empresa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona implements Serializable {
    private float salario;
    private String cargo;

    private Empresa empresa;

    public Empleado() {

    }

    public Empleado(String id, String name, String email, String password, float salario, String cargo, Empresa empresa) {
        super(id, name, email, password);
        this.salario = salario;
        this.cargo = cargo;
        this.empresa=empresa;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void actualizar(){
        ArrayList<Empleado> empleados = new BaseDatos().leerDatosEmpleado();
        empleados.removeIf(empleado -> empleado.getId().equals(this.getId()));
        empleados.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BaseDatos.ruta+"Empleados.txt", false))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void elimiarDatos(){
      new Empresa().despedirEmpleado(this.getId());
    }
}
