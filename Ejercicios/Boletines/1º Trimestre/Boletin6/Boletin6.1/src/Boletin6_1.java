/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam1a
 */
public class Boletin6_1 {

public static void main(String[] args) {
        // TODO code application logic here
        Coche seat = new Coche();
        System.out.println("Velocidad inicial: "+seat.getVelocidade());

        //incremento la velocidad en 25
        seat.acelerar(50);
        System.out.println("Velocidad actual: "+seat.getVelocidade());

        //reduzco en 15
        seat.frenar(15);
        System.out.println("Velocidad actual: "+seat.getVelocidade());
        
    }
    
}
