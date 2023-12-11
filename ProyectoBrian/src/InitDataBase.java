
import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import ProcesoDeElaboracion.Clases.MateriaPrima;
import ProcesoDeElaboracion.Clases.Operador;
import VentaDeCaramelos.Clases.Pedidos;
import VentaDeCaramelos.Clases.ProductosDeConfituras;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class InitDataBase {
    private static String ruta = System.getProperty("user.dir") + "\\BaseDeDatos\\";

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Cliente.txt"))) {
            oos.writeObject(new ArrayList<Cliente>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Empleado.txt"))) {
            oos.writeObject(new ArrayList<Empleado>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Proveedor.txt"))) {
            oos.writeObject(new ArrayList<Proveedor>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Operador.txt"))) {
            oos.writeObject(new ArrayList<Operador>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Pedidios.txt"))) {
            oos.writeObject(new ArrayList<Pedidos>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "MateriaPrima.txt"))) {
            oos.writeObject(new ArrayList<MateriaPrima>());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ruta + "ProductosDeConfituras.txt"))) {
            oos.writeObject(new ArrayList<ProductosDeConfituras>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
