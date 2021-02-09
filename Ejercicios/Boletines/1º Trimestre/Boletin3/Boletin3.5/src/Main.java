import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soldo, impTotalVendas, km, dias,sb;
        System.out.println("Introduce o soldo: ");
        soldo=sc.nextFloat();
        System.out.println("Intrduce o importe total de vendas: ");
        impTotalVendas=sc.nextFloat();
        System.out.println("Introduce os kilometros percorridos: ");
        km=sc.nextFloat();
        System.out.println("Introduce os días de desprazamento: ");
        dias=sc.nextFloat();
        System.out.println("Cun soldo fixo de "+ soldo +"€ o soldo bruto e o soldo líquido queda como: \nSoldo bruto: "+ (sb=((soldo)+((5/100)*impTotalVendas)+(2*km)+(30*dias)))+"€. \nSoldo liquido: "+ (sb-((18/100)*sb)-36)+"€.");
    }
}
