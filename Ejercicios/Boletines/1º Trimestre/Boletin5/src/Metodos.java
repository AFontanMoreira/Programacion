/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author dam1a
 */
public class Metodos {
    Scanner datos =  new Scanner(System.in);
    public float getKm(){
        System.out.println("cuantos km?");
        float km =datos.nextFloat();
        return km;
        
    }
    public float getLt(){
        System.out.println("cuantos litros?");
        float lt =datos.nextFloat();
        return lt;
        
    }
    public float getVm(){
        System.out.println("cual el la velocidad media?");
        float vM =datos.nextFloat();
        return vM;
    }
    public float getPg(){
        System.out.println("cual es el precio de la gasolina?");
        float pG =(float)datos.nextFloat();
        return pG;
    }
}
