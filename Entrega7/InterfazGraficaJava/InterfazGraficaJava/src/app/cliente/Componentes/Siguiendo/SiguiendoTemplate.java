package app.cliente.Componentes.Siguiendo;

//@author Jeisson

import app.cliente.Componentes.Tarjeta.TarjetaComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class SiguiendoTemplate extends JPanel{
    
    private SiguiendoComponent siguiendoComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JPanel pTarjeta1, pTarjeta2, pTarjeta3, pTarjeta4, pTarjeta5, pTarjeta6, pTarjeta7, pTarjeta8;
    
    private ImageIcon iTarjeta1, iTarjeta2, iTarjeta3, iTarjeta4, iTarjeta5, iTarjeta6, iTarjeta7, iTarjeta8;
    
    
    public SiguiendoTemplate(SiguiendoComponent siguiendoComponent){
        
        this.siguiendoComponent = siguiendoComponent;
        this.siguiendoComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
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
    
    public void crearObjetosDecoradores(){
        iTarjeta1 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Kiba.jpg");
        iTarjeta2 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Basilisk.jpg");
        iTarjeta3 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Baccano.jpg");
        iTarjeta4 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Mob.jpg");
        iTarjeta5 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Nanatsu.jpg");
        iTarjeta6 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Bullet.jpg");
        iTarjeta7 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Katanagatari.jpg");
        iTarjeta8 =new ImageIcon("recursos/imagenes/Animes/Siguiendo/Bakuman.jpg");
    }
    
    public void crearContenidoPTarjeta1(){
        this.pTarjeta1.add(
            new TarjetaComponent(
                "Kiba", 
                iTarjeta1,
                "Película",
                Color.red
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta2(){
        this.pTarjeta2.add(
            new TarjetaComponent(
                "Basilisk", 
                iTarjeta2,
                "OVA",
                Color.orange
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta3(){
        this.pTarjeta3.add(
            new TarjetaComponent(
                "Baccano!", 
                iTarjeta3,
                "Película",
                Color.red
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta4(){
        this.pTarjeta4.add(
            new TarjetaComponent(
                "Mob Psycho 100", 
                iTarjeta4,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta5(){
        this.pTarjeta5.add(
            new TarjetaComponent(
                "Nanatsu no Taizai", 
                iTarjeta5,
                "OVA",
                Color.orange
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta6(){
        this.pTarjeta6.add(
            new TarjetaComponent(
                "Black Bullet", 
                iTarjeta6,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta7(){
        this.pTarjeta7.add(
            new TarjetaComponent(
                "Katanagatari", 
                iTarjeta7,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjeta8(){
        this.pTarjeta8.add(
            new TarjetaComponent(
                "Bakuman", 
                iTarjeta8,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
}
