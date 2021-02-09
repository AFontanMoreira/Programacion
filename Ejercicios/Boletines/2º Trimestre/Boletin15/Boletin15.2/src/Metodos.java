import javax.swing.*;

public class Metodos {
    public int[] crearArray(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*10)+1;
        }
        return lista;
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
    public void calcularMedia(int[] lista){
        int media=0;
        for(int i=0;i<lista.length-1;i++){
            media=media+lista[i];
        }
        media=media/lista.length;
        JOptionPane.showMessageDialog(null,"La media es de: "+media);
    }
    public void notaAlta(int[] lista){
        int notaAlta=0;
        for (int i=0;i<lista.length-1;i++){
            if(lista[i]>notaAlta){
                notaAlta=lista[i];
            }
        }
        JOptionPane.showMessageDialog(null,"La nota mas alta es de: "+ notaAlta);
    }
}
