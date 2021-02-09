import javax.swing.*;

public class Boletin9_1 {
    public int contador=0,nPositivos=0,nNegativos=0,ceros=0,numero;

    public void Ej1(){
        while (contador<10){
            numero=Integer.parseInt(JOptionPane.showInputDialog("dame un numero"));
            if (numero < 0){
                nNegativos++;
            }
            if (numero == 0){
                ceros++;
            }
            if (numero > 0){
                nPositivos++;
            }
            contador++;
        }
    }
    public int getnNegativos(){
        return nNegativos;
    }
    public int getnPositivos(){
        return nPositivos;
    }
    public int getCeros(){
        return ceros;
    }
}
