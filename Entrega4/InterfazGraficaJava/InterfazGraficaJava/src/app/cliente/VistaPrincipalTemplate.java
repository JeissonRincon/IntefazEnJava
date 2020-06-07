package app.cliente;

//@author Jeisson

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaPrincipalTemplate extends JFrame{
    private JButton bEnviar;
    private JLabel letrero;
    private JTextField caja;
    
    public VistaPrincipalTemplate(){
        this.setTitle("Vista Principal");
        setSize(1200,700);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.yellow);
        this.setLayout(null);
        this.setVisible(true);        
    }
    
    public void saludar(){
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }  
}
