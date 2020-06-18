package app.cliente.Componentes.Emision;

//@author Jeisson
 
public class EmisionComponent {
    
    private EmisionTemplate emisionTemplate;
    
    public EmisionComponent(){
        this.emisionTemplate = new EmisionTemplate(this);
    }
    
    public EmisionTemplate getEmisionTemplate(){
        return this.emisionTemplate;
    
}
}