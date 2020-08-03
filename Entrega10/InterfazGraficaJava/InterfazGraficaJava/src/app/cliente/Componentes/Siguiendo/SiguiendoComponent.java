
package app.cliente.Componentes.Siguiendo;

// @author Jeisson

import app.servicios.ServiciosLogicos.AnimesService;
import app.servicios.ServiciosLogicos.UsuariosService;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelos.Tarjeta;
import modelos.Usuario;

 
public class SiguiendoComponent implements MouseListener{
    
    private SiguiendoTemplate siguiendoTemplate;
    private AnimesService animeS;
    private UsuariosService user;
    private Usuario usLog;
    
    public SiguiendoComponent(){
        animeS=AnimesService.getService();
        this.user=UsuariosService.getServicio();
        this.usLog=user.getUsuarioLogeado();
        this.siguiendoTemplate = new SiguiendoTemplate(this);
    }
    
    public Tarjeta obtenerTarjeta(int nAnime){
        int pos=0;
        if(usLog.getnUsuario().equals("Jocker087")){
            pos=nAnime+24;
        }
        if(usLog.getnUsuario().equals("AlsNucita")){
            pos=nAnime;
        }
        if(usLog.getnUsuario().equals("RiverEscence")){
            pos=nAnime+48;
        }
        return animeS.devolverTarjeta(pos);
    }
    
    public SiguiendoTemplate getVerLuegoTemplate(){
        return this.siguiendoTemplate;
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
        if(e.getSource()==siguiendoTemplate.getpTarjeta1()){
            this.siguiendoTemplate.removerContenido(1);
            this.siguiendoTemplate.crearContenidoPTarjetai1();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta2()){
            this.siguiendoTemplate.removerContenido(2);
            this.siguiendoTemplate.crearContenidoPTarjetai2();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta3()){
            this.siguiendoTemplate.removerContenido(3);
            this.siguiendoTemplate.crearContenidoPTarjetai3();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta4()){
            this.siguiendoTemplate.removerContenido(4);
            this.siguiendoTemplate.crearContenidoPTarjetai4();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta5()){
            this.siguiendoTemplate.removerContenido(5);
            this.siguiendoTemplate.crearContenidoPTarjetai5();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta6()){
            this.siguiendoTemplate.removerContenido(6);
            this.siguiendoTemplate.crearContenidoPTarjetai6();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta7()){
            this.siguiendoTemplate.removerContenido(7);
            this.siguiendoTemplate.crearContenidoPTarjetai7();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta8()){
            this.siguiendoTemplate.removerContenido(8);
            this.siguiendoTemplate.crearContenidoPTarjetai8();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==siguiendoTemplate.getpTarjeta1()){
            this.siguiendoTemplate.removerContenido(1);
            this.siguiendoTemplate.crearContenidoPTarjeta1();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta2()){
            this.siguiendoTemplate.removerContenido(2);
            this.siguiendoTemplate.crearContenidoPTarjeta2();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta3()){
            this.siguiendoTemplate.removerContenido(3);
            this.siguiendoTemplate.crearContenidoPTarjeta3();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta4()){
            this.siguiendoTemplate.removerContenido(4);
            this.siguiendoTemplate.crearContenidoPTarjeta4();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta5()){
            this.siguiendoTemplate.removerContenido(5);
            this.siguiendoTemplate.crearContenidoPTarjeta5();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta6()){
            this.siguiendoTemplate.removerContenido(6);
            this.siguiendoTemplate.crearContenidoPTarjeta6();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta7()){
            this.siguiendoTemplate.removerContenido(7);
            this.siguiendoTemplate.crearContenidoPTarjeta7();
        }
        if(e.getSource()==siguiendoTemplate.getpTarjeta8()){
            this.siguiendoTemplate.removerContenido(8);
            this.siguiendoTemplate.crearContenidoPTarjeta8();
        }
        
    }
    
    public void restaurarDatos(){
        this.usLog = user.getUsuarioLogeado();
        this.siguiendoTemplate.removeAll();
        this.siguiendoTemplate.crearJPanels();
        this.siguiendoTemplate.crearContenidos();
        this.siguiendoTemplate.repaint();
    }
    
    
}
