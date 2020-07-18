
package app.cliente.Componentes.AnimesAgregados;

//@author Jeisson

import app.cliente.Componentes.Tarjeta.TarjetaComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import javax.swing.JPanel;
import modelos.Tarjeta;


public class AnimesAgregadosTemplate extends JPanel{
    
    private AnimesAgregadosComponent animesAgregadosComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private Tarjeta tarjeta;
    
    private JPanel pTarjeta1, pTarjeta2, pTarjeta3, pTarjeta4, pTarjeta5, pTarjeta6, pTarjeta7, pTarjeta8;
    
    public AnimesAgregadosTemplate(AnimesAgregadosComponent animesAgregadosComponent){
        
        this.animesAgregadosComponent = animesAgregadosComponent;
        this.animesAgregadosComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearJPanels();
        this.crearContenidoPTarjeta1();
        this.crearContenidoPTarjeta2();
        this.crearContenidoPTarjeta3();
        this.crearContenidoPTarjeta4();
        this.crearContenidoPTarjeta5();
        this.crearContenidoPTarjeta6();
        this.crearContenidoPTarjeta7();
        this.crearContenidoPTarjeta8();
        
        this.setSize(800, 450);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearJPanels(){
        pTarjeta1=sObjGraficos.construirJPanel(0, 0, 200, 225, Color.white, null);
        this.add(pTarjeta1);
        pTarjeta2=sObjGraficos.construirJPanel(200, 0, 190, 225, Color.white, null);
        this.add(pTarjeta2);
        pTarjeta3=sObjGraficos.construirJPanel(400, 0, 190, 225, Color.white, null);
        this.add(pTarjeta3);
        pTarjeta4=sObjGraficos.construirJPanel(600, 0, 190, 225, Color.white, null);
        this.add(pTarjeta4);
        pTarjeta5=sObjGraficos.construirJPanel(0, 225, 190, 225, Color.white, null);
        this.add(pTarjeta5);
        pTarjeta6=sObjGraficos.construirJPanel(200, 225, 190, 225, Color.white, null);
        this.add(pTarjeta6);
        pTarjeta7=sObjGraficos.construirJPanel(400, 225, 190, 225, Color.white, null);
        this.add(pTarjeta7);
        pTarjeta8=sObjGraficos.construirJPanel(600, 225, 190, 225, Color.white, null);
        this.add(pTarjeta8);
    }
    
    public void crearContenidoPTarjeta1(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(0);
        this.pTarjeta1.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
        
    }
    
    
    public void crearContenidoPTarjeta2(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(1);
        this.pTarjeta2.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    
    public void crearContenidoPTarjeta3(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(2);
        this.pTarjeta3.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    
    public void crearContenidoPTarjeta4(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(3);
        this.pTarjeta4.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    
    public void crearContenidoPTarjeta5(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(4);
        this.pTarjeta5.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta6(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(5);
        this.pTarjeta6.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    
    public void crearContenidoPTarjeta7(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(6);
        this.pTarjeta7.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
    
    public void crearContenidoPTarjeta8(){
        tarjeta=animesAgregadosComponent.obtenerTarjeta(7);
        this.pTarjeta8.add(
            new TarjetaComponent(
                tarjeta.getnAnime(), 
                tarjeta.getiAnime(),
                tarjeta.getTipo()
            ).getTarjetaTemplate()
        );
    }
    
}
