package Controlers;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import ProcesoDeElaboracion.Clases.MateriaPrima;
import ProcesoDeElaboracion.Clases.Operador;
import VentaDeCaramelos.Clases.Pedidos;
import VentaDeCaramelos.Clases.ProductosDeConfituras;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class BaseDatos {
    public static String ruta = System.getProperty("user.dir") + "\\BaseDeDatos\\";

    public void guardarDatos(Cliente cliente) {
        ArrayList<Cliente> c = leerDatosCliente();
        // ArrayList<Cliente> c = new ArrayList<Cliente>();
        c.add(cliente);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Cliente.txt"))) {
            oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(Empleado empleado) {
        ArrayList<Empleado> em = leerDatosEmpleado();
        // ArrayList<Cliente> c = new ArrayList<Cliente>();
        em.add(empleado);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Empleado.txt"))) {
            oos.writeObject(em);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(Proveedor proveedor) {
        ArrayList<Proveedor> proveedors = leerDatosProveedor();
        // ArrayList<Proveedor> proveedors = new ArrayList<Proveedor>();
        proveedors.add(proveedor);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Proveedor.txt"))) {
            oos.writeObject(proveedors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(Operador operador) {
        ArrayList<Operador> operadors = leerDatosOperador();
        operadors.add(operador);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Operador.txt"))) {
            oos.writeObject(operadors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(Pedidos pedidos) {
        ArrayList<Pedidos> pedidos1 = leerDatosPedidos();
        pedidos1.add(pedidos);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Pedidios.txt"))) {
            oos.writeObject(pedidos1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(MateriaPrima materiaPrima) {
        ArrayList<MateriaPrima> materiaPrimas = leerDatosMateriasPrimas();
        // ArrayList<Proveedor> proveedors = new ArrayList<Proveedor>();
        materiaPrimas.add(materiaPrima);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "MateriaPrima.txt"))) {
            oos.writeObject(materiaPrimas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(ProductosDeConfituras productosDeConfitura) {
        ArrayList<ProductosDeConfituras> productosDeConfituras = leerDatosProductosConfitura();
        productosDeConfituras.add(productosDeConfitura);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ruta + "ProductosDeConfituras.txt"))) {
            oos.writeObject(productosDeConfituras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> leerDatosCliente() {
        String archivo = ruta + "Cliente.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Cliente> clientes = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>) ois.readObject();

        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return clientes;
    }

    public ArrayList<Empleado> leerDatosEmpleado() {
        String archivo = ruta + "Empleado.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Empleado> empleados = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            empleados = (ArrayList<Empleado>) ois.readObject();

        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return empleados;
    }

    public ArrayList<Proveedor> leerDatosProveedor() {
        String archivo = ruta + "Proveedor.txt";
        ArrayList<Proveedor> roveedores = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            roveedores = (ArrayList<Proveedor>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return roveedores;
    }

    public ArrayList<Operador> leerDatosOperador() {
        String archivo = ruta + "Operador.txt";
        ArrayList<Operador> operadors = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            operadors = (ArrayList<Operador>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return operadors;
    }

    public ArrayList<MateriaPrima> leerDatosMateriasPrimas() {
        String archivo = ruta + "MateriaPrima.txt";
        ArrayList<MateriaPrima> materiaPrimas = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            materiaPrimas = (ArrayList<MateriaPrima>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return materiaPrimas;
    }

    public ArrayList<ProductosDeConfituras> leerDatosProductosConfitura() {
        String archivo = ruta + "ProductosDeConfituras.txt";
        ArrayList<ProductosDeConfituras> productosDeConfituras = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            productosDeConfituras = (ArrayList<ProductosDeConfituras>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return productosDeConfituras;
    }

    public ArrayList<Pedidos> leerDatosPedidos() {
        String archivo = ruta + "Pedidios.txt";
        ArrayList<Pedidos> pedidos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            pedidos = (ArrayList<Pedidos>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return pedidos;
    }

    public Cliente validarLoginCliente(String emlai, String password) {
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(emlai) && cliente.getPassword().equals(password)) {
                return cliente;
            }

        }
        JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos .");
        return null;
    }

    public Proveedor validarLoginProveedor(String emlai, String password) {
        BaseDatos b = new BaseDatos();
        ArrayList<Proveedor> proveedores = b.leerDatosProveedor();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getEmail().equals(emlai) && proveedor.getPassword().equals(password)) {
                return proveedor;
            }
        }
        JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos .");
        return null;
    }

    public Empleado validarLoginEmpleado(String emlai, String password) {
        BaseDatos b = new BaseDatos();
        ArrayList<Empleado> empleados = b.leerDatosEmpleado();
        for (Empleado empleado : empleados) {
            if (empleado.getEmail().equals(emlai) && empleado.getPassword().equals(password)) {
                return empleado;
            }
        }
        JOptionPane.showMessageDialog(null, "Email o contraseña incorrectos .");
        return null;
    }

    public void borrarDatosPedidios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta + "Pedidos.txt"))) {
            oos.writeObject(new ArrayList<Pedidos>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
