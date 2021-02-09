/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Libro {
 private String titulo, autor ; 
 private int ano;
 private short numPaginas;
 private float valoracion;
 
 public Libro(){
     
 }
 public Libro(String tit,String autr,int an,short numP){
     titulo=tit;
     autor=autr;
     ano=an;
     numPaginas=numP;
 }
 public void setTitulo(String t){
     titulo=t;
 }
 public void setAutor(String autr){
     autor=autr;
 }
 public void setAno(int an){
     ano=an;
 }
 public void setNumPaginas(short numP){
     numPaginas=numP;
 }
 public void setValoracion(float val){
     valoracion=val;
 }
 public void amosar(){
     System.out.println("-----------------");
     System.out.println("Libros --->");
     System.out.println("Titulo= "+titulo);
     System.out.println("Autor= "+autor);
     System.out.println("Ano= "+ano);
     System.out.println("Paginas= "+numPaginas);
     System.out.println("Valoracion= "+valoracion);
 }
}

