package app.cliente.VistaPrincipal;

//@author Jeisson

import app.cliente.Login.LoginComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
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
    
    private JPanel pSuperior,pIzquierda,pDerechaSuperior,pDerechaPrincipal,pDinamico;
    private JButton bFace,bTwich,bDiscord,bYoutube,bInicio,bDirectorio,bCerrar,bCS,bCCS;
    private JLabel lFLV,lAnime,lPerfil,lBienvenido,lPhoto;
    
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
        this.crearJLabelsDinamicos();
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
        
        pDinamico = sObjetosGraficos.construirJPanel(780, 10, 120, 50, null, null);
        pSuperior.add(pDinamico);
    }

    public void crearJLabels(){
    
        lAnime = sObjetosGraficos.construirJLabel("anime", 50, 10, 120, 50, null, Color.WHITE,
                null, sRecursos.getFontNombrePagina(), "r");
        pSuperior.add(lAnime);
        
        lFLV = sObjetosGraficos.construirJLabel("flv", 170, 10, 100, 50, null, sRecursos.getColorAzulMarino(),
                null, sRecursos.getFontFLV(), "l");
        pSuperior.add(lFLV);
        
        
    }
    
    public void crearJLabelsDinamicos(){
        lBienvenido = sObjetosGraficos.construirJLabel("BIENVENID@", 40, 0, 80, 25, null, Color.white,
                Color.DARK_GRAY, sRecursos.getFontDescripcion(), "c");
        pDinamico.add(lBienvenido);
        
        lPerfil = sObjetosGraficos.construirJLabel("<html><div align='justify'>"+vistaPrincipalComponent.getUsLog().getnUsuario()+"</div></html>", 
                40, 25, 80, 25, null, Color.white, Color.DARK_GRAY, sRecursos.getFontDescripcion(), "c");
        pDinamico.add(lPerfil);
        
        iAux = new ImageIcon(vistaPrincipalComponent.getUsLog().getFoto().getImage().getScaledInstance(40, 50, Image.SCALE_AREA_AVERAGING));
        lPhoto =sObjetosGraficos.construirJLabel(null, 0, 0, 40, 50, iAux, Color.orange, null,
                null, "c");
        pDinamico.add(lPhoto);
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
        
        bCerrar = sObjetosGraficos.construirJButton("CERRAR SESION", 770, 65, 140, 30,sRecursos.getcMano(), null, sRecursos.getFontDescripcion(), 
                sRecursos.getColorRojo(), Color.white, null, "c", true);
        bCerrar.setVisible(false);
        bCerrar.addActionListener(vistaPrincipalComponent);
        pSuperior.add(bCerrar);
        
        bCS = sObjetosGraficos.construirJButton("+", 900, 10, 15, 25,sRecursos.getcMano(), null, null, 
                Color.DARK_GRAY, Color.white, sRecursos.getBorderGris(), "c", true);
        bCS.addActionListener(vistaPrincipalComponent);
        pSuperior.add(bCS);
        
        bCCS = sObjetosGraficos.construirJButton("-", 900, 35, 15, 25,sRecursos.getcMano(), null, null, 
                Color.DARK_GRAY, Color.white, sRecursos.getBorderGris(), "c", true);
        bCCS.addActionListener(vistaPrincipalComponent);
        pSuperior.add(bCCS);
        
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

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbCS() {
        return bCS;
    }
    
    public JButton getbCCS() {
        return bCCS;
    }

    public JPanel getpDinamico() {
        return pDinamico;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
    
    
}
