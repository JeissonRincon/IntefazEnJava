
package app.cliente.Componentes.AnimesAgregados;

//@author Jeisson

import java.awt.Color;
import javax.swing.JPanel;


public class AnimesAgregadosTemplate extends JPanel{
    
    private AnimesAgregadosComponent animesAgregadosComponent;
    
    public AnimesAgregadosTemplate(AnimesAgregadosComponent animesAgregadosComponent){
        
        this.animesAgregadosComponent = animesAgregadosComponent;
        this.animesAgregadosComponent.getClass();
        
        this.setSize(800, 450);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
}
