package FabricaApp.Interfaz;

import Autentificacion.Clases.Empleado;
import Autentificacion.Interfaz.Dashboard;
import Autentificacion.Interfaz.LoginPage;
import Autentificacion.Interfaz.PanelEdit;
import VentaDeCaramelos.Interfaz.AddPedido;

import java.awt.*;

public class HomeFabic extends javax.swing.JFrame {

    private Empleado empleado;
    public HomeFabic(Empleado empleado) {
        this.empleado=empleado;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonFabrica = new javax.swing.JButton();
        buttonPedidos = new javax.swing.JButton();
        buttonCliente = new javax.swing.JButton();
        buttonProveedores = new javax.swing.JButton();
        buttonEditUser = new javax.swing.JButton();
        buttonEmpleados = new javax.swing.JButton();
        buttonOperadores = new javax.swing.JButton();
        buttonProductos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 176, 176));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        buttonFabrica.setBackground(new java.awt.Color(252, 252, 252));
        buttonFabrica.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonFabrica.setText("Fábrica");
        buttonFabrica.setBorder(null);
        buttonFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFabricaActionPerformed(evt);
            }
        });

        buttonPedidos.setBackground(new java.awt.Color(252, 252, 252));
        buttonPedidos.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonPedidos.setText("Pedidos");
        buttonPedidos.setBorder(null);
        buttonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPedidosActionPerformed(evt);
            }
        });

        buttonCliente.setBackground(new java.awt.Color(252, 252, 252));
        buttonCliente.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonCliente.setText("Clientes");
        buttonCliente.setBorder(null);
        buttonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteActionPerformed(evt);
            }
        });

        buttonProveedores.setBackground(new java.awt.Color(252, 252, 252));
        buttonProveedores.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonProveedores.setText("Proveedores");
        buttonProveedores.setBorder(null);
        buttonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProveedoresActionPerformed(evt);
            }
        });

        buttonEditUser.setBackground(new java.awt.Color(252, 252, 252));
        buttonEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        buttonEditUser.setBorder(null);
        buttonEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditUserActionPerformed(evt);
            }
        });

        buttonEmpleados.setBackground(new java.awt.Color(252, 252, 252));
        buttonEmpleados.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonEmpleados.setText("Empleados");
        buttonEmpleados.setBorder(null);
        buttonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmpleadosActionPerformed(evt);
            }
        });

        buttonOperadores.setBackground(new java.awt.Color(252, 252, 252));
        buttonOperadores.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonOperadores.setText("Operadores");
        buttonOperadores.setBorder(null);
        buttonOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOperadoresActionPerformed(evt);
            }
        });

        buttonProductos.setBackground(new java.awt.Color(252, 252, 252));
        buttonProductos.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonProductos.setText("Productos");
        buttonProductos.setBorder(null);
        buttonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonFabrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(225, Short.MAX_VALUE))
                        .addComponent(buttonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonOperadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(buttonFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(buttonEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(243, 176, 176));

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Panel De Fabricación");

        buttonLogout.setBackground(new java.awt.Color(243, 176, 176));
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logaut.png"))); // NOI18N
        buttonLogout.setBorder(null);
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(buttonLogout)
                                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
    }

    private void buttonFabricaActionPerformed(java.awt.event.ActionEvent evt) {
        PanelFabric panelFabric = new PanelFabric();
        panelFabric.setSize(875, 501);
        panelFabric.setLocation(0,0);

        content.removeAll();
        content.add(panelFabric, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonPedidosActionPerformed(java.awt.event.ActionEvent evt) {
        PanelPedidos panelPedidos = new PanelPedidos(content);
        panelPedidos.setSize(875, 501);
        panelPedidos.setLocation(0,0);

        content.removeAll();
        content.add(panelPedidos, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonClienteActionPerformed(java.awt.event.ActionEvent evt) {
        PanelScroll panelScroll = new PanelScroll("Cliente");
        panelScroll.setSize(875, 501);
        panelScroll.setLocation(0,0);

        content.removeAll();
        content.add(panelScroll, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {
        PanelScroll panelScroll = new PanelScroll("Proveedor");
        panelScroll.setSize(875, 501);
        panelScroll.setLocation(0,0);

        content.removeAll();
        content.add(panelScroll, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {
        PanelScroll panelScroll = new PanelScroll("Empleado");
        panelScroll.setSize(875, 501);
        panelScroll.setLocation(0,0);

        content.removeAll();
        content.add(panelScroll, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonOperadoresActionPerformed(java.awt.event.ActionEvent evt) {
        PanelScroll panelScroll = new PanelScroll("Operador");
        panelScroll.setSize(875, 501);
        panelScroll.setLocation(0,0);

        content.removeAll();
        content.add(panelScroll, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonEditUserActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void buttonProductosActionPerformed(java.awt.event.ActionEvent evt) {
        PanelScroll panelScroll = new PanelScroll("Productos");
        panelScroll.setSize(875, 501);
        panelScroll.setLocation(0,0);

        content.removeAll();
        content.add(panelScroll, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonCliente;
    private javax.swing.JButton buttonEditUser;
    private javax.swing.JButton buttonEmpleados;
    private javax.swing.JButton buttonFabrica;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonOperadores;
    private javax.swing.JButton buttonPedidos;
    private javax.swing.JButton buttonProductos;
    private javax.swing.JButton buttonProveedores;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}

