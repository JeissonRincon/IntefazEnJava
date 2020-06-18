package app.cliente.Componentes.NavegacionMisAnimes;

//@author Jeisson

import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavegacionMisAnimesComponent implements ActionListener{
 
    private NavegacionMisAnimesTemplate navegacionMisAnimesTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
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
    
}
