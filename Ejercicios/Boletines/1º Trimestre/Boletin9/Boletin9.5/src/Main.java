import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Boletin9_5 Ej5 = new Boletin9_5();
        int sueldo,trabajadores=0,bajo=0;
        float porcentaje;
        System.out.println("Dame un sueldo");
        sueldo= datos.nextInt();
        while (sueldo != 0){
            trabajadores++;
            if (Ej5.Ej5(sueldo)==false){
                bajo++;
            }
            System.out.println("Dame otro sueldo (o para salir)");
            sueldo= datos.nextInt();

        }
        porcentaje=bajo*100/trabajadores;
        System.out.println("Un "+porcentaje+"% de trabajadores tienen un sueldo mas bajo de 1000.");
    }
}
