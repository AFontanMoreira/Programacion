public class Boletin15_3 {
    public static void main(String[] args) {
        Metodos objeto=new Metodos();
        int[] notas=new int[6];
        String[] nombre=new String[6];

        notas=objeto.crearArray(notas);
        nombre=objeto.crearArray(nombre);
        objeto.visualizarGrupos(notas);
        objeto.visualizarAprobados(notas,nombre);
        // objeto.calMedia(notas);
        // objeto.notaAlta(notas,nombre);
        // objeto.ordenarNotas(notas, nombre);
        objeto.mostrarNota(notas, nombre);
    }
}
