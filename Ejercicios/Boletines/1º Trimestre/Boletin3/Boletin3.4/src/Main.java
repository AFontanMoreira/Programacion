import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total;
        System.out.println("Teclea el dinero total");
        Scanner sc = new Scanner(System.in);
        total=sc.nextInt();
        System.out.println("Billetes 100: "+(total/100));
        System.out.println("Billetes 20: "+(total%100/20));
        System.out.println("Billetes 5: "+(total%100%20/5));
        System.out.println("Monedas 1: "+(total%100%20%5));
    }
}
