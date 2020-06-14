package app.cliente.VistaPrincipal;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Image;

public class VistaPrincipalTemplate extends JFrame{
    
    private RecursosService sRecursos;
    private ObjetosGraficosService sObjetosGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    private JPanel pSuperior,pIzquierda,pDerecha;
    private JButton bFace,bTwich,bDiscord,bYoutube;
    private JLabel letrero;
    private JTextField caja;
    
    private ImageIcon iTwich,iFace,iYoutube,iDiscord,iAux;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        super("Vista Principal");
        
        this.vistaPrincipalComponent=vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearPanels();
        
        setSize(1000,600);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.yellow);
        this.setLayout(null);
        this.setVisible(true);        
    }
    
    public void crearObjetosDecoradores(){
    
        
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.jpg");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.jpg");  
        
    }
    
    public void crearPanels(){
        
        pSuperior = sObjetosGraficos.construirJPanel(0, 0, 1000, 100, Color.BLACK,null );
        this.add(pSuperior);
        
        pDerecha = sObjetosGraficos.construirJPanel(200, 100, 800, 500, Color.WHITE, null);
        this.add(pDerecha);
        
        pIzquierda = sObjetosGraficos.construirJPanel(0, 100, 200, 500, Color.LIGHT_GRAY, null);
        this.add(pIzquierda);
    
    }
    
    public void crearJButtons(){
         
       
        iAux= new ImageIcon(iTwich.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bTwich = sObjetosGraficos.construirJButton(null, 500, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bTwich);
        
        iAux= new ImageIcon(iYoutube.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bYoutube = sObjetosGraficos.construirJButton(null, 430, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bYoutube);
        
        iAux= new ImageIcon(iDiscord.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bDiscord = sObjetosGraficos.construirJButton(null, 360, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bDiscord);
        
        iAux= new ImageIcon(iFace.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        bFace = sObjetosGraficos.construirJButton(null, 900, 10, 50, 50,sRecursos.getcMano(), iAux, null,
                null, null, null, "c", false);
        pSuperior.add(bFace);
    
    }
}
