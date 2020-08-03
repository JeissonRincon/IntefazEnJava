package app.cliente.Componentes.NavegacionInicio;

//@author Jeisson

import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


public class NavegacionInicioTemplate extends JPanel{
    
    private NavegacionInicioComponent navegacionInicioComponent;
    private ObjetosGraficosService sObjetosGraficos;
    private RecursosService sRecursos;
    
    private JButton bUltimosEpisodios,bAnimesAgregados;
    
    public NavegacionInicioTemplate(NavegacionInicioComponent navegacionInicioComponent){
        
        this.navegacionInicioComponent = navegacionInicioComponent;
        this.navegacionInicioComponent.getClass();
        sRecursos = RecursosService.getService();
        sObjetosGraficos = ObjetosGraficosService.getService();
        
        this.crearJButtons();
        
        this.setSize(800, 50);
        this.setBackground(Color.darkGray);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearJButtons(){
        
        bUltimosEpisodios = sObjetosGraficos.construirJButton("Últimos episodios", 30, 10, 200, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontBotones(), null, Color.WHITE, null, "l", false);
        this.bUltimosEpisodios.addActionListener(navegacionInicioComponent);
        bUltimosEpisodios.addMouseListener(navegacionInicioComponent);
        this.add(bUltimosEpisodios);
        
        bAnimesAgregados = sObjetosGraficos.construirJButton("Animes agregados", 260, 10, 200, 30,sRecursos.getcMano(), null, 
                sRecursos.getFontBotones(), null, Color.white, null, "l", false);
        this.bAnimesAgregados.addActionListener(navegacionInicioComponent);
        bAnimesAgregados.addMouseListener(navegacionInicioComponent);
        this.add(bAnimesAgregados);
    
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }

    public JButton getbUltimosEpisodios() {
        return bUltimosEpisodios;
    }

    public JButton getbAnimesAgregados() {
        return bAnimesAgregados;
    }
    
    
    
}
