/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller14;

/**
 *
 * @author JESUS DAVID
 */
public class Circulo extends Figura {
     double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    Circulo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
    public void calcularArea() {
       
        double area = Math.PI *radio * radio;
        System.out.println("El área: " + area);
    }
    
}
