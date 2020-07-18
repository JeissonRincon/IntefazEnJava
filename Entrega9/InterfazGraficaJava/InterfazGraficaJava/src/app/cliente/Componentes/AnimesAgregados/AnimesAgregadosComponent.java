
package app.cliente.Componentes.AnimesAgregados;

//@author Jeisson

import app.servicios.ServiciosLogicos.AnimesService;
import modelos.Tarjeta;


public class AnimesAgregadosComponent {
    
    private AnimesAgregadosTemplate animesAgregadosTemplate;
    private AnimesService animeS;
    
    public AnimesAgregadosComponent(){
        animeS=AnimesService.getService();
        this.animesAgregadosTemplate = new AnimesAgregadosTemplate(this);
    }
    
    public Tarjeta obtenerTarjeta(int nAnime){
        return animeS.devolverTarjeta((nAnime+72));
    }
    
    public AnimesAgregadosTemplate getAnimesAgregadosTemplate(){
        return this.animesAgregadosTemplate;
    }
    
    
}
