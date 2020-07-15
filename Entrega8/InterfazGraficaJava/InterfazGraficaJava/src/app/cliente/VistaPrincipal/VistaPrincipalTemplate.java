package app.cliente.VistaPrincipal;

//@author Jeisson

import app.cliente.Login.LoginComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;

public class VistaPrincipalTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private LoginComponent login;
    
    private JPanel pSuperior,pIzquierda,pDerechaSuperior,pDerechaPrincipal;
    private JButton bFace,bTwich,bDiscord,bYoutube,bInicio,bDirectorio;
    private JLabel lFLV,lAnime,lPerfil;
    
    private ImageIcon iTwich,iFace,iYoutube,iDiscord,iAux;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        super("Vista Principal");
        
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearPanels();
        this.crearJLabels();
        this.crearJButtons();
        
        setSize(1016,639);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.yellow);
        this.setLayout(null);
        this.setVisible(true);        
    }
    
    public void crearObjetosDecoradores(){
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.png");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.png");  
    }
    
    public void crearPanels(){
        
        pSuperior = sObjetosGraficos.construirJPanel(0, 0, 1000, 100, Color.BLACK,null );
        this.add(pSuperior);
        
        pDerechaSuperior = sObjetosGraficos.construirJPanel(200, 100, 800, 50, Color.WHITE, null);
        this.add(pDerechaSuperior);
        
        pDerechaPrincipal = sObjetosGraficos.construirJPanel(200, 150, 800, 450, Color.WHITE, null);
        this.add(pDerechaPrincipal);
        
        pIzquierda = sObjetosGraficos.construirJPanel(0, 100, 200, 500, Color.LIGHT_GRAY, null);
        this.add(pIzquierda);
    
    }

    public void crearJLabels(){
    
        lAnime = sObjetosGraficos.construirJLabel("anime", 50, 10, 120, 50, null, Color.WHITE,
                null, sRecursos.getFontNombrePagina(), "r");
        pSuperior.add(lAnime);
        
        lFLV = sObjetosGraficos.construirJLabel("flv", 170, 10, 100, 50, null, sRecursos.getColorAzulMarino(),
                null, sRecursos.getFontFLV(), "l");
        pSuperior.add(lFLV);
        
        lPerfil = sObjetosGraficos.construirJLabel("nombre", 
                780, 10, 120, 50, null, Color.white, sRecursos.getColorGris(), null, "c");
        pSuperior.add(lPerfil);
    }
    
    public void crearJButtons(){
         
        bInicio = sObjetosGraficos.construirJButton("INICIO", 250, 25, 100, 30,sRecursos.getcMano(), 
                null, sRecursos.getFontBotones(), null, Color.WHITE, null, "c", false);
        bInicio.addActionListener(vistaPrincipalComponent);
        bInicio.addMouseListener(vistaPrincipalComponent);
        pSuperior.add(bInicio);
        
        bDirectorio = sObjetosGraficos.construirJButton("DIRECTORIO ANIME", 360, 25, 200, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontBotones(), null, Color.WHITE, null, "c", false);
        bDirectorio.addActionListener(vistaPrincipalComponent);
        bDirectorio.addMouseListener(vistaPrincipalComponent);
        pSuperior.add(bDirectorio);
                
        iAux= new ImageIcon(iTwich.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bTwich = sObjetosGraficos.construirJButton(null, 720, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bTwich);
        
        iAux= new ImageIcon(iYoutube.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bYoutube = sObjetosGraficos.construirJButton(null, 650, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bYoutube);
        
        iAux= new ImageIcon(iDiscord.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bDiscord = sObjetosGraficos.construirJButton(null, 580, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bDiscord);
        
        iAux= new ImageIcon(iFace.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bFace = sObjetosGraficos.construirJButton(null, 920, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bFace);
        
    }

    public JPanel getpSuperior() {
        return pSuperior;
    }

    public JPanel getpIzquierda() {
        return pIzquierda;
    }

    public JPanel getpDerechaSuperior() {
        return pDerechaSuperior;
    }

    public JPanel getpDerechaPrincipal() {
        return pDerechaPrincipal;
    }
    
    public JButton getbInicio() {
        return bInicio;
    }

    public JButton getbDirectorio() {
        return bDirectorio;
    }
    
}
