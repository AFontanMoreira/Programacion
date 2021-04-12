import javax.swing.*;
import java.awt.*;

public class Ventana {
    JFrame marco;
    JPanel panel;
    JPasswordField contraseña;
    JButton bLimpiar,bPulsar;
    JLabel etqNombre,etqContraseña;
    JTextField lTextNome;
    JTextArea aTextCopy;

    public void iniciar (){

        marco = new JFrame("Marco con componentes");
        panel = new JPanel();
        bLimpiar = new JButton("LIMPIAR");
        bPulsar = new JButton("PULSAR");
        etqNombre = new JLabel("NOME :");
        etqContraseña = new JLabel("PASSWORD:");
        lTextNome = new JTextField();
        contraseña = new JPasswordField();
        aTextCopy = new JTextArea("Area de texto.");


        marco.setSize(800,800);
        panel.setSize(750,750);
        panel.setLayout(null);
        bLimpiar.setBounds(500,650,100,50);
        bPulsar.setBounds(200,650,100,50);
        lTextNome.setBounds(350,63,200,25);
        aTextCopy.setBounds(150,250,500,300);
        etqNombre.setBounds(200,50,100,50);
        contraseña.setBounds(350,110,200,25);
        etqContraseña.setBounds(200,100,100,50);



        panel.add(etqNombre);
        panel.add(lTextNome);
        panel.add(aTextCopy);
        panel.add(bPulsar);
        panel.add(bLimpiar);
        panel.add(etqContraseña);
        panel.add(contraseña);



        marco.add(panel);

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
