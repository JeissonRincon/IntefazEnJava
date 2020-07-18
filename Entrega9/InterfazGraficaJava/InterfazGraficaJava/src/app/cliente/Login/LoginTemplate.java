package app.cliente.Login;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Image;


public class LoginTemplate extends JFrame{
    
    private JPanel pSuperior,pIzquierda, pDerecha;
    private JLabel lTituloApp,lUsuario,lContraseña,lNombrePagina,lFLV,lImagen;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JButton bEntrar,bTwich,bFace,bYoutube,bDiscord;
    
    
    
    private ImageIcon iFondo,iTwich,iFace,iYoutube,iDiscord,iAux;
    
    
    private ObjetosGraficosService sObjetosGraficos;
    private RecursosService sRecursos;
    private LoginComponent loginComponent;
    
    public LoginTemplate(LoginComponent loginComponent){
        
        this.loginComponent = loginComponent;
        
        sObjetosGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJButtons();
        this.crearJLabels();
        
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
    public void crearObjetosDecoradores(){
    
        iFondo = new ImageIcon("recursos/imagenes/portada.jpg");
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.png");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.png");  
        
    }
    
    public void crearPanels(){
        
        pSuperior = sObjetosGraficos.construirJPanel(0, 0, 1000, 100, Color.BLACK,null );
        this.add(pSuperior);
        
        pDerecha = sObjetosGraficos.construirJPanel(600, 100, 400, 500, Color.WHITE, null);
        this.add(pDerecha);
        
        pIzquierda = sObjetosGraficos.construirJPanel(0, 100, 600, 500, Color.LIGHT_GRAY, null);
        this.add(pIzquierda);
    
    }
    
    public void crearJTextFields(){
    
    tNombreUsuario = sObjetosGraficos.construirJTextField("Usuario", (pDerecha.getWidth() - 300)/2,
            100, 300, 40, Color.WHITE, Color.DARK_GRAY, Color.blue, null, sRecursos.getBorderInferiorGris(), "c");
    tNombreUsuario.addMouseListener(loginComponent);
    pDerecha.add(tNombreUsuario);
    
    }
    
    public void crearJLabels(){
        
        lTituloApp = sObjetosGraficos.construirJLabel("INICIAR SESION", 125, 20, 150, 30, null,
                Color.BLACK, null, sRecursos.getFontIniciarSesion(), "c");
        pDerecha.add(lTituloApp);
        
        lUsuario = sObjetosGraficos.construirJLabel("Usuario", 100, 60, 200, 30, null,
                Color.LIGHT_GRAY, null, sRecursos.getFontSubtitulos(), "c");
        pDerecha.add(lUsuario);
        
        lContraseña = sObjetosGraficos.construirJLabel("Contraseña", 100, 150, 200, 30, null,
                Color.LIGHT_GRAY, null, sRecursos.getFontSubtitulos(), "c");        
        pDerecha.add(lContraseña);
        
        lNombrePagina = sObjetosGraficos.construirJLabel("anime", 50, 10, 120, 50, null, Color.WHITE,
                null, sRecursos.getFontNombrePagina(), "r");
        pSuperior.add(lNombrePagina);
        
        lFLV = sObjetosGraficos.construirJLabel("flv", 170, 10, 100, 50, null, sRecursos.getColorAzulMarino(),
                null, sRecursos.getFontFLV(), "l");
        pSuperior.add(lFLV);
        
        iAux= new ImageIcon(iFondo.getImage().getScaledInstance(500, 300, Image.SCALE_AREA_AVERAGING));
        
        lImagen = sObjetosGraficos.construirJLabel(null, 40, 20, 500, 300, iAux, null, null, null, "c");
        pIzquierda.add(lImagen);
        
    }
    
    public void crearJPasswordFields(){
    
        tClaveUsuario = sObjetosGraficos.construirJPasswordField("Contraseña", (pDerecha.getWidth() - tNombreUsuario.getWidth())/2,
                190, 300, 40, Color.WHITE, Color.DARK_GRAY, Color.BLUE, null, sRecursos.getBorderInferiorGris(), "c");
        tClaveUsuario.addMouseListener(loginComponent);
        pDerecha.add(tClaveUsuario);
        
    }
    
    public void crearJButtons(){
        
        bEntrar = sObjetosGraficos.construirJButton("INICIAR SESION",(pDerecha.getWidth() - 250)/2 ,
                250, 250, 40,sRecursos.getcMano(),null, sRecursos.getFontSubtitulos(), sRecursos.getColorNegro(), Color.WHITE, null, "c", true);
        bEntrar.addActionListener(loginComponent);
        pDerecha.add(bEntrar);
        
        iAux= new ImageIcon(iTwich.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bTwich = sObjetosGraficos.construirJButton(null, 500, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        bTwich.addActionListener(loginComponent);
        pSuperior.add(bTwich);
        
        iAux= new ImageIcon(iYoutube.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bYoutube = sObjetosGraficos.construirJButton(null, 430, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        bYoutube.addActionListener(loginComponent);
        pSuperior.add(bYoutube);
        
        iAux= new ImageIcon(iDiscord.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bDiscord = sObjetosGraficos.construirJButton(null, 360, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        bDiscord.addActionListener(loginComponent);
        pSuperior.add(bDiscord);
        
        iAux= new ImageIcon(iFace.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bFace = sObjetosGraficos.construirJButton(null, 900, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        bFace.addActionListener(loginComponent);
        pSuperior.add(bFace);
    
    }

    public JTextField gettNombreUsuario() {
        return this.tNombreUsuario;
    }

    public JPasswordField gettClaveUsuario() {
        return this.tClaveUsuario;
    }

    public JButton getbEntrar() {
        return this.bEntrar;
    }

    public JButton getbTwich() {
        return this.bTwich;
    }

    public JButton getbFace() {
        return this.bFace;
    }

    public JButton getbYoutube() {
        return bYoutube;
    }

    public JButton getbDiscord() {
        return bDiscord;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
    
    
    
    
}
