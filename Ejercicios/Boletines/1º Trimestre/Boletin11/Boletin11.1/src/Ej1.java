

import javax.swing.*;

public class Ej1 {

    private int num;
    private int intentos;
    private int respuesta;

    public void establecerJuego(){
        boolean correcto = false;
        do{
            num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 50:"));
            if(num > 0 && num <= 50){
                correcto = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
            }
        }while(correcto == false);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de intentos del juego:"));
    }

    public void iniciarJuego(){
        this.establecerJuego();
        for(int i= 0; i < intentos; i++){
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivine un número entre 1 y 50:"));
            if(respuesta > num){
                JOptionPane.showMessageDialog(null, "El número es menor");
            }
            else if(respuesta < num){
                JOptionPane.showMessageDialog(null, "El número es mayor");
            }
            else{
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Se han terminado los intentos");
    }
}
