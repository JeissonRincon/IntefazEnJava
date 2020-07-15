
package app.cliente.Componentes.Favoritos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Jeisson
 */
public class FavoritosComponent implements MouseListener{
    
    private FavoritosTemplate favoritosTemplate;
    
    public FavoritosComponent(){
        this.favoritosTemplate = new FavoritosTemplate(this);
    }
    
    public FavoritosTemplate getFavoritosTemplate(){
        return this.favoritosTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==favoritosTemplate.getpTarjeta1()){
            this.favoritosTemplate.removerContenido(1);
            this.favoritosTemplate.crearContenidoPTarjetai1();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta2()){
            this.favoritosTemplate.removerContenido(2);
            this.favoritosTemplate.crearContenidoPTarjetai2();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta3()){
            this.favoritosTemplate.removerContenido(3);
            this.favoritosTemplate.crearContenidoPTarjetai3();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta4()){
            this.favoritosTemplate.removerContenido(4);
            this.favoritosTemplate.crearContenidoPTarjetai4();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta5()){
            this.favoritosTemplate.removerContenido(5);
            this.favoritosTemplate.crearContenidoPTarjetai5();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta6()){
            this.favoritosTemplate.removerContenido(6);
            this.favoritosTemplate.crearContenidoPTarjetai6();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta7()){
            this.favoritosTemplate.removerContenido(7);
            this.favoritosTemplate.crearContenidoPTarjetai7();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta8()){
            this.favoritosTemplate.removerContenido(8);
            this.favoritosTemplate.crearContenidoPTarjetai8();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==favoritosTemplate.getpTarjeta1()){
            this.favoritosTemplate.removerContenido(1);
            this.favoritosTemplate.crearContenidoPTarjeta1();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta2()){
            this.favoritosTemplate.removerContenido(2);
            this.favoritosTemplate.crearContenidoPTarjeta2();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta3()){
            this.favoritosTemplate.removerContenido(3);
            this.favoritosTemplate.crearContenidoPTarjeta3();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta4()){
            this.favoritosTemplate.removerContenido(4);
            this.favoritosTemplate.crearContenidoPTarjeta4();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta5()){
            this.favoritosTemplate.removerContenido(5);
            this.favoritosTemplate.crearContenidoPTarjeta5();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta6()){
            this.favoritosTemplate.removerContenido(6);
            this.favoritosTemplate.crearContenidoPTarjeta6();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta7()){
            this.favoritosTemplate.removerContenido(7);
            this.favoritosTemplate.crearContenidoPTarjeta7();
        }
        if(e.getSource()==favoritosTemplate.getpTarjeta8()){
            this.favoritosTemplate.removerContenido(8);
            this.favoritosTemplate.crearContenidoPTarjeta8();
        }
        
    }
    
}
