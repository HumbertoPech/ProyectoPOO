/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Humberto
 */
public class Sala {
    int numSala; 
    int numeroAsientos;
    Asiento asientos[][];
    
    public Sala(int anumSala){
     numSala = anumSala;
     numeroAsientos=25;
     asientos= new Asiento [5][5];
 }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }
    
    public int getSala(){
        return numSala;
    }

}
