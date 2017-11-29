/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Boleto {

    private static int precio;
    private Asiento asiento;
    private Funcion funcion;
    
    public Boleto(int precio,Asiento asiento,Funcion f){
        this.precio=precio;
        this.asiento=asiento;
        this.funcion=f;
    }
    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Boleto.precio = precio;
    }
}
