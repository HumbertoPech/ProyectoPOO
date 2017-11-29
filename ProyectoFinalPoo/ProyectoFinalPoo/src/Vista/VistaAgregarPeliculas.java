
package Vista;

import javax.swing.JButton;
import javax.swing.JTextField;


public class VistaAgregarPeliculas extends javax.swing.JFrame {

    
    public VistaAgregarPeliculas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGuardarPelicula = new javax.swing.JButton();
        BotonLimpiarTextoNombrePelicula = new javax.swing.JButton();
        NombrePelicula = new javax.swing.JLabel();
        TextoNuevaPelicula = new javax.swing.JTextField();
        botonSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonGuardarPelicula.setText("Guargar");

        BotonLimpiarTextoNombrePelicula.setText("Limpiar");

        NombrePelicula.setText("nombre de nueva pelicula :");

        TextoNuevaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNuevaPeliculaActionPerformed(evt);
            }
        });

        botonSALIR.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(NombrePelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonGuardarPelicula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonLimpiarTextoNombrePelicula)
                        .addGap(23, 23, 23)
                        .addComponent(botonSALIR))
                    .addComponent(TextoNuevaPelicula))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePelicula)
                    .addComponent(TextoNuevaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiarTextoNombrePelicula)
                    .addComponent(botonGuardarPelicula)
                    .addComponent(botonSALIR))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNuevaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNuevaPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNuevaPeliculaActionPerformed

    
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
            java.util.logging.Logger.getLogger(VistaAgregarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarPeliculas().setVisible(true);
            }
        });
    }

    public JTextField getTextoNuevaPelicula(){
    return TextoNuevaPelicula;
    }
    
    public JButton getBotonNuevaPelicula(){
         return botonGuardarPelicula;
    }
    public JButton getBotonLimpiarTextoNuevaPelicula(){
       return BotonLimpiarTextoNombrePelicula;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLimpiarTextoNombrePelicula;
    private javax.swing.JLabel NombrePelicula;
    private javax.swing.JTextField TextoNuevaPelicula;
    private javax.swing.JButton botonGuardarPelicula;
    private javax.swing.JButton botonSALIR;
    // End of variables declaration//GEN-END:variables
}
