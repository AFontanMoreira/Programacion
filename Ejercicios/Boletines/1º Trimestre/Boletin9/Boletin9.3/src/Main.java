import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Boletin9_3 Ej3 = new Boletin9_3();
        Boletin9_3 instancia = Boletin9_3.getInstance();
        float base,altura;
        System.out.println("Base:");
        base=datos.nextFloat();
        System.out.println("Altura:");
        altura=datos.nextFloat();
        System.out.println("El area es= "+instancia.areaRectangulo(base,altura));
       }
}
