public class Boletin5 {


    public static void main(String[] args) {
    Metodos datos= new Metodos();
    Consumo obj1 = new Consumo();
    Consumo obj2 = new Consumo(datos.getKm(),datos.getLt(),datos.getVm(),(float)datos.getPg());
    obj1.setLitros(50);
    obj1.setPGas(1.57f);
    //obj2.setLitros(10);
    System.out.println(obj2.getCmedio());
    System.out.println(obj2.getVmedia());
    
    }
    
}
