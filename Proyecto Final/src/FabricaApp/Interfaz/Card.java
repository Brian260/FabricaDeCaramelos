package FabricaApp.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import Autentificacion.Interfaz.PanelEdit;
import ProcesoDeElaboracion.Clases.Operador;
import VentaDeCaramelos.Clases.Pedidos;
import VentaDeCaramelos.Clases.ProductosDeConfituras;
import VentaDeCaramelos.Interfaz.AddPedido;

import javax.swing.*;
import java.awt.*;

public class Card extends javax.swing.JPanel {
    private Cliente cliente;
    private Proveedor proveedor;
    private Empleado empleado;
    private Operador operador;
    private Pedidos pedidos;
    private ProductosDeConfituras productosDeConfituras;

    private JPanel panel;

    public Card(Cliente cliente, JPanel panel) {
        this.panel=panel;
        this.cliente=cliente;
        initComponents();
    }
    public Card( ProductosDeConfituras productosDeConfituras, JPanel panel) {
        this.panel=panel;
        this.cliente=cliente;
        initComponents();
    }
    public Card(Pedidos pedidos, JPanel panel) {
        this.panel=panel;
        this.pedidos=pedidos;
        initComponents();
    }
    public Card(Proveedor proveedor, JPanel panel) {
        this.panel=panel;
        this.proveedor=proveedor;
        initComponents();
    }
    public Card(Empleado empleado, JPanel panel) {
        this.panel=panel;
        this.empleado=empleado;
        initComponents();
    }
    public Card(Operador operador, JPanel panel) {
        this.panel=panel;
        this.operador=operador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        buttonEdit.setBackground(new java.awt.Color(255, 255, 102));
        buttonEdit.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        if (cliente!=null){
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(cliente.getName());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(cliente.getEmail());

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(cliente.getCreditos()+" $");

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("");
        } else if (proveedor!=null) {
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(proveedor.getName());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(proveedor.getEmail());

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(proveedor.getCredito()+" $");

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("");
        } else if (empleado!=null) {
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(empleado.getName());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(empleado.getEmail());

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(empleado.getSalario()+" $");

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText(empleado.getCargo());
            buttonEdit.setVisible(false);
            buttonDelete.setText("Despedir");
        } else if (operador!=null) {
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(operador.getName());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(operador.getEmail());

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(operador.getSalario()+" $");

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText(operador.getCargo());
            buttonEdit.setVisible(false);

            buttonDelete.setText("Despedir");
        }else if (pedidos!=null) {
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(pedidos.getDescripcion());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(String.valueOf(pedidos.getCantidad()));

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(String.valueOf(pedidos.getTiempo()));

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("");
            buttonEdit.setVisible(false);

        }else if (productosDeConfituras!=null) {
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(productosDeConfituras.getDescripcion());

            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText(productosDeConfituras.getLote());

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(String.valueOf(productosDeConfituras.getCantidad()));

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("");
            buttonEdit.setVisible(false);
            buttonDelete.setVisible(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(buttonEdit)
                                                .addComponent(buttonDelete)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)))
                                .addGap(0, 16, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {
        if (cliente!=null){
            PanelEdit panelEdit = new PanelEdit(cliente);
            panelEdit.setSize(875, 501);
            panelEdit.setLocation(0,0);

            panel.removeAll();
            panel.add(panelEdit, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        } else if (proveedor!=null) {
            PanelEdit panelEdit = new PanelEdit(proveedor);
            panelEdit.setSize(875, 501);
            panelEdit.setLocation(0,0);

            panel.removeAll();
            panel.add(panelEdit, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }

    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        if (cliente!=null){
            cliente.elimiarDatos();
            PanelScroll panelScroll = new PanelScroll("Cliente");
            panelScroll.setSize(875, 501);
            panelScroll.setLocation(0,0);

            panel.removeAll();
            panel.add(panelScroll, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }else if (proveedor!=null){
            proveedor.elimiarDatos();
            PanelScroll panelScroll = new PanelScroll("Proveedor");
            panelScroll.setSize(875, 501);
            panelScroll.setLocation(0,0);

            panel.removeAll();
            panel.add(panelScroll, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        } else if (empleado!=null) {
            empleado.elimiarDatos();
            PanelScroll panelScroll = new PanelScroll("Empleado");
            panelScroll.setSize(875, 501);
            panelScroll.setLocation(0,0);

            panel.removeAll();
            panel.add(panelScroll, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        } else if (operador!=null) {
            operador.elimiarDatos();
            PanelScroll panelScroll = new PanelScroll("Operador");
            panelScroll.setSize(875, 501);
            panelScroll.setLocation(0,0);

            panel.removeAll();
            panel.add(panelScroll, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        } else if (pedidos!=null) {
            pedidos.elimiarDatos();
            PanelPedidos panelPedidos = new PanelPedidos(panel);
            panelPedidos.setSize(875, 501);
            panelPedidos.setLocation(0,0);

            panel.removeAll();
            panel.add(panelPedidos, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration
}

