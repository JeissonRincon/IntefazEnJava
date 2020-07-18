
package app.cliente.Componentes.Cuenta;

// @author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

 
public class CuentaTemplate extends JPanel{
    
    private CuentaComponent cuentaComponent;
    private ObjetosGraficosService sObjG;
    private RecursosService sRecursos;
    
    private JPanel pPerfil;
    private JLabel lNomUsuario,lPhotoUsuario;
    
    private ImageIcon iAux;
    

    
    public CuentaTemplate(CuentaComponent cuentaComponent){
        
        this.cuentaComponent = cuentaComponent;
        this.cuentaComponent.getClass();
        sObjG = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        pPerfil = sObjG.construirJPanel(30, 50, 140, 250, Color.DARK_GRAY, sRecursos.getBorderGris());
        this.add(pPerfil);
        
        this.crearJLabels();
        
        this.setSize(200, 500);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearJLabels(){
        iAux=new ImageIcon(cuentaComponent.getUsLog().getFoto().getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING));
        lPhotoUsuario = sObjG.construirJLabel(null, 10, 30, 120, 120,
                iAux, null, null, null, "c");
        lPhotoUsuario.setBorder(sRecursos.getBorderGris());
        pPerfil.add(lPhotoUsuario);
        
        lNomUsuario=sObjG.construirJLabel(cuentaComponent.getUsLog().getnUsuario(), 10, 160, 120, 20, 
                null, Color.white, null, sRecursos.getFontNameAnime(), "c");
        pPerfil.add(lNomUsuario);
    }

    public JPanel getpPerfil() {
        return pPerfil;
    }
    
    
    
}
