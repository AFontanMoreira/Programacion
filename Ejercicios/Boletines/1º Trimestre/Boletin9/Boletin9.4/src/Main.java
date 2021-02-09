import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Boletin9_4 Ej4 =new Boletin9_4();
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        while (numero != 0){
            Ej4.Ej4(numero);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero (0 para salir)"));
        }
}
}
