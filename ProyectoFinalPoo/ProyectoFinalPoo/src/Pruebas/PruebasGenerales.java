
package Pruebas;

import Controlador.ControlNuevaPelicula;
import Modelo.Pelicula;
import Vista.VistaAgregarPeliculas;


public class PruebasGenerales {
    public static void main(String[] args) {
        
    
    Pelicula peli = new Pelicula();
    
    VistaAgregarPeliculas vistaNP = new VistaAgregarPeliculas();
    
    ControlNuevaPelicula ControlNP = new ControlNuevaPelicula( peli, vistaNP);
    
       vistaNP.setVisible(true);
       
    }
}
