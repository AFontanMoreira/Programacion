import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    System.out.println("Ejercicio5");
    Boletin7_5 obj5 = new Boletin7_5();
    int numero1,numero2,numero3;
        System.out.println("Primer numero");
    numero1=dato.nextInt();
        System.out.println("Segundo numero");
    numero2=dato.nextInt();
        System.out.println("Tercer numero");
    numero3=dato.nextInt();
    obj5.Ej7_5(numero1,numero2,numero3);
    }


}
