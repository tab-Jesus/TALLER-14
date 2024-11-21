
package co.edu.udec.s2.taller14;

/**
 *
 * @author JESUS DAVID
 */
public class Rectangulo extends Figura {
     
    double ancho;
     double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        
        this.alto = alto;
            }

    @Override
    public void calcularArea() {
        double area = ancho * alto;
        
        System.out.println("El área del rectángulo es: " + area);
     }
    
}
