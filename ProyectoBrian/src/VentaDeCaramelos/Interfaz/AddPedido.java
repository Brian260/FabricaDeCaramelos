package VentaDeCaramelos.Interfaz;

import Controlers.BaseDatos;
import FabricaApp.Interfaz.PanelPedidos;
import VentaDeCaramelos.Clases.Pedidos;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class AddPedido extends javax.swing.JPanel {

    private JPanel panel;

    public AddPedido(JPanel panel) {
        this.panel=panel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Pedido");

        textDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        textDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDescripcion.setBorder(null);

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Descripcion del Pedido :");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cantidad del Pedido :");

        textCantidad.setBackground(new java.awt.Color(204, 204, 204));
        textCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantidad.setBorder(null);

        buttonAdd.setBackground(new java.awt.Color(153, 255, 153));
        buttonAdd.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.setBorder(null);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(279, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(textDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                                        .addComponent(textCantidad))
                                                .addGap(227, 227, 227))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(295, 295, 295))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
        );
    }// </editor-fold>

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {
        String descripcion = textDescripcion.getText();
        int cantidad = Integer.parseInt(textCantidad.getText());
        Pedidos pedidos = new Pedidos(cantidad, descripcion, LocalTime.now());
        new BaseDatos().guardarDatos(pedidos);
        JOptionPane.showMessageDialog(this, "Pedido agregado con exito.");

        PanelPedidos panelPedidos = new PanelPedidos(panel);
        panelPedidos.setSize(875, 501);
        panelPedidos.setLocation(0,0);

        panel.removeAll();
        panel.add(panelPedidos, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textDescripcion;
    // End of variables declaration
}

