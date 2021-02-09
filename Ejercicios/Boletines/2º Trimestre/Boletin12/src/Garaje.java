import java.util.Scanner;

public class Garaje {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int plazas=5;
        Coche bmw=new Coche("8657 AAA");
        bmw.aparcar(plazas);
        bmw.salir(plazas);
    }
}
