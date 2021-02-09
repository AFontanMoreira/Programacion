import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    System.out.println("Ejercicio2");
    Boletin7_2 obj2 = new Boletin7_2();
    System.out.println("Primer numero:");
    short num1 = dato.nextShort();
    System.out.println("Segundo numero:");
    short num2 = dato.nextShort();
    obj2.Ej7_2(num1,num2);
    }


}
