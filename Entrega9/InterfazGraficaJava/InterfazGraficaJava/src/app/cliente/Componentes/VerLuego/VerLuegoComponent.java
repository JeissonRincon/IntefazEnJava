package app.cliente.Componentes.VerLuego;

//@author Jeisson

import app.servicios.ServiciosLogicos.AnimesService;
import app.servicios.ServiciosLogicos.UsuariosService;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelos.Tarjeta;
import modelos.Usuario;


public class VerLuegoComponent implements MouseListener{
    
    private VerLuegoTemplate verLuegoTemplate;
    private AnimesService animeS;
    private UsuariosService user;
    private Usuario usLog;
    
    public VerLuegoComponent(){
        animeS=AnimesService.getService();
        this.user=UsuariosService.getServicio();
        this.usLog=user.getUsuarioLogeado();
        this.verLuegoTemplate = new VerLuegoTemplate(this);
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
    
    public VerLuegoTemplate getVerLuegoTemplate(){
        return this.verLuegoTemplate;
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
        if(e.getSource()==verLuegoTemplate.getpTarjeta1()){
            this.verLuegoTemplate.removerContenido(1);
            this.verLuegoTemplate.crearContenidoPTarjetai1();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta2()){
            this.verLuegoTemplate.removerContenido(2);
            this.verLuegoTemplate.crearContenidoPTarjetai2();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta3()){
            this.verLuegoTemplate.removerContenido(3);
            this.verLuegoTemplate.crearContenidoPTarjetai3();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta4()){
            this.verLuegoTemplate.removerContenido(4);
            this.verLuegoTemplate.crearContenidoPTarjetai4();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta5()){
            this.verLuegoTemplate.removerContenido(5);
            this.verLuegoTemplate.crearContenidoPTarjetai5();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta6()){
            this.verLuegoTemplate.removerContenido(6);
            this.verLuegoTemplate.crearContenidoPTarjetai6();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta7()){
            this.verLuegoTemplate.removerContenido(7);
            this.verLuegoTemplate.crearContenidoPTarjetai7();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta8()){
            this.verLuegoTemplate.removerContenido(8);
            this.verLuegoTemplate.crearContenidoPTarjetai8();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==verLuegoTemplate.getpTarjeta1()){
            this.verLuegoTemplate.removerContenido(1);
            this.verLuegoTemplate.crearContenidoPTarjeta1();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta2()){
            this.verLuegoTemplate.removerContenido(2);
            this.verLuegoTemplate.crearContenidoPTarjeta2();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta3()){
            this.verLuegoTemplate.removerContenido(3);
            this.verLuegoTemplate.crearContenidoPTarjeta3();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta4()){
            this.verLuegoTemplate.removerContenido(4);
            this.verLuegoTemplate.crearContenidoPTarjeta4();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta5()){
            this.verLuegoTemplate.removerContenido(5);
            this.verLuegoTemplate.crearContenidoPTarjeta5();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta6()){
            this.verLuegoTemplate.removerContenido(6);
            this.verLuegoTemplate.crearContenidoPTarjeta6();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta7()){
            this.verLuegoTemplate.removerContenido(7);
            this.verLuegoTemplate.crearContenidoPTarjeta7();
        }
        if(e.getSource()==verLuegoTemplate.getpTarjeta8()){
            this.verLuegoTemplate.removerContenido(8);
            this.verLuegoTemplate.crearContenidoPTarjeta8();
        }
    }
    
    public void restaurarDatos(){
        this.usLog = user.getUsuarioLogeado();
        this.verLuegoTemplate.removeAll();
        this.verLuegoTemplate.crearJPanels();
        this.verLuegoTemplate.crearContenidos();
        this.verLuegoTemplate.repaint();
    }
    
}
