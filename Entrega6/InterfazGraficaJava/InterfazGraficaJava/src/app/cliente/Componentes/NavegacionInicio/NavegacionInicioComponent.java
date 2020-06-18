package app.cliente.Componentes.NavegacionInicio;

// @author Jeisson

import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavegacionInicioComponent implements ActionListener{
    
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
}
