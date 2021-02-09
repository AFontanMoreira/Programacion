public class Boletin8_6 {
    public void Ej6(String nomb,int ventas){
        System.out.print(nomb+" tiene un rango: ");
        if (ventas <= 100){
            System.out.println("baixo");
        }else if (ventas<=500){
            System.out.println("medio");
        }else if (ventas<=1000){
            System.out.println("alto");
        }else System.out.println("de primeira necesidade");
    }
}
