/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JInternalFrames;

import Clases.Perro;

/**
 *
 * @author Rony Stico
 */
public class A21 extends javax.swing.JInternalFrame {

    /**
     * Creates new form A21
     */
    public A21() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btno1 = new javax.swing.JButton();
        btno2 = new javax.swing.JButton();
        btno3 = new javax.swing.JButton();
        txtmensaje = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Prueba de JClass");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("POO"));

        btno1.setText("Objeto 1");
        btno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btno1ActionPerformed(evt);
            }
        });

        btno2.setText("Objeto 2");
        btno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btno2ActionPerformed(evt);
            }
        });

        btno3.setText("Objeto 3");
        btno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btno3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btno3)
                    .addComponent(btno2)
                    .addComponent(btno1))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmensaje)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btno1)
                .addGap(18, 18, 18)
                .addComponent(btno2)
                .addGap(18, 18, 18)
                .addComponent(btno3)
                .addGap(18, 18, 18)
                .addComponent(txtmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btno1ActionPerformed
        Perro perrito = new Perro();
        perrito.nombre="Chizu";
        perrito.raza="Pastor Alem??n";
        perrito.altura="0.70";

        String mensaje=perrito.comer("Pollo");
        txtmensaje.setText(mensaje);

    }//GEN-LAST:event_btno1ActionPerformed

    private void btno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btno2ActionPerformed
        Perro perrito2 = new Perro();
        perrito2.nombre="Lazy";
        perrito2.altura="0.60";

        String mensaje=perrito2.comer("Pan");
        txtmensaje.setText(mensaje);
    }//GEN-LAST:event_btno2ActionPerformed

    private void btno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btno3ActionPerformed
        Perro perrito = new Perro("Peluch??n","Poodle","0.50 cm");

        String mensaje = perrito.comer("Pavita");
        txtmensaje.setText(mensaje);
    }//GEN-LAST:event_btno3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btno1;
    private javax.swing.JButton btno2;
    private javax.swing.JButton btno3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtmensaje;
    // End of variables declaration//GEN-END:variables
}
