public class Boletin9_2 {
    private int suma,contador=10;
    private double producto=1;
    public int operacionSuma(){

        while (contador>=10 && contador<=90){
            suma=suma+contador;
            contador++;
        }
        return suma;

    }
    public double operacionProducto(){

        contador=10;
        while (contador>=10 && contador<=90){
            producto=producto*contador;
            contador++;
        }
        return producto;
    }

}
