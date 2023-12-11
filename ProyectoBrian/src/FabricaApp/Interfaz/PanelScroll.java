package FabricaApp.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import Controlers.BaseDatos;
import ProcesoDeElaboracion.Clases.Operador;
import VentaDeCaramelos.Clases.ProductosDeConfituras;

import java.awt.*;
import java.util.ArrayList;

public class PanelScroll extends javax.swing.JPanel {

    private String valor;

    public PanelScroll(String valor) {
        this.valor=valor;
        initComponents();
        initModel();
    }
    private void initModel(){
        if (this.valor=="Cliente"){
            ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
            javax.swing.JPanel panel = new javax.swing.JPanel();
            panel.setBackground(new java.awt.Color(245, 245, 245));
            panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
            for (Cliente cliente1: clientes) {
                panel.add(new Card(cliente1, this));
            }
            scrollPanelContent.setViewportView(panel);
        } else if (this.valor=="Proveedor") {
            ArrayList<Proveedor> proveedors = new BaseDatos().leerDatosProveedor();
            javax.swing.JPanel panel = new javax.swing.JPanel();
            panel.setBackground(new java.awt.Color(245, 245, 245));
            panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
            for (Proveedor proveedor1: proveedors) {
                panel.add(new Card(proveedor1, this));
            }
            scrollPanelContent.setViewportView(panel);
        } else if (this.valor=="Empleado") {
            ArrayList<Empleado> empleados = new BaseDatos().leerDatosEmpleado();
            javax.swing.JPanel panel = new javax.swing.JPanel();
            panel.setBackground(new java.awt.Color(245, 245, 245));
            panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
            for (Empleado empleado1: empleados) {
                panel.add(new Card(empleado1, this));
            }
            scrollPanelContent.setViewportView(panel);

        } else if (this.valor=="Operador") {
            ArrayList<Operador> operadors = new BaseDatos().leerDatosOperador();
            javax.swing.JPanel panel = new javax.swing.JPanel();
            panel.setBackground(new java.awt.Color(245, 245, 245));
            panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
            for (Operador operador: operadors) {
                panel.add(new Card(operador, this));
            }
            scrollPanelContent.setViewportView(panel);
        } else if (this.valor=="Productos") {
            ArrayList<ProductosDeConfituras> productosDeConfituras = new BaseDatos().leerDatosProductosConfitura();
            javax.swing.JPanel panel = new javax.swing.JPanel();
            panel.setBackground(new java.awt.Color(245, 245, 245));
            panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
            for (ProductosDeConfituras productosDeConfitura: productosDeConfituras) {

                panel.add(new CardPedidos(productosDeConfitura));
            }
            scrollPanelContent.setViewportView(panel);
        }

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        scrollPanelContent = new javax.swing.JScrollPane();

        scrollPanelContent.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanelContent.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JScrollPane scrollPanelContent;
    // End of variables declaration
}

