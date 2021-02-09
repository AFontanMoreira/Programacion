public class Boletin15_2 {
    public static void main(String[] args) {
        Metodos objeto=new Metodos();
        int[] notas=new int[30];

        notas=objeto.crearArray(notas);
        objeto.visualizarGrupos(notas);
        objeto.calcularMedia(notas);
        objeto.notaAlta(notas);
    }
}
