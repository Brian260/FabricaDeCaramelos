package Autentificacion.Interfaz;

import Autentificacion.Clases.Cliente;
import Autentificacion.Clases.Empleado;
import Autentificacion.Clases.Proveedor;
import Controlers.BaseDatos;
import Controlers.GenerarID;
import FabricaApp.Clases.Empresa;
import FabricaApp.Interfaz.HomeFabic;
import ProcesoDeElaboracion.Clases.MateriaPrima;
import ProcesoDeElaboracion.Interfaz.HomeProveedor;
import VentaDeCaramelos.Clases.Compra;
import VentaDeCaramelos.Interfaz.HomeShopping;

import javax.swing.*;
import java.awt.*;

public class RegisterPage extends javax.swing.JPanel {

    public RegisterPage() {
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
        buttonRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonIniciar = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registrate.png"))); // NOI18N

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

        buttonRegistrar.setBackground(new java.awt.Color(223, 93, 93));
        buttonRegistrar.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonRegistrar.setText("Registrarse");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("¿Ya tienes una cuenta? ");

        buttonIniciar.setBackground(new java.awt.Color(252, 252, 252));
        buttonIniciar.setForeground(new java.awt.Color(255, 0, 0));
        buttonIniciar.setText("Iniciar");
        buttonIniciar.setBorder(null);
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        textName.setBackground(new java.awt.Color(204, 204, 204));
        textName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textName.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre :");

        comboBox.setBackground(new java.awt.Color(252, 252, 252));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Proveedor", "Empleado" }));


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonIniciar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel4)
                                                                .addComponent(textEmail)
                                                                .addComponent(textPasword, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                                                .addComponent(textName)))))
                                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        String name = textName.getText();
        String email = textEmail.getText();
        String password = String.valueOf(textPasword.getPassword());
        GenerarID idUsuario = new GenerarID();

        if (name.isEmpty()||email.isEmpty()||password.isEmpty())
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        else if ((int)password.length()<=7) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener más de 8 caracteres");
        } else if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            JOptionPane.showMessageDialog(this, "El email no es correcto");
        } else {
            try {

                String id = idUsuario.generarIDUsuario(name, email);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(RegisterPage.this);
                if (frame != null) {
                    switch ((String) comboBox.getSelectedItem()) {
                        case "Cliente":
                            Cliente cliente = new Cliente(id, name, email, password, 500, new Compra());
                            new BaseDatos().guardarDatos(cliente);
                            frame.dispose();

                            HomeShopping homeShopping = new HomeShopping(cliente);
                            homeShopping.setLocationRelativeTo(null);
                            homeShopping.setVisible(true);

                            break;
                        case "Proveedor":
                            Proveedor proveedor = new Proveedor(id, name, email, password, 500);
                            new BaseDatos().guardarDatos(proveedor);
                            frame.dispose();

                            HomeProveedor homeProveedor = new HomeProveedor(proveedor);
                            homeProveedor.setLocationRelativeTo(null);
                            homeProveedor.setVisible(true);

                            break;
                        case "Empleado":
                            Empleado empleado = new Empleado(id, name, email, password, 250, "trabajador de Maquianria", new Empresa());
                            new BaseDatos().guardarDatos(empleado);
                            frame.dispose();

                            HomeFabic homeFabic = new HomeFabic(empleado);
                            homeFabic.setLocationRelativeTo(null);
                            homeFabic.setVisible(true);

                            break;
                    }
                }
            }catch (NumberFormatException e){
            }
        }
    }

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {
        LoginPage loginPage = new LoginPage();
        loginPage.setSize(482, 509);
        loginPage.setLocation(0,0);

        jPanel1.removeAll();
        jPanel1.add(loginPage, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPasword;
    // End of variables declaration
}
