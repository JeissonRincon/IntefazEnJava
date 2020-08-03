package app.cliente.Componentes.NavegacionInicio;

// @author Jeisson

import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class NavegacionInicioComponent implements ActionListener,MouseListener{
    
    private NavegacionInicioTemplate navegacionInicioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public NavegacionInicioComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        this.navegacionInicioTemplate = new NavegacionInicioTemplate(this);
    }
    
   
    @Override
        public void actionPerformed(ActionEvent e){
            this.vistaPrincipalComponent.mostrarComponentes(e.getActionCommand().trim());
        }
        
     public NavegacionInicioTemplate getNavegacionInicioTemplate(){
        return this.navegacionInicioTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        navegacionInicioTemplate.getbAnimesAgregados().setBorder(null);
        navegacionInicioTemplate.getbUltimosEpisodios().setBorder(null);
        if(e.getSource()==navegacionInicioTemplate.getbAnimesAgregados()){
            navegacionInicioTemplate.getbAnimesAgregados().setBorder(
                                        navegacionInicioTemplate.getsRecursos().getBorderInferiorGris());
        }
        if(e.getSource()==navegacionInicioTemplate.getbUltimosEpisodios()){
            navegacionInicioTemplate.getbUltimosEpisodios().setBorder(
                                        navegacionInicioTemplate.getsRecursos().getBorderInferiorGris());
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
