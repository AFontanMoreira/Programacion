import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
	Boletin9_1 Ej1 = new Boletin9_1();
	Ej1.Ej1();
	int ceros=Ej1.getCeros(),negativos=Ej1.getnNegativos(),positivos=Ej1.getnPositivos();
        System.out.println("Hay "+positivos+" positivos, "+negativos+" negativos y "+ ceros+" ceros");

    }
}
