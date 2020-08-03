package app.cliente.Componentes.NavegacionMisAnimes;

//@author Jeisson

import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;


public class NavegacionMisAnimesComponent implements ActionListener,MouseListener{
 
    private NavegacionMisAnimesTemplate navegacionMisAnimesTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    private JButton boton;
    
    public NavegacionMisAnimesComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        this.navegacionMisAnimesTemplate = new NavegacionMisAnimesTemplate(this);
    }
    
   
    @Override
        public void actionPerformed(ActionEvent e){
            this.vistaPrincipalComponent.mostrarComponentes(e.getActionCommand().trim());
        }
        
     public NavegacionMisAnimesTemplate getNavegacionMisAnimesTemplate(){
        return this.navegacionMisAnimesTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        navegacionMisAnimesTemplate.getbFavoritos().setBorder(null);
        navegacionMisAnimesTemplate.getbSiguiendo().setBorder(null);
        navegacionMisAnimesTemplate.getbVerLuego().setBorder(null);
        if(e.getSource()==navegacionMisAnimesTemplate.getbFavoritos()){
            navegacionMisAnimesTemplate.getbFavoritos().setBorder(
                    navegacionMisAnimesTemplate.getsRecursos().getBorderInferiorGris());
        }
        if(e.getSource()==navegacionMisAnimesTemplate.getbSiguiendo()){
            navegacionMisAnimesTemplate.getbSiguiendo().setBorder(
                    navegacionMisAnimesTemplate.getsRecursos().getBorderInferiorGris());
        }
        if(e.getSource()==navegacionMisAnimesTemplate.getbVerLuego()){
            navegacionMisAnimesTemplate.getbVerLuego().setBorder(
                    navegacionMisAnimesTemplate.getsRecursos().getBorderInferiorGris());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
