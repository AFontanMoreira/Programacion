import java.util.Scanner;


public class Boletin4 {


    public static void main(String[] args) {
     Libro objLibro1= new Libro();
     Scanner sc = new Scanner(System.in);
     System.out.println("Titulo: ");
     String t = sc.nextLine();
     System.out.println("Autor: ");
     String aut=sc.nextLine();
     System.out.println("Ano: ");
     int ano = sc.nextInt();
     System.out.println("Numero de paginas: ");
     short numP = sc.nextShort();
     System.out.println("Valoracion: ");
     float val = sc.nextFloat();

     objLibro1.setTitulo(t);
     objLibro1.setAutor(aut);
     objLibro1.setAno(ano);
     objLibro1.setNumPaginas(numP);
     objLibro1.setValoracion(val);
     objLibro1.amosar();
     
     //Libro objLibro2 = new Libro("Valkiria: Game Over","David Lozano Garbala",2018,(short)290);
     //objLibro2.amosar();
    }
    
}
