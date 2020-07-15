package app.cliente.Componentes.Informativa;

//@author Jeisson

public class InformativaComponent {
    
    private InformativaTemplate informativaTemplate;
    
    public InformativaComponent(String titulo, String calificacion,String descripcion){
        informativaTemplate = new InformativaTemplate(this,titulo,calificacion,descripcion);
    }
    
    public InformativaTemplate getInformativaTemplate(){
        return informativaTemplate;
    }
    
}
