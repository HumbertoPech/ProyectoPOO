
package Modelo;


public class Funcion {
    
    private Sala sala;
    private Pelicula pelicula;
    private String horario;
    
    public Funcion(Sala asala, Pelicula apelicula, String ahorario){
      
        sala = asala;
        pelicula = apelicula;
        horario = ahorario;
         
    }
    
    public int  getSala(){
       return sala.getSala();
    }
    
    public String getHorario(){
        return horario;
        
    }
    
    public String getPeliucla(){
     return pelicula.getNombrePelicula();
    }
    
//    public int selecAsiento(){
//    
//      return sala.getAsientos();
//    }

    
    
    
    
    
}
