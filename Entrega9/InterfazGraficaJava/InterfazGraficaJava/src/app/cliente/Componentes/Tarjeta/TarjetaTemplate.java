
package app.cliente.Componentes.Tarjeta;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TarjetaTemplate extends JPanel{
    
    private TarjetaComponent tarjetaComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JLabel lNombre,lImagen,lTipo;
    private Color cTipo;
    
    private ImageIcon iAux;
    
    public TarjetaTemplate(TarjetaComponent tarjetaComponent,String titulo,ImageIcon iImage, String tipo){
        this.tarjetaComponent = tarjetaComponent;
        this.tarjetaComponent.getClass();
        sObjGraficos=ObjetosGraficosService.getService();
        sRecursos=RecursosService.getService();
        
        if(tipo.equals("OVA")){
            cTipo=Color.ORANGE;
        }
        if(tipo.equals("Película")){
            cTipo=Color.RED;
        }
        if(tipo.equals("Anime")){
            cTipo=sRecursos.getColorAzulMarino();
        }
        lTipo = sObjGraficos.construirJLabel(tipo, 10, 165, 65, 20, null, Color.white, 
                cTipo, sRecursos.getFontLetrero(), "c");
        this.add(lTipo);
        
        iAux = new ImageIcon(
            iImage.getImage().getScaledInstance(180, 185, Image.SCALE_AREA_AVERAGING)
        );
        lImagen= sObjGraficos.construirJLabel(null, 5, 5, 180, 185, iAux, null, null, null, "c");
        this.add(lImagen);
        
        lNombre = sObjGraficos.construirJLabel(titulo, 5, 190, 180, 20, null, Color.BLACK, 
                Color.white, sRecursos.getFontSubtitulos(), "c");
        this.add(lNombre);
        
        this.setSize(190, 215);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
