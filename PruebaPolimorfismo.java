/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller14;

/**
 *
 * @author JESUS DAVID
 */
public class PruebaPolimorfismo {
    
    public static void main(String[] args) {
        
        
        Figura[] figuras = {new Circulo(5), new Rectangulo(4, 6)};
        
        for (Figura figura : figuras) {
            
            figura.calcularArea();
        }
    }
}
