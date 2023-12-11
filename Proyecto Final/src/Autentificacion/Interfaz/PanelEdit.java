package Autentificacion.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Proveedor;

import javax.swing.*;

public class PanelEdit extends javax.swing.JPanel {

    private Proveedor proveedor;
    private Cliente cliente;

    public PanelEdit(Proveedor proveedor) {
        this.proveedor=proveedor;
        initComponents();
    }
    public PanelEdit(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textPassword = new javax.swing.JTextField();
        textCredito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Usuario");

        textName.setBackground(new java.awt.Color(204, 204, 204));
        textName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textName.setBorder(null);

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEmail.setBorder(null);

        textPassword.setBackground(new java.awt.Color(204, 204, 204));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.setBorder(null);

        textCredito.setBackground(new java.awt.Color(204, 204, 204));
        textCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCredito.setBorder(null);

        if (cliente!=null){
            textName.setText(cliente.getName());
            textEmail.setText(cliente.getEmail());
            textPassword.setText(cliente.getPassword());
            textCredito.setText(String.valueOf((int) cliente.getCreditos()));
        } else if (proveedor!=null) {
            textName.setText(proveedor.getName());
            textEmail.setText(proveedor.getEmail());
            textPassword.setText(proveedor.getPassword());
            textCredito.setText(String.valueOf( (int) proveedor.getCredito()));
        }

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre :");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Email :");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña :");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Credito :");

        buttonGuardar.setBackground(new java.awt.Color(255, 204, 204));
        buttonGuardar.setText("Guardar");
        buttonGuardar.setBorder(null);
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(215, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                .addComponent(textName))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4))
                                                .addGap(77, 77, 77)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textEmail)
                                                        .addComponent(textCredito)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel5))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(190, 190, 190))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(textEmail))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(textPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
        );
    }// </editor-fold>

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        if (cliente!=null){
            cliente.setName(textName.getText());
            cliente.setEmail(textEmail.getText());
            cliente.setPassword(textPassword.getText());
            cliente.setCreditos(Integer.parseInt(textCredito.getText()));
            cliente.actualizar();
        } else if (proveedor!=null) {
            proveedor.setName(textName.getText());
            proveedor.setEmail(textEmail.getText());
            proveedor.setPassword(textPassword.getText());
            proveedor.setCredito(Float.parseFloat(textCredito.getText()));
            proveedor.actualizar();
        }
        JOptionPane.showMessageDialog(this, "Datos guardados con exito");
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textCredito;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPassword;
    // End of variables declaration
}
