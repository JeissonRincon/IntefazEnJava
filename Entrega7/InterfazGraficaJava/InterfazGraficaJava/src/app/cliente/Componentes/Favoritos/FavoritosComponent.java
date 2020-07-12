
package app.cliente.Componentes.Favoritos;

/**
 *
 * @author Jeisson
 */
public class FavoritosComponent {
    
    private FavoritosTemplate favoritosTemplate;
    
    public FavoritosComponent(){
        this.favoritosTemplate = new FavoritosTemplate(this);
    }
    
    public FavoritosTemplate getFavoritosTemplate(){
        return this.favoritosTemplate;
    }
    
}
