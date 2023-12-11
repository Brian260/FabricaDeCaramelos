package Autentificacion.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import Controlers.BaseDatos;
import FabricaApp.Interfaz.HomeFabic;
import ProcesoDeElaboracion.Interfaz.HomeProveedor;
import VentaDeCaramelos.Interfaz.HomeShopping;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends javax.swing.JPanel {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textPasword = new javax.swing.JPasswordField();
        buttonIniciar = new javax.swing.JButton();
        buttonRegistrate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicia Sesión.png"))); // NOI18N

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEmail.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email :");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Contraseña :");

        textPasword.setBackground(new java.awt.Color(204, 204, 204));
        textPasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPasword.setBorder(null);

        buttonIniciar.setBackground(new java.awt.Color(223, 93, 93));
        buttonIniciar.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonIniciar.setText("Iniciar ");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        buttonRegistrate.setBackground(new java.awt.Color(252, 252, 252));
        buttonRegistrate.setForeground(new java.awt.Color(255, 0, 0));
        buttonRegistrate.setText("Registrate");
        buttonRegistrate.setBorder(null);
        buttonRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrateActionPerformed(evt);
            }
        });

        jLabel6.setText("¿Aún no tienes una cuenta? ");

        comboBox.setBackground(new java.awt.Color(252, 252, 252));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Proveedor", "Empleado" }));
        comboBox.setBorder(null);
        comboBox.setFocusable(false);
        comboBox.setMinimumSize(new java.awt.Dimension(93, 23));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonRegistrate))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel4)
                                                                .addComponent(textEmail)
                                                                .addComponent(textPasword, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(buttonRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {
        String email = textEmail.getText();
        String password = String.valueOf(textPasword.getPassword());
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LoginPage.this);
        if(frame != null && (String)comboBox.getSelectedItem()=="Cliente"){
            Cliente cliente = new BaseDatos().validarLoginCliente(email, password);
            if (cliente!=null){
                frame.dispose();
                HomeShopping homeShopping = new HomeShopping(cliente);
                homeShopping.setLocationRelativeTo(null);
                homeShopping.setVisible(true);
            }
        } else if (frame != null && (String)comboBox.getSelectedItem()=="Proveedor") {
            Proveedor proveedor = new BaseDatos().validarLoginProveedor(email, password);
            if (proveedor!=null){
                frame.dispose();

                HomeProveedor homeProveedor = new HomeProveedor(proveedor);
                homeProveedor.setLocationRelativeTo(null);
                homeProveedor.setVisible(true);
            }
        } else if (frame != null && (String)comboBox.getSelectedItem()=="Empleado") {
            Empleado empleado = new BaseDatos().validarLoginEmpleado(email, password);
            if (empleado!=null){
                frame.dispose();
                HomeFabic homeFabic = new HomeFabic(empleado);
                homeFabic.setLocationRelativeTo(null);
                homeFabic.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Email o Contraseñas incorrectos");
        }
    }

    private void buttonRegistrateActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterPage registerPage = new RegisterPage();
        registerPage.setSize(482, 509);
        registerPage.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(registerPage, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JButton buttonRegistrate;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textPasword;
    // End of variables declaration
}
