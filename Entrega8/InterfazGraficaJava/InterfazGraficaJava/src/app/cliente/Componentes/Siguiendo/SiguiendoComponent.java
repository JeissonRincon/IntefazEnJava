
package app.cliente.Componentes.Siguiendo;

// @author Jeisson
 
public class SiguiendoComponent {
    
    private SiguiendoTemplate siguiendoTemplate;
    
    public SiguiendoComponent(){
        this.siguiendoTemplate = new SiguiendoTemplate(this);
    }
    
    public SiguiendoTemplate getVerLuegoTemplate(){
        return this.siguiendoTemplate;
    }
    
    
}
