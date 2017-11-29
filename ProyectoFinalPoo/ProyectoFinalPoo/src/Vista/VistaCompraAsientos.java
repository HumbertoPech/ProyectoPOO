
package Vista;

import java.awt.Color;


public class VistaCompraAsientos extends javax.swing.JFrame {

    
    public VistaCompraAsientos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JLabel();
        AsientoA1 = new javax.swing.JButton();
        AsientoA2 = new javax.swing.JButton();
        AsientoA3 = new javax.swing.JButton();
        AsientoA4 = new javax.swing.JButton();
        AsientoA5 = new javax.swing.JButton();
        NumSala = new javax.swing.JLabel();
        AsientoB1 = new javax.swing.JButton();
        AsientoB2 = new javax.swing.JButton();
        AsientoB3 = new javax.swing.JButton();
        AsientoB4 = new javax.swing.JButton();
        AsientoB5 = new javax.swing.JButton();
        AsientoC1 = new javax.swing.JButton();
        AsientoC2 = new javax.swing.JButton();
        AsientoC3 = new javax.swing.JButton();
        AsientoC4 = new javax.swing.JButton();
        AsientoC5 = new javax.swing.JButton();
        AsientoD1 = new javax.swing.JButton();
        AsientoD2 = new javax.swing.JButton();
        AsientoD3 = new javax.swing.JButton();
        AsientoD4 = new javax.swing.JButton();
        AsientoD5 = new javax.swing.JButton();
        AsientoE1 = new javax.swing.JButton();
        AsientoE2 = new javax.swing.JButton();
        AsientoE3 = new javax.swing.JButton();
        AsientoE4 = new javax.swing.JButton();
        AsientoE5 = new javax.swing.JButton();
        imprimirNumeroSala = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ImprimirNombrePelicula = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla.setText("                                                       Pantalla");

        AsientoA1.setBackground(new java.awt.Color(153, 153, 255));
        AsientoA1.setText("A1");

        AsientoA2.setBackground(new java.awt.Color(153, 153, 255));
        AsientoA2.setText("A2");
        AsientoA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsientoA2ActionPerformed(evt);
            }
        });

        AsientoA3.setBackground(new java.awt.Color(153, 153, 255));
        AsientoA3.setText("A3");

        AsientoA4.setBackground(new java.awt.Color(153, 153, 255));
        AsientoA4.setText("A4");

        AsientoA5.setBackground(new java.awt.Color(153, 153, 255));
        AsientoA5.setText("A5");

        NumSala.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        NumSala.setText("Sala No:");

        AsientoB1.setBackground(new java.awt.Color(153, 153, 255));
        AsientoB1.setText("B1");

        AsientoB2.setBackground(new java.awt.Color(153, 153, 255));
        AsientoB2.setText("B2");

        AsientoB3.setBackground(new java.awt.Color(153, 153, 255));
        AsientoB3.setText("B3");

        AsientoB4.setBackground(new java.awt.Color(153, 153, 255));
        AsientoB4.setText("B4");

        AsientoB5.setBackground(new java.awt.Color(153, 153, 255));
        AsientoB5.setText("B5");

        AsientoC1.setBackground(new java.awt.Color(153, 153, 255));
        AsientoC1.setText("C1");

        AsientoC2.setBackground(new java.awt.Color(153, 153, 255));
        AsientoC2.setText("C2");

        AsientoC3.setBackground(new java.awt.Color(153, 153, 255));
        AsientoC3.setText("C3");

        AsientoC4.setBackground(new java.awt.Color(153, 153, 255));
        AsientoC4.setText("C4");

        AsientoC5.setBackground(new java.awt.Color(153, 153, 255));
        AsientoC5.setText("C5");

        AsientoD1.setBackground(new java.awt.Color(153, 153, 255));
        AsientoD1.setText("D1");

        AsientoD2.setBackground(new java.awt.Color(153, 153, 255));
        AsientoD2.setText("D2");

        AsientoD3.setBackground(new java.awt.Color(153, 153, 255));
        AsientoD3.setText("D3");

        AsientoD4.setBackground(new java.awt.Color(153, 153, 255));
        AsientoD4.setText("D4");

        AsientoD5.setBackground(new java.awt.Color(153, 153, 255));
        AsientoD5.setText("D5");

        AsientoE1.setBackground(new java.awt.Color(153, 153, 255));
        AsientoE1.setText("E1");
        AsientoE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsientoE1ActionPerformed(evt);
            }
        });

        AsientoE2.setBackground(new java.awt.Color(153, 153, 255));
        AsientoE2.setText("E2");
        AsientoE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsientoE2ActionPerformed(evt);
            }
        });

        AsientoE3.setBackground(new java.awt.Color(153, 153, 255));
        AsientoE3.setText("E3");

        AsientoE4.setBackground(new java.awt.Color(153, 153, 255));
        AsientoE4.setText("E4");

        AsientoE5.setBackground(new java.awt.Color(153, 153, 255));
        AsientoE5.setText("E5");

        imprimirNumeroSala.setText("           N");

        jLabel1.setText("Pelicula :");

        ImprimirNombrePelicula.setText("jLabel2");

        jButton1.setText("Regresar");

        jButton2.setText("Cancelar");

        jLabel2.setText("Horario :");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImprimirNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AsientoC1)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoC2)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoC3)
                                .addGap(12, 12, 12)
                                .addComponent(AsientoC4)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoC5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AsientoA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AsientoB1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AsientoA2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AsientoA3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoA4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AsientoA5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AsientoB2)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoB3)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoB4)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoB5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AsientoD1)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoD2)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoD3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AsientoD4)
                                .addGap(18, 18, 18)
                                .addComponent(AsientoD5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AsientoE1)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoE2)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoE3)
                                        .addGap(18, 18, 18)
                                        .addComponent(AsientoE4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NumSala)
                                        .addGap(18, 18, 18)
                                        .addComponent(imprimirNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(AsientoE5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ImprimirNombrePelicula)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumSala)
                    .addComponent(imprimirNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsientoE1)
                    .addComponent(AsientoE2)
                    .addComponent(AsientoE3)
                    .addComponent(AsientoE4)
                    .addComponent(AsientoE5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsientoD1)
                    .addComponent(AsientoD2)
                    .addComponent(AsientoD3)
                    .addComponent(AsientoD4)
                    .addComponent(AsientoD5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsientoC1)
                    .addComponent(AsientoC2)
                    .addComponent(AsientoC3)
                    .addComponent(AsientoC4)
                    .addComponent(AsientoC5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsientoB1)
                    .addComponent(AsientoB2)
                    .addComponent(AsientoB3)
                    .addComponent(AsientoB4)
                    .addComponent(AsientoB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsientoA1)
                    .addComponent(AsientoA2)
                    .addComponent(AsientoA3)
                    .addComponent(AsientoA4)
                    .addComponent(AsientoA5))
                .addGap(67, 67, 67)
                .addComponent(Pantalla)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsientoA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsientoA2ActionPerformed
       
    }//GEN-LAST:event_AsientoA2ActionPerformed

    private void AsientoE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsientoE1ActionPerformed
      
       if(AsientoE1.getBackground() == Color.RED){
           AsientoE1.setBackground(Color.BLUE);
       }else{
           AsientoE1.setBackground(Color.RED);
       }
       
    }//GEN-LAST:event_AsientoE1ActionPerformed

    private void AsientoE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsientoE2ActionPerformed
        if(AsientoE2.getBackground() == Color.RED){
           AsientoE2.setBackground(Color.BLUE);
       }else{
           AsientoE2.setBackground(Color.RED);
       }
    }//GEN-LAST:event_AsientoE2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCompraAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCompraAsientos().setVisible(true);
            }
        });
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsientoA1;
    private javax.swing.JButton AsientoA2;
    private javax.swing.JButton AsientoA3;
    private javax.swing.JButton AsientoA4;
    private javax.swing.JButton AsientoA5;
    private javax.swing.JButton AsientoB1;
    private javax.swing.JButton AsientoB2;
    private javax.swing.JButton AsientoB3;
    private javax.swing.JButton AsientoB4;
    private javax.swing.JButton AsientoB5;
    private javax.swing.JButton AsientoC1;
    private javax.swing.JButton AsientoC2;
    private javax.swing.JButton AsientoC3;
    private javax.swing.JButton AsientoC4;
    private javax.swing.JButton AsientoC5;
    private javax.swing.JButton AsientoD1;
    private javax.swing.JButton AsientoD2;
    private javax.swing.JButton AsientoD3;
    private javax.swing.JButton AsientoD4;
    private javax.swing.JButton AsientoD5;
    private javax.swing.JButton AsientoE1;
    private javax.swing.JButton AsientoE2;
    private javax.swing.JButton AsientoE3;
    private javax.swing.JButton AsientoE4;
    private javax.swing.JButton AsientoE5;
    private javax.swing.JLabel ImprimirNombrePelicula;
    private javax.swing.JLabel NumSala;
    private javax.swing.JLabel Pantalla;
    private javax.swing.JLabel imprimirNumeroSala;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
