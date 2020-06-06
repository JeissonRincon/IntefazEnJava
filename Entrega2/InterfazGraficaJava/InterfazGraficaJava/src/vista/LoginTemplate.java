package vista;

import java.awt.Color;
import javafx.scene.text.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


// @author Jeisson
 
public class LoginTemplate extends JFrame{
    
    private JPanel pSuperior,pIzquierda, pDerecha;
    private JLabel lTituloApp,lUsuario,lContraseña;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JButton bEntrar;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    
    public LoginTemplate(){
        super("Login de Animeflv");
        
        pSuperior = new JPanel();
        pSuperior.setSize(1000, 100);
        pSuperior.setLocation(0, 0);
        pSuperior.setLayout(null);
        pSuperior.setBackground(Color.black);
        this.add(pSuperior);
        
        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLayout(null);
        pDerecha.setLocation(600, 100);
        pDerecha.setBackground(Color.white);
        this.add(pDerecha);
        
        
        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLayout(null);
        pIzquierda.setLocation(0, 100);
        pIzquierda.setBackground(Color.lightGray);
        this.add(pIzquierda);
        
        lTituloApp = new JLabel("INICIAR SESION");
        lTituloApp.setBounds(150, 20, 200, 30);
        lTituloApp.setForeground(Color.BLACK);
        pDerecha.add(lTituloApp);
        
        lUsuario = new JLabel("Usuario");
        lUsuario.setBounds(50, 40, 200, 30);
        lUsuario.setBackground(Color.LIGHT_GRAY);
        pDerecha.add(lUsuario);
        
        tNombreUsuario = new JTextField();
        tNombreUsuario.setSize(300,40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth())/2, 70);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setCaretColor(Color.blue);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setBackground(Color.white);
        pDerecha.add(tNombreUsuario);
        
        lContraseña = new JLabel("Contraseña");
        lContraseña.setBounds(50, 120, 200, 30);
        lContraseña.setBackground(Color.LIGHT_GRAY);
        pDerecha.add(lContraseña);
        
        tClaveUsuario = new JPasswordField("Contraseña");
        tClaveUsuario.setSize(300,40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth())/2, 150);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.blue);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveUsuario.setBackground(Color.white);
        pDerecha.add(tClaveUsuario);
        
        bEntrar = new JButton("INICIAR SESIÓN");
        bEntrar.setSize(250,45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth())/2, 200);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setBackground(Color.blue);
        bEntrar.setFocusable(false);
        pDerecha.add(bEntrar);
        
        
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
}
