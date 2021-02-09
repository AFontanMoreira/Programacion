import javax.swing.*;

public class Coche {
    String matricula;
    public Coche (String matricula) {this.matricula= matricula;}
    public void setMatricula(String matricula) {this.matricula= matricula;}
    public String getMatricula() {return matricula;}
    public void aparcar(int plazas){
        if (plazas>0){
            plazas--;
            System.out.println("El coche con la matricula "+matricula+" a sido reguistrado, quedan "+plazas+" plazas");

        }else {System.out.println("No quedan plazas disponibles");}
    }

    public void salir(int plazas){
        plazas++;
        int numeroDeHoras=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de Horas:"));
        double precio;
        if (numeroDeHoras<3){
            precio=1.5;
        }else precio=1.5+(0.2*numeroDeHoras);
        System.out.println("El precio a pagar por:"+numeroDeHoras+"horas es="+precio);
        double cambio = 0;
        boolean suficienteCambio = false;
        while (suficienteCambio==false){
            double precioPagado=Double.parseDouble(JOptionPane.showInputDialog("Introduce dinero a pagar:"));
            cambio = precioPagado-precio;
            if (cambio < 0){
                System.out.println("Cantidad de dinero menor a la requerida inserte otra cantidad.");
                suficienteCambio=false;
            }else suficienteCambio=true;
        }
        System.out.println("Su cambio es:"+cambio);
        System.out.println("Gracias por usar nuestro garaje");
    }
}
