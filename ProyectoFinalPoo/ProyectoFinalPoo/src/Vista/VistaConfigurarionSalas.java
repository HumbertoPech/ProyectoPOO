/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author CARLOS
 */
public class VistaConfigurarionSalas extends javax.swing.JFrame {

    /**
     * Creates new form SelecionarHorarioPelicula
     */
    public VistaConfigurarionSalas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaCambiosSalas = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        cajaPeliculaHorarioA = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        cajaPeliculaHorarioB = new javax.swing.JComboBox<>();
        jCheckBox3 = new javax.swing.JCheckBox();
        cajaPeliculaHorarioC = new javax.swing.JComboBox<>();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajaCambiosSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR SALA", "SALA 1", "SALA 2" }));

        jCheckBox1.setText("Horario A");

        cajaPeliculaHorarioA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR PELICULA", "PELICULA 1", "PELICULA 2", "PELICULA 3", "PELICULA 4" }));

        jCheckBox2.setText("Horario B ");

        cajaPeliculaHorarioB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR PELICULA", "PELICULA 1", "PELICULA 2", "PELICULA 3", "PELICULA 4" }));

        jCheckBox3.setText("Horario C");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        cajaPeliculaHorarioC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR PELICULA", "PELICULA 1", "PELICULA 2", "PELICULA 3", "PELICULA 4" }));

        BotonGuardar.setText("Guardar");

        BotonLimpiar.setText("Limpiar ");

        BotonSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaCambiosSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addGap(40, 40, 40)
                                        .addComponent(cajaPeliculaHorarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cajaPeliculaHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(jCheckBox2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaPeliculaHorarioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(BotonGuardar)
                        .addGap(81, 81, 81)
                        .addComponent(BotonLimpiar)
                        .addGap(85, 85, 85)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(cajaCambiosSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(cajaPeliculaHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(cajaPeliculaHorarioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(cajaPeliculaHorarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonSalir))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaConfigurarionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConfigurarionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConfigurarionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConfigurarionSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConfigurarionSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> cajaCambiosSalas;
    private javax.swing.JComboBox<String> cajaPeliculaHorarioA;
    private javax.swing.JComboBox<String> cajaPeliculaHorarioB;
    private javax.swing.JComboBox<String> cajaPeliculaHorarioC;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    // End of variables declaration//GEN-END:variables
}
