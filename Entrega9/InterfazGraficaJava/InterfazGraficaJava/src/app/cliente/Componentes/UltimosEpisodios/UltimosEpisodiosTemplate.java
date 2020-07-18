package app.cliente.Componentes.UltimosEpisodios;

//@author Jeisson

import java.awt.Color;
import javax.swing.JPanel;


public class UltimosEpisodiosTemplate extends JPanel{
    private UltimosEpisodiosComponent ultimosEpisodiosComponent;
    
    public UltimosEpisodiosTemplate(UltimosEpisodiosComponent ultimosEpisodiosComponent){
        
        this.ultimosEpisodiosComponent = ultimosEpisodiosComponent;
        this.ultimosEpisodiosComponent.getClass();
        
        this.setSize(800, 450);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    
    }
}
