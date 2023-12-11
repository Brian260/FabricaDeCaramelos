
package Autentificacion.Interfaz;

import java.awt.*;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        initComponents();
        initpage();
    }
    private void initpage() {
        LoginPage loginPage = new LoginPage();
        loginPage.setSize(482, 509);
        loginPage.setLocation(0,0);

        content.removeAll();
        content.add(loginPage, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGround.setBackground(new java.awt.Color(243, 176, 176));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 482, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 509, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle.png"))); // NOI18N

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
                backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                //.addGap(296, 296, 296)
                                                .addGap(320, 320, 320)
                                                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                //.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                //.addGap(320, 320, 320)
                                                .addGap(296, 296, 296)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                //.addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(353, Short.MAX_VALUE))
        );
        backGroundLayout.setVerticalGroup(
                backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1))
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private javax.swing.JPanel backGround;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
}
