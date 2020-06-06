package vista;

//@author Jeisson

import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Image;


public class LoginTemplate extends JFrame{
    
    private JPanel pSuperior,pIzquierda, pDerecha;
    private JLabel lTituloApp,lUsuario,lContraseña,lNombrePagina,lFLV,lImagen;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JButton bEntrar,bTwich,bFace,bYoutube,bDiscord;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    
    private Color colorAzulMarino,colorNegro;
    private Font fontNombrePagina, fontFLV, fontIniciarSesion,fontSubtitulos;
    private ImageIcon iFondo,iTwich,iFace,iYoutube,iDiscord,iAux;
    
    
    public LoginTemplate(){
        super("Login de Animeflv");
        
        colorAzulMarino = new Color(40,221,221);
        colorNegro = new Color(21,20,19);
        fontNombrePagina = new Font("Rockwell Extra Bold",Font.PLAIN,30);
        fontFLV = new Font("Rockwell Extra Bold",Font.ITALIC,35);
        fontIniciarSesion = new Font("Georgia",Font.BOLD,14);
        fontSubtitulos = new Font("Georgia",Font.PLAIN,12);
        iFondo = new ImageIcon("recursos/imagenes/portada.jpg");
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.jpg");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.jpg");
        
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
        
        iAux= new ImageIcon(iFondo.getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING));
        
        lImagen = new JLabel();
        lImagen.setBounds(40, 20, 500, 300);
        lImagen.setIcon(iAux);
        pIzquierda.add(lImagen);
        
        
        lNombrePagina = new JLabel("anime");
        lNombrePagina.setBounds(50, 10, 120, 50);
        lNombrePagina.setForeground(Color.WHITE);
        lNombrePagina.setFont(fontNombrePagina);
        pSuperior.add(lNombrePagina);
        
        lFLV = new JLabel("flv");
        lFLV.setBounds(170, 10, 100, 50);
        lFLV.setForeground(colorAzulMarino);
        lFLV.setFont(fontFLV);
        pSuperior.add(lFLV);
        
        iAux= new ImageIcon(iTwich.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bTwich = new JButton();
        bTwich.setSize(50,50);
        bTwich.setLocation(500,10);
        bTwich.setIcon(iAux);
        bTwich.setFocusable(false);
        pSuperior.add(bTwich);
        
        iAux= new ImageIcon(iYoutube.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bYoutube = new JButton();
        bYoutube.setSize(50,50);
        bYoutube.setLocation(430,10);
        bYoutube.setIcon(iAux);
        bYoutube.setFocusable(false);
        pSuperior.add(bYoutube);
        
        iAux= new ImageIcon(iDiscord.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bDiscord = new JButton();
        bDiscord.setSize(50,50);
        bDiscord.setLocation(360,10);
        bDiscord.setIcon(iAux);
        bDiscord.setFocusable(false);
        pSuperior.add(bDiscord);
        
        iAux= new ImageIcon(iFace.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bFace = new JButton();
        bFace.setSize(50,50);
        bFace.setLocation(900,10);
        bFace.setIcon(iAux);
        bFace.setFocusable(false);
        pSuperior.add(bFace);
        
        lTituloApp = new JLabel("INICIAR SESION");
        lTituloApp.setBounds(150, 20, 200, 30);
        lTituloApp.setForeground(Color.BLACK);
        lTituloApp.setFont(fontIniciarSesion);
        pDerecha.add(lTituloApp);
        
        lUsuario = new JLabel("Usuario");
        lUsuario.setBounds(50, 40, 200, 30);
        lUsuario.setBackground(Color.LIGHT_GRAY);
        lUsuario.setFont(fontSubtitulos);
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
        lContraseña.setFont(fontSubtitulos);
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
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth())/2, 210);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setBackground(colorNegro);
        bEntrar.setFocusable(false);
        pDerecha.add(bEntrar);
        
        
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
}
