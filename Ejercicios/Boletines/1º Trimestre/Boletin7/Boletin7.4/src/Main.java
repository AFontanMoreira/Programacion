import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    System.out.println("Ejercicio4");
    Boletin7_4 obj4 = new Boletin7_4();
    String nome1,nome2;
    float peso1,peso2;
    System.out.println("Dame dos nombres");
    nome1=dato.next();
    nome2=dato.next();
    System.out.println("Dame sus pesos correspondientes:");
    peso1 = dato.nextFloat();
    peso2 = dato.nextFloat();
    obj4.Ej7_4(nome1,peso1,nome2,peso2);
    }


}
