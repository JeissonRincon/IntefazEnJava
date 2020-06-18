package app.cliente.Componentes.VerLuego;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Jeisson
 */
public class VerLuegoTemplate extends JPanel{
    
    private VerLuegoComponent verLuegoComponent;
    
    public VerLuegoTemplate(VerLuegoComponent verLuegoComponent){
        
        this.verLuegoComponent = verLuegoComponent;
        this.verLuegoComponent.getClass();
        
        this.setSize(800, 450);
        this.setBackground(Color.red);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
}
