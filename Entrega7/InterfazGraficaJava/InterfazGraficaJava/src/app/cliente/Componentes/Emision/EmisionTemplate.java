
package app.cliente.Componentes.Emision;

//@author Jeisson

import java.awt.Color;
import javax.swing.JPanel;


public class EmisionTemplate extends JPanel{
    
    private EmisionComponent emisionComponent;

    
    public EmisionTemplate(EmisionComponent emisionComponent){
        
        this.emisionComponent = emisionComponent;
        this.emisionComponent.getClass();
        
        this.setSize(200, 500);
        this.setBackground(Color.GREEN);
        this.setLayout(null);
        this.setVisible(true);
    }
}
