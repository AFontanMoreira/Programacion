/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam1a
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(1);
        System.out.println("Longitud circunferencia: "+circulo1.calcularLonxitude());
        
        Circulo circulo2 = new Circulo(3);
        System.out.println("Área del circulo de radio "+circulo2.getRadio()+" es: "+circulo2.calcularArea());
    }
    
}
