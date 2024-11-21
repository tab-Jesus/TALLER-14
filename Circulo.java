

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
     @Override
    public void calcularArea() {
       
        double area = Math.PI *radio * radio;
        System.out.println("El área: " + area);
    }
    
}
