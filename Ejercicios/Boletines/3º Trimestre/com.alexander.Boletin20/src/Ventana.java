import javax.swing.*;
import java.awt.*;

public class Ventana {
    JFrame marco;
    JPanel panel1,panel2;
    JPasswordField contraseña;
    JButton bLimpiar,bPulsar,bBoton;
    JLabel etqNombre,etqContraseña;
    JTextField lTextNome;
    JTextArea aTextCopy,lista;

    public void iniciar (){

        marco = new JFrame("Marco con componentes");
        panel1 = new JPanel();
        panel2 = new JPanel();
        bLimpiar = new JButton("LIMPIAR");
        bPulsar = new JButton("PULSAR");
        bBoton = new JButton("BOTON");
        etqNombre = new JLabel("NOME :");
        etqContraseña = new JLabel("PASSWORD:");
        lTextNome = new JTextField();
        contraseña = new JPasswordField();
        aTextCopy = new JTextArea("Area de texto.");
        lista = new JTextArea("ElementoLista1\nElementoLista2\nElementoLista3");


        marco.setSize(800,800);
        marco.setResizable(false);
        panel1.setSize(800,400);
        panel1.setLayout(null);
        bLimpiar.setBounds(500,325,100,50);
        bPulsar.setBounds(200,325,100,50);
        lTextNome.setBounds(350,63,200,25);

        etqNombre.setBounds(200,50,100,50);
        contraseña.setBounds(350,110,200,25);
        etqContraseña.setBounds(200,100,100,50);
        panel2.setSize(800,400);
        panel2.setBackground(Color.gray);
        panel2.setLayout(null);
        lista.setBounds(50,450,150,150);
        bBoton.setBounds(325,525,100,50);
        aTextCopy.setBounds(500,450,100,225);



        panel1.add(etqNombre);
        panel1.add(lTextNome);
        panel1.add(bPulsar);
        panel1.add(bLimpiar);
        panel1.add(etqContraseña);
        panel1.add(contraseña);

        panel2.add(lista);
        panel2.add(bBoton);
        panel2.add(aTextCopy);



        marco.add(panel1);
        marco.add(panel2);


        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
