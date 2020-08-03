package app.cliente.Componentes.Episodios;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EpisodiosTemplate extends JPanel{
    
    private EpisodiosComponent episodiosComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lNombre,lEpisodio,lImagen,lPlay;
    
    private ImageIcon iAux,iPlay;
    
    public EpisodiosTemplate(EpisodiosComponent epComponent,String titulo,ImageIcon iImage, String epi){
    
    
        this.episodiosComponent=epComponent;
        this.episodiosComponent.getClass();
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        iPlay = new ImageIcon("recursos/imagenes/Play.jpg");
        iAux = new ImageIcon(
            iPlay.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        
        lPlay = sObjGraficos.construirJLabel(null, 110, 10, 20, 20, iAux, 
                null, null, null, "c");
        this.add(lPlay);
        
        lNombre=sObjGraficos.construirJLabel(titulo, 5, 60, 140, 20, null, 
                Color.WHITE, null, sRecursos.getFontSubtitulos(), "l");
        this.add(lNombre);
        
        lEpisodio=sObjGraficos.construirJLabel("Episodio "+epi, 5, 40, 70, 15, null, 
                Color.white, Color.orange, sRecursos.getFontDescripcion(), "l");
        this.add(lEpisodio);
        
        iAux = new ImageIcon(
            iImage.getImage().getScaledInstance(150, 80, Image.SCALE_AREA_AVERAGING)
        );
        
        lImagen=sObjGraficos.construirJLabel(null, 0, 0, 150, 80, iAux, 
                null, null, null, "c");
        this.add(lImagen);
        
        this.setSize(150, 80);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
}
