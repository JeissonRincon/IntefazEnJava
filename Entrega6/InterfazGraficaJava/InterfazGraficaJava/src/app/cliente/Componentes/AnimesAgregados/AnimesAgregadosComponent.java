
package app.cliente.Componentes.AnimesAgregados;

//@author Jeisson

public class AnimesAgregadosComponent {
    
    private AnimesAgregadosTemplate animesAgregadosTemplate;
    
    public AnimesAgregadosComponent(){
        this.animesAgregadosTemplate = new AnimesAgregadosTemplate(this);
    }
    
    public AnimesAgregadosTemplate getAnimesAgregadosTemplate(){
        return this.animesAgregadosTemplate;
    }
}
