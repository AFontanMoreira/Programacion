

import javax.swing.*;
import java.util.Random;

public class Ej2 {
    public void iniciarJuego(){
        Random aleatorio= new Random();
        int num= 1+aleatorio.nextInt(50);
        int intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de intentos del juego:"));
        for(int i= 0; i < intentos; i++){
            int respuesta= Integer.parseInt(JOptionPane.showInputDialog("Adivine un número entre 1 y 50:"));
            if(respuesta == num){
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                break;
            }
            else if(Math.abs(num-respuesta) <= 5){
                JOptionPane.showMessageDialog(null, "Muy cerca");
            }
            else if(Math.abs(num-respuesta) <= 10){
                JOptionPane.showMessageDialog(null, "Cerca");
            }
            else if(Math.abs(num-respuesta) <= 20){
                JOptionPane.showMessageDialog(null, "Lejos");
            }
            else if(Math.abs(num-respuesta) > 20){
                JOptionPane.showMessageDialog(null, "Muy lejos");
            }
        }
        JOptionPane.showMessageDialog(null, "Se han terminado los intentos");
    }
}
