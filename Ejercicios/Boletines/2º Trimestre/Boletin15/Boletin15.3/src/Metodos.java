import javax.swing.*;

public class Metodos {
    public int[] crearArray(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*10)+1;
        }
        return lista;
    }
    public String[] crearArray(String[]nombre){
        for(int i=0;i<nombre.length;i++){
            nombre[i]= JOptionPane.showInputDialog(null,"Introduzca nombre");
        }
        return nombre;
    }

    public void visualizarGrupos(int[] lista){
        int aprobados=0,suspensos=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>=5){
                aprobados++;
            }
            else{
                suspensos++;
            }
        }
        JOptionPane.showMessageDialog(null,"El número de aprobados es de: "+ aprobados+"\nEl número de suspensos es de: "+ suspensos);
    }

    public void visualizarAprobados(int[] lista,String[]nombre){
        for(int i=0;i<lista.length;i++){
            if(lista[i]>=5){
                System.out.println(lista[i]+ " " + nombre[i]);
            }
        }
    }
    public void calMedia(int[] lista){
        int media=0;
        for(int i=0;i<lista.length-1;i++){
            media=media+lista[i];
        }
        media=media/lista.length;
        JOptionPane.showMessageDialog(null,"La media es de: "+media);
    }
    public void notaAlta(int[] lista,String[]nombre){
        int notaAlta=0;
        int posicion=0;
        for (int i=0;i<lista.length-1;i++){
            if(lista[i]>notaAlta){
                notaAlta=lista[i];
                posicion=i;
            }
        }
        JOptionPane.showMessageDialog(null,"La nota mas alta es: un "+ notaAlta + " y es de: " +nombre[posicion]);
    }

    public void ordenarNotas(int[]lista,String[]nombre){
        int aux;
        String auxs;
        for (int i=0;i<lista.length-1;i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                    auxs=nombre[i];
                    nombre[i]=nombre[j];
                    nombre[j]=auxs;
                }
            }
        }
        System.out.println("Notas ordenadas");
        for (int i=0;i<lista.length;i++){
            System.out.println(lista[i] + nombre[i]);
        }
    }
    public void mostrarNota(int[]lista,String[]nombre){
        String buscado=JOptionPane.showInputDialog(null,"Introduzca nombre del alumno para buscar su nota");
        for(int i=0;i<lista.length-1;i++){
            for(int j=0;j<nombre.length-1;j++)
                if(nombre[j].equals(buscado)){
                    JOptionPane.showMessageDialog(null,"La nota de "+buscado+" es de: "+lista[i]);
                    break;
                }
        }
    }
}
