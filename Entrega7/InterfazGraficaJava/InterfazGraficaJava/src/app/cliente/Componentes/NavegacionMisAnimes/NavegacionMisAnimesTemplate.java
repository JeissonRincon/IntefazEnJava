package app.cliente.Componentes.NavegacionMisAnimes;

// @author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class NavegacionMisAnimesTemplate extends JPanel{
    
    private NavegacionMisAnimesComponent navegacionMisAnimesComponent;
    private ObjetosGraficosService sObjetosGraficos;
    private RecursosService sRecursos;
    
    private JButton bSiguiendo,bFavoritos,bVerLuego;
    
    private ImageIcon iSiguiendo,iFavoritos,iVerLuego,iAux;
    
    public NavegacionMisAnimesTemplate(NavegacionMisAnimesComponent navegacionMisAnimesComponent){
        
        this.navegacionMisAnimesComponent = navegacionMisAnimesComponent;
        this.navegacionMisAnimesComponent.getClass();
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJButtons();
        
        this.setSize(800, 50);
        this.setBackground(Color.darkGray);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearObjetosDecoradores(){
    
        iSiguiendo = new ImageIcon("recursos/imagenes/siguiendo.PNG"); 
        iFavoritos = new ImageIcon("recursos/imagenes/favoritos.PNG");
        iVerLuego = new ImageIcon("recursos/imagenes/verLuego.PNG");
        
        
    }
    
    public void crearJButtons(){
        
        iAux= new ImageIcon(iSiguiendo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        bSiguiendo = sObjetosGraficos.construirJButton("   Siguiendo", 30, 10, 200, 30,sRecursos.getcMano(), iAux, 
                sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false);
        this.bSiguiendo.addActionListener(navegacionMisAnimesComponent);
        this.add(bSiguiendo);
        
        iAux= new ImageIcon(iFavoritos.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        bFavoritos = sObjetosGraficos.construirJButton("   Favoritos", 260, 10, 200, 30,sRecursos.getcMano(), iAux, 
                sRecursos.getFontBotones(), null, Color.white, null, "l", false);
        this.bFavoritos.addActionListener(navegacionMisAnimesComponent);
        this.add(bFavoritos);
        
        iAux= new ImageIcon(iVerLuego.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        bVerLuego = sObjetosGraficos.construirJButton("   Ver luego", 490, 10, 200, 30,sRecursos.getcMano(), iAux, 
                sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false);
        this.bVerLuego.addActionListener(navegacionMisAnimesComponent);
        this.add(bVerLuego);
    
    }
    
}
    
    

