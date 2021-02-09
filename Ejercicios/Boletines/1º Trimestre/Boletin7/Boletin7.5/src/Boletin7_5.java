public class Boletin7_5 {
    public void Ej7_5(int num1,int num2,int num3){
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El mayor es:"+num1);
            }else System.out.println("El mayor es:"+num3);
        }else if (num2 > num3){
            System.out.println("El mayor es:"+num2);
        }else System.out.println("El mayor es:"+num3);
    }
}
