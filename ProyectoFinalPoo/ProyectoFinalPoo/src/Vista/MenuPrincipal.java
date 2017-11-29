/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;

/**
 *
 * @author CARLOS
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarPelicula = new javax.swing.JButton();
        botonRevisarHorarios = new javax.swing.JButton();
        botonComprarBoletos = new javax.swing.JButton();
        botonSALIR = new javax.swing.JButton();
        botonBorrarPelicula = new javax.swing.JButton();
        BotonConfiguracionSalas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAgregarPelicula.setText("Agregar Pelicula");

        botonRevisarHorarios.setText("Revisar Horarios");

        botonComprarBoletos.setText("Comprar Bolestos");

        botonSALIR.setText("SALIR");

        botonBorrarPelicula.setText("Borra Pelicula");

        BotonConfiguracionSalas.setText("Configuracion de salas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSALIR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonConfiguracionSalas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonAgregarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRevisarHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonComprarBoletos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonBorrarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonSALIR)
                .addGap(78, 78, 78)
                .addComponent(botonAgregarPelicula)
                .addGap(38, 38, 38)
                .addComponent(botonBorrarPelicula)
                .addGap(30, 30, 30)
                .addComponent(BotonConfiguracionSalas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(botonRevisarHorarios)
                .addGap(49, 49, 49)
                .addComponent(botonComprarBoletos)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public JButton getBotonAgregarPelicula() {
        return botonAgregarPelicula;
    }

    public JButton getBotonBorrarPelicula() {
        return botonBorrarPelicula;
    }

    public JButton getBotonComprarBoletos() {
        return botonComprarBoletos;
    }

    public JButton getBotonRevisarHorarios() {
        return botonRevisarHorarios;
    }

    public JButton getBotonSALIR() {
        return botonSALIR;
    }

    public JButton getBotonConfiguracionSalas() {
        return BotonConfiguracionSalas;
    }

    

    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConfiguracionSalas;
    private javax.swing.JButton botonAgregarPelicula;
    private javax.swing.JButton botonBorrarPelicula;
    private javax.swing.JButton botonComprarBoletos;
    private javax.swing.JButton botonRevisarHorarios;
    private javax.swing.JButton botonSALIR;
    // End of variables declaration//GEN-END:variables
}
