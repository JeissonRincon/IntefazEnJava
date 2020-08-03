package app.cliente.Componentes.Episodios;

//@author Jeisson

import javax.swing.ImageIcon;

 
public class EpisodiosComponent {
    
    private EpisodiosTemplate episodiosTemplate;
    
    public EpisodiosComponent(String titulo,ImageIcon iImage,String epi){
        episodiosTemplate= new EpisodiosTemplate(this,titulo,iImage,epi);
    }
    
     public EpisodiosTemplate getEpisodiosTemplate(){
        return episodiosTemplate;
    }
    
}
