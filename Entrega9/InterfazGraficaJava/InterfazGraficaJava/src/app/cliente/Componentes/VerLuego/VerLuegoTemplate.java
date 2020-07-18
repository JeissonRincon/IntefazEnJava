package app.cliente.Componentes.VerLuego;

import app.cliente.Componentes.Informativa.InformativaComponent;
import app.cliente.Componentes.Tarjeta.TarjetaComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;
import modelos.Tarjeta;

//@author Jeisson
 
public class VerLuegoTemplate extends JPanel{
    
    private VerLuegoComponent verLuegoComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private Tarjeta tarjeta;
    
    private JPanel pTarjeta1, pTarjeta2, pTarjeta3, pTarjeta4, 
            pTarjeta5, pTarjeta6, pTarjeta7, pTarjeta8;
    
    public VerLuegoTemplate(VerLuegoComponent verLuegoComponent){
        
        this.verLuegoComponent = verLuegoComponent;
        this.verLuegoComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearJPanels();
        this.crearContenidos();
        
        this.setSize(800, 450);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearJPanels(){
        pTarjeta1=sObjGraficos.construirJPanel(0, 0, 200, 225, Color.white, null);
        pTarjeta1.addMouseListener(verLuegoComponent);
        this.add(pTarjeta1);
        pTarjeta2=sObjGraficos.construirJPanel(200, 0, 190, 225, Color.white, null);
        pTarjeta2.addMouseListener(verLuegoComponent);
        this.add(pTarjeta2);
        pTarjeta3=sObjGraficos.construirJPanel(400, 0, 190, 225, Color.white, null);
        pTarjeta3.addMouseListener(verLuegoComponent);
        this.add(pTarjeta3);
        pTarjeta4=sObjGraficos.construirJPanel(600, 0, 190, 225, Color.white, null);
        pTarjeta4.addMouseListener(verLuegoComponent);
        this.add(pTarjeta4);
        pTarjeta5=sObjGraficos.construirJPanel(0, 225, 190, 225, Color.white, null);
        pTarjeta5.addMouseListener(verLuegoComponent);
        this.add(pTarjeta5);
        pTarjeta6=sObjGraficos.construirJPanel(200, 225, 190, 225, Color.white, null);
        pTarjeta6.addMouseListener(verLuegoComponent);
        this.add(pTarjeta6);
        pTarjeta7=sObjGraficos.construirJPanel(400, 225, 190, 225, Color.white, null);
        pTarjeta7.addMouseListener(verLuegoComponent);
        this.add(pTarjeta7);
        pTarjeta8=sObjGraficos.construirJPanel(600, 225, 190, 225, Color.white, null);
        pTarjeta8.addMouseListener(verLuegoComponent);
        this.add(pTarjeta8);
    }
    
    public void crearContenidoPTarjeta1(){
        tarjeta=verLuegoComponent.obtenerTarjeta(16);
        this.pTarjeta1.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjetai1(){
        tarjeta=verLuegoComponent.obtenerTarjeta(16);
        this.pTarjeta1.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta2(){
        tarjeta=verLuegoComponent.obtenerTarjeta(17);
        this.pTarjeta2.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai2(){
        tarjeta=verLuegoComponent.obtenerTarjeta(17);
        this.pTarjeta2.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta3(){
        tarjeta=verLuegoComponent.obtenerTarjeta(18);
        this.pTarjeta3.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai3(){
        tarjeta=verLuegoComponent.obtenerTarjeta(18);
        this.pTarjeta3.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta4(){
        tarjeta=verLuegoComponent.obtenerTarjeta(19);
        this.pTarjeta4.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai4(){
        tarjeta=verLuegoComponent.obtenerTarjeta(19);
        this.pTarjeta4.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta5(){
        tarjeta=verLuegoComponent.obtenerTarjeta(20);
        this.pTarjeta5.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai5(){
        tarjeta=verLuegoComponent.obtenerTarjeta(20);
        this.pTarjeta5.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta6(){
        tarjeta=verLuegoComponent.obtenerTarjeta(21);
        this.pTarjeta6.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai6(){
        tarjeta=verLuegoComponent.obtenerTarjeta(21);
        this.pTarjeta6.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta7(){
        tarjeta=verLuegoComponent.obtenerTarjeta(22);
        this.pTarjeta7.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai7(){
        tarjeta=verLuegoComponent.obtenerTarjeta(22);
        this.pTarjeta7.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta8(){
        tarjeta=verLuegoComponent.obtenerTarjeta(23);
        this.pTarjeta8.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai8(){
        tarjeta=verLuegoComponent.obtenerTarjeta(23);
        this.pTarjeta8.add(
            new InformativaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getCalificacion(),
                tarjeta.getDescripcion()
            ).getInformativaTemplate()
        );
    }
    
    public void crearContenidos(){
        this.crearContenidoPTarjeta1();
        this.crearContenidoPTarjeta2();
        this.crearContenidoPTarjeta3();
        this.crearContenidoPTarjeta4();
        this.crearContenidoPTarjeta5();
        this.crearContenidoPTarjeta6();
        this.crearContenidoPTarjeta7();
        this.crearContenidoPTarjeta8();
    }

    public void removerContenido(int i){
        switch (i){
            case 1:
                this.pTarjeta1.removeAll();
                break;
            case 2:
                this.pTarjeta2.removeAll();
                break;
            case 3:
                this.pTarjeta3.removeAll();
                break;
            case 4:
                this.pTarjeta4.removeAll();
                break;
            case 5:
                this.pTarjeta5.removeAll();
                break;
            case 6:
                this.pTarjeta6.removeAll();
                break;
            case 7:
                this.pTarjeta7.removeAll();
                break;
            case 8:
                this.pTarjeta8.removeAll();
                break;
            default:
                break;
        }
        
        this.repaint();
    }

    public JPanel getpTarjeta1() {
        return pTarjeta1;
    }

    public JPanel getpTarjeta2() {
        return pTarjeta2;
    }

    public JPanel getpTarjeta3() {
        return pTarjeta3;
    }

    public JPanel getpTarjeta4() {
        return pTarjeta4;
    }

    public JPanel getpTarjeta5() {
        return pTarjeta5;
    }

    public JPanel getpTarjeta6() {
        return pTarjeta6;
    }

    public JPanel getpTarjeta7() {
        return pTarjeta7;
    }

    public JPanel getpTarjeta8() {
        return pTarjeta8;
    }
    
    
    
}
