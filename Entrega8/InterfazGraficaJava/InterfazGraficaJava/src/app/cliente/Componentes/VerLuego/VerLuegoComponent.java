package app.cliente.Componentes.VerLuego;

//@author Jeisson

public class VerLuegoComponent {
    
    private VerLuegoTemplate verLuegoTemplate;
    
    public VerLuegoComponent(){
        this.verLuegoTemplate = new VerLuegoTemplate(this);
    }
    
    public VerLuegoTemplate getVerLuegoTemplate(){
        return this.verLuegoTemplate;
    }
    
}
