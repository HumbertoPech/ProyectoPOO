
package Modelo;


public class Asiento {
    
    String formatoAsiento; //letra,numero
    boolean disponibilidad; 
    
    public Asiento(){
        disponibilidad = true;
    }
    
    public boolean getDisponibilidadAsiento(){
     return disponibilidad;
    }
    public void setDisponivilidadAsiento(boolean disp){
     disponibilidad = disp;
    }
}
