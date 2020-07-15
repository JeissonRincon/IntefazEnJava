
package app.cliente.Componentes.Tarjeta;

// @author Jeisson

import java.awt.Color;
import javax.swing.ImageIcon;


public class TarjetaComponent {
    
    private TarjetaTemplate tarjetaTemplate;
    
    public TarjetaComponent(String titulo, ImageIcon iImage,String tipo,Color colorTipo){
        tarjetaTemplate = new TarjetaTemplate(this,titulo,iImage,tipo,colorTipo);
    }
    
    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetaTemplate;
    }
    
}
