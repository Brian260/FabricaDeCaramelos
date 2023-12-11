package ProcesoDeElaboracion.Clases;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Controlers.BaseDatos;
import FabricaApp.Clases.Empresa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Operador extends Empleado implements Serializable {
    private String especialidad;

    private Mquinaria mquinaria;

    private String ruta = BaseDatos.ruta;

    public Operador() {

    }
    public Operador(String id, String name, String email, String password, float salario, String cargo, Empresa empresa, String especialidad, Mquinaria mquinaria) {
        super(id, name, email, password, salario, cargo, empresa);
        this.especialidad = especialidad;
        this.mquinaria=mquinaria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Mquinaria getMquinaria() {
        return mquinaria;
    }

    public void setMquinaria(Mquinaria mquinaria) {
        this.mquinaria = mquinaria;
    }
    public void actualizar(){
        ArrayList<Operador> operadors = new BaseDatos().leerDatosOperador();
        operadors.removeIf(operador -> operador.getId().equals(this.getId()));
        operadors.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+"Operador.txt", false))) {
            oos.writeObject(operadors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void elimiarDatos(){
        ArrayList<Operador> operadors = new BaseDatos().leerDatosOperador();
        operadors.removeIf(operador -> operador.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta+"Operador.txt", false))) {
            oos.writeObject(operadors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
