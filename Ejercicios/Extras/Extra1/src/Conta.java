public class Conta {
    private String nomeCliente;
    private String numeroConta,contaOrigen,contaDestino;
    private double interese,saldo,importe;
   
    
    public Conta(){
        
    }
    public Conta(String nCli,String nCont,double inter,double sal){
        nomeCliente=nCli;
        numeroConta=nCont;
        interese=inter;
        saldo=sal;
    }
    public void setNumeroConta(String nCon){
        numeroConta=nCon;
    }
    public void setNomeCliente(String nCl){
        nomeCliente=nCl;
    }

    public void setInterese(double inte){
        interese=inte;
    }
    public void setSaldo(double sal){
        saldo=sal;
    }
    public void setIngreso(double ing){
       
        saldo=saldo+ing;
    }
    public void setReintegro(double rein){
        saldo=saldo+rein;
    }
    public void transferencia(Conta cuentaDestino, int sal){
    
        saldo=saldo-sal;
        cuentaDestino.saldo=cuentaDestino.saldo+sal;
        System.out.println(saldo);
        System.out.println(cuentaDestino.saldo);
    }
    
}
