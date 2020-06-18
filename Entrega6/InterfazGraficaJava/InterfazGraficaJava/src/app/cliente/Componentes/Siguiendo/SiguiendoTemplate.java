package app.cliente.Componentes.Siguiendo;

//@author Jeisson

import java.awt.Color;
import javax.swing.JPanel;


public class SiguiendoTemplate extends JPanel{
    
    private SiguiendoComponent siguiendoComponent;
    
    public SiguiendoTemplate(SiguiendoComponent siguiendoComponent){
        
        this.siguiendoComponent = siguiendoComponent;
        this.siguiendoComponent.getClass();
        
        this.setSize(800, 450);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
}
