
package Modelo;


public class Pelicula {
    
    private String nombrePelicula;
    
    
    public Pelicula(String anombrePelicula){
        
        nombrePelicula = anombrePelicula;
        
    }
    public void setnombrePelicula(String nombre){
      nombrePelicula = nombre;
    }
    
    public String getNombrePelicula(){
        return nombrePelicula;
    }
}
