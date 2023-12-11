package FabricaApp.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import ProcesoDeElaboracion.Clases.MateriaPrima;
import ProcesoDeElaboracion.Clases.Mquinaria;
import VentaDeCaramelos.Clases.ProductosDeConfituras;

import javax.swing.*;

public class PanelFabric extends javax.swing.JPanel {

        public PanelFabric() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

                textCantidadMateria = new javax.swing.JTextField();
                comboBoxTipoDulce = new javax.swing.JComboBox<>();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                buttonCrear = new javax.swing.JButton();
                buttonCancelar = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                textCantidadMateria.setBackground(new java.awt.Color(204, 204, 204));
                textCantidadMateria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                textCantidadMateria.setBorder(null);

                comboBoxTipoDulce.setBackground(new java.awt.Color(204, 204, 204));
                comboBoxTipoDulce.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 24)); // NOI18N
                comboBoxTipoDulce.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Chocolate", "Chicle", "M&M´S", "Gomitas" }));
                comboBoxTipoDulce.setBorder(null);

                jLabel1.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                jLabel1.setText("Cantidad de Materia Prima :");

                jLabel2.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                jLabel2.setText("Tipos de Caramelos :");

                buttonCrear.setBackground(new java.awt.Color(204, 255, 102));
                buttonCrear.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                buttonCrear.setText("Crear");
                buttonCrear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonCrearActionPerformed(evt);
                        }
                });

                buttonCancelar.setBackground(new java.awt.Color(255, 102, 102));
                buttonCancelar.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                buttonCancelar.setText("Cancelar");
                buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonCancelarActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 48)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Fabricación");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(55, 55, 55)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addComponent(textCantidadMateria)
                                                                                                                .addComponent(comboBoxTipoDulce,
                                                                                                                                0,
                                                                                                                                448,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(125, 125, 125)
                                                                                                .addComponent(buttonCrear,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                193,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(buttonCancelar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                199,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(30, 30, 30)))
                                                                .addGap(61, 61, 61))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 187, Short.MAX_VALUE)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                534,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(154, 154, 154)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(66, 66, 66)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(textCantidadMateria,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                43,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(80, 80, 80)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(comboBoxTipoDulce,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                42, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                105, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(buttonCrear,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(buttonCancelar,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(58, 58, 58)));
        }// </editor-fold>

        private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {
                int cantidad = Integer.parseInt(textCantidadMateria.getText());
                Mquinaria mquinaria = new Mquinaria(new MateriaPrima(cantidad, "Azucar", 10),
                                (String) comboBoxTipoDulce.getSelectedItem());
                ProductosDeConfituras productosDeConfituras = mquinaria.elaborarDulces();
                JOptionPane.showMessageDialog(this,
                                "Se han creado " + productosDeConfituras.getCantidad() + " de "
                                                + productosDeConfituras.getDescripcion() + " en el lote "
                                                + productosDeConfituras.getLote());
        }

        private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(this, "Proceso de elaboracion detenido");
        }

        // Variables declaration - do not modify
        private javax.swing.JButton buttonCancelar;
        private javax.swing.JButton buttonCrear;
        private javax.swing.JComboBox<String> comboBoxTipoDulce;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField textCantidadMateria;
        // End of variables declaration
}
