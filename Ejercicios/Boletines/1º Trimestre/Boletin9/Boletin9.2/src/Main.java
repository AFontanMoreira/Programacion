import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Boletin9_2 Ej2 = new Boletin9_2();
        System.out.println("suma= "+Ej2.operacionSuma());
        System.out.println("Producto="+Ej2.operacionProducto());
    }
}
