
package Controlador;

import Modelo.Pelicula;
import Vista.VistaAgregarPeliculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControlNuevaPelicula implements ActionListener {
    
    private Pelicula pelicula;
    private VistaAgregarPeliculas vistanuevasPeliculas;
    
    public ControlNuevaPelicula(Pelicula np, VistaAgregarPeliculas vnp){
    
        pelicula = np;
        vistanuevasPeliculas = vnp;
        
        vistanuevasPeliculas.getBotonNuevaPelicula().addActionListener(this);
        vistanuevasPeliculas.getBotonLimpiarTextoNuevaPelicula().addActionListener(this);
        
    }
    
    
    public void actionPerformed(ActionEvent evento){
        
        if(vistanuevasPeliculas.getBotonNuevaPelicula() == evento.getSource()){
            String nombrePelicula;
            
            nombrePelicula = vistanuevasPeliculas.getTextoNuevaPelicula().getText();
            
           
        }
        
        
        if(vistanuevasPeliculas.getBotonLimpiarTextoNuevaPelicula() == evento.getSource()){
            String nulo = "";
           vistanuevasPeliculas.getTextoNuevaPelicula().setText(nulo);
           //el setText debe de "borrar" la cadena que esta en el campode texto de nuevas peliculas
        }
        
    }
  
}
