package app.cliente.Componentes.Informativa;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InformativaTemplate extends JPanel{
    
    private InformativaComponent tarjetaComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lNombre,lAnime,lEstrellas,lDescripcion;
    
    private ImageIcon iEstrella,iAux;
    
    public InformativaTemplate(InformativaComponent tarjetaComponent,String titulo, String estrellas, String descripcion){
        this.tarjetaComponent = tarjetaComponent;
        this.tarjetaComponent.getClass();
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        iEstrella = new ImageIcon("recursos/imagenes/estrella.jpg");
        
        lAnime = lEstrellas = sObjGraficos.construirJLabel("<html><div>"+titulo+"</div></html>", 5, 5, 180, 30, null, sRecursos.getColorNegro(), 
                Color.white, sRecursos.getFontNameAnime(), "l");
        this.add(lAnime);
        
        iAux= new ImageIcon(iEstrella.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        lEstrellas = sObjGraficos.construirJLabel(estrellas, 5, 35, 180, 20, iAux, Color.BLACK, 
                Color.white, null, "l");
        this.add(lEstrellas);
        
        
        lDescripcion= sObjGraficos.construirJLabel("<html><div align='justify'>"+descripcion+"</div></html>", 
                5, 55, 180, 155, null, Color.LIGHT_GRAY, Color.white, sRecursos.getFontDescripcion(), "l");
        this.add(lDescripcion);
        
        this.setSize(190, 215);
        this.setBackground(Color.white);
        this.setBorder(sRecursos.getBorderGris());
        this.setLayout(null);
        this.setVisible(true);
    }
}
