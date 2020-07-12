
package app.cliente.Componentes.UltimosEpisodios;

//@author Jeisson
 
public class UltimosEpisodiosComponent {
    
    private UltimosEpisodiosTemplate ultimosEpisodiosTemplate;
    
    public UltimosEpisodiosComponent(){
        this.ultimosEpisodiosTemplate = new UltimosEpisodiosTemplate(this);
    }
    
    public UltimosEpisodiosTemplate getUltimosEpisodiosTemplate(){
        return this.ultimosEpisodiosTemplate;
    }
    
}
