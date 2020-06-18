package app.cliente.Componentes.Favoritos;

import java.awt.Color;
import javax.swing.JPanel;

// @author Jeisson
 
public class FavoritosTemplate extends JPanel{
    
    private FavoritosComponent favoritosComponent;
    
    public FavoritosTemplate(FavoritosComponent favoritosComponent){
        
        this.favoritosComponent = favoritosComponent;
        this.favoritosComponent.getClass();
        
        this.setSize(800, 450);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
}
