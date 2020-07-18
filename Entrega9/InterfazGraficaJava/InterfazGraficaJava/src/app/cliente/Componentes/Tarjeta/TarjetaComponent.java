
package app.cliente.Componentes.Tarjeta;

// @author Jeisson

import java.awt.Color;
import javax.swing.ImageIcon;


public class TarjetaComponent {
    
    private TarjetaTemplate tarjetaTemplate;
    
    public TarjetaComponent(String titulo, ImageIcon iImage,String tipo){
        tarjetaTemplate = new TarjetaTemplate(this,titulo,iImage,tipo);
    }
    
    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetaTemplate;
    }
    
}
