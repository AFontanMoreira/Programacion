public class Extra1 {


    public static void main(String[] args) {
       
       Conta cliente1= new Conta();
       Conta cliente2 =new Conta();
       
       cliente1.setNomeCliente("EL PEPE");
       cliente1.setNumeroConta("32546f");
       cliente1.setInterese(15);
       cliente1.setSaldo(4700);
       
       cliente2.setNomeCliente("EL PEPE");
       cliente2.setNumeroConta("32546f");
       cliente2.setInterese(15);
       cliente2.setSaldo(3600);

      // cliente1.setSaldo(1000);
       //cliente2.setSaldo(2000);
       cliente1.transferencia(cliente2, 100);
      
    }
    
}
