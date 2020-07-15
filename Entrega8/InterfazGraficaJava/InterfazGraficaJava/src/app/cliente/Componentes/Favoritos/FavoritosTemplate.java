package app.cliente.Componentes.Favoritos;

import app.cliente.Componentes.Informativa.InformativaComponent;
import app.cliente.Componentes.Tarjeta.TarjetaComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

// @author Jeisson
 
public class FavoritosTemplate extends JPanel{
    
    private FavoritosComponent favoritosComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JPanel pTarjeta1, pTarjeta2, pTarjeta3, pTarjeta4, pTarjeta5, pTarjeta6, pTarjeta7, pTarjeta8;
    
    
    private ImageIcon iTarjeta1, iTarjeta2, iTarjeta3, iTarjeta4, iTarjeta5, iTarjeta6, iTarjeta7, iTarjeta8;
    
    public FavoritosTemplate(FavoritosComponent favoritosComponent){
        
        this.favoritosComponent = favoritosComponent;
        this.favoritosComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearContenidoPTarjeta1();
        //this.crearContenidoPTarjetai1();
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
        pTarjeta1.addMouseListener(favoritosComponent);
        this.add(pTarjeta1);
        pTarjeta2=sObjGraficos.construirJPanel(200, 0, 190, 225, Color.white, null);
        pTarjeta2.addMouseListener(favoritosComponent);
        this.add(pTarjeta2);
        pTarjeta3=sObjGraficos.construirJPanel(400, 0, 190, 225, Color.white, null);
        pTarjeta3.addMouseListener(favoritosComponent);
        this.add(pTarjeta3);
        pTarjeta4=sObjGraficos.construirJPanel(600, 0, 190, 225, Color.white, null);
        pTarjeta4.addMouseListener(favoritosComponent);
        this.add(pTarjeta4);
        pTarjeta5=sObjGraficos.construirJPanel(0, 225, 190, 225, Color.white, null);
        pTarjeta5.addMouseListener(favoritosComponent);
        this.add(pTarjeta5);
        pTarjeta6=sObjGraficos.construirJPanel(200, 225, 190, 225, Color.white, null);
        pTarjeta6.addMouseListener(favoritosComponent);
        this.add(pTarjeta6);
        pTarjeta7=sObjGraficos.construirJPanel(400, 225, 190, 225, Color.white, null);
        pTarjeta7.addMouseListener(favoritosComponent);
        this.add(pTarjeta7);
        pTarjeta8=sObjGraficos.construirJPanel(600, 225, 190, 225, Color.white, null);
        pTarjeta8.addMouseListener(favoritosComponent);
        this.add(pTarjeta8);
    }
    
    public void crearObjetosDecoradores(){
        iTarjeta1 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Megalo.jpg");
        iTarjeta2 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Abyss.jpg");
        iTarjeta3 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Dororo.jpg");
        iTarjeta4 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Garo.jpg");
        iTarjeta5 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Kimetsu.jpg");
        iTarjeta6 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Kabaneri.jpg");
        iTarjeta7 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Bungou.jpg");
        iTarjeta8 =new ImageIcon("recursos/imagenes/Animes/Favoritos/Log.jpg");
    }
    
    public void crearContenidoPTarjeta1(){
        this.pTarjeta1.add(
            new TarjetaComponent(
                "Megalo Box", 
                iTarjeta1,
                "OVA",
                Color.orange
            ).getTarjetaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjetai1(){
        this.pTarjeta1.add(
            new InformativaComponent(
                "Megalo Box", 
                "33",
                "JD (Junk Dog) participa en combates cerrados de boxeo en un ring subterráneo para sobrevivir."
                        + " Hoy, entra en el ring de nuevo, pero se encuentra con cierta persona."
                        + " JD quiere aceptar el reto con el que lo arriesgará todo."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta2(){
        this.pTarjeta2.add(
            new TarjetaComponent(
                "Made in Abyss", 
                iTarjeta2,
                "Película",
                Color.red
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai2(){
        this.pTarjeta2.add(
            new InformativaComponent(
                "Made in Abyss", 
                "95",
                "Una joven huérfana llamada Rico vive en el pueblo Osu en el filo del Abismo. "
                        + "Su sueño es convertirse en una “Cave Raider”, como su madre, y solventar los "
                        + "misterios del sistema de cuevas. Un día, Rico comienza a explorar las cuevas y "
                        + "descubre un robot con aspecto de un chico humano."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta3(){
        this.pTarjeta3.add(
            new TarjetaComponent(
                "Dororo", 
                iTarjeta3,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai3(){
        this.pTarjeta3.add(
            new InformativaComponent(
                "Dororo", 
                "94",
                "Daigo Kagemitsu es un temible samurái que entregó su futuro hijo a demonios, a cambio de ver cumplido "
                        + "su sueño de conquistar el país. Al cabo del tiempo, nació un niño deforme, al que faltaban "
                        + "cuarenta y ocho partes de su cuerpo. Años después emprenderá un viaje a lo largo del cual se "
                        + "enfrentará a los demonios para recuperar las partes de su cuerpo."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta4(){
        this.pTarjeta4.add(
            new TarjetaComponent(
                "Garo: Vanishing Line", 
                iTarjeta4,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai4(){
        this.pTarjeta4.add(
            new InformativaComponent(
                "Garo: Vanishing Line", 
                "90",
                "La gran y prospera Russell City se enfrenta a una amenaza, un hombre llamado Sword es uno de "
                        + "los primeros en descubrirlo y se lanza a una lucha para exponer la verdad; con la palabra "
                        + "clave \"El Dorado\" en común, él y Sophie, una muchacha que busca a su hermano perdido, "
                        + "se lanzan a una aventura juntos para descubrir el verdadero significado de la misteriosa "
                        + "frase."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta5(){
        this.pTarjeta5.add(
            new TarjetaComponent(
                "Kimetsu no Yaiba", 
                iTarjeta5,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai5(){
        this.pTarjeta5.add(
            new InformativaComponent(
                "Kimetsu no Yaiba", 
                "96",
                "Tanjiro descubre que su familia ha asesinada por un demonio y que su hermana menor Nezuko ha sufrido "
                        + "una transformación en demonio. Tanjiro decide "
                        + "convertirse en un cazador de demonios para poder devolver a su hermana a la normalidad "
                        + "y matar al demonio que masacró a su familia."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta6(){
        this.pTarjeta6.add(
            new TarjetaComponent(
                "Koutetsujou no Kabaneri", 
                iTarjeta6,
                "Película",
                Color.red
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai6(){
        this.pTarjeta6.add(
            new InformativaComponent(
                "Koutetsujou no Kabaneri", 
                "92",
                "La historia de acción y supervivencia de estilo steampunk tiene lugar en una isla, en un país "
                        + "llamado Hinomoto, donde los humanos se esconden en fortalezas llamadas estaciones para "
                        + "protegerse de la amenaza de seres con corazón de acero y aspecto de zombie llamados Kabane."
                        
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta7(){
        this.pTarjeta7.add(
            new TarjetaComponent(
                "Bungou Stray Dogs", 
                iTarjeta7,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai7(){
        this.pTarjeta7.add(
            new InformativaComponent(
                "Bungou Stray Dogs", 
                "93",
                "La historia está protagonizada por una liga de figuras literarias con poderes sobrenaturales, "
                        + "como Ryunosuke Akutagawa, que en la vida real escribió varias novelas y en el manga "
                        + "tiene el poder de transformar su capa en una especie de monstruo. Él y sus compañeros "
                        + "escritores se dedicarán a resolver misterios como parte de la “Agencia Armada de Detectives”."
            ).getInformativaTemplate()
        );
        
    }
    
    public void crearContenidoPTarjeta8(){
        this.pTarjeta8.add(
            new TarjetaComponent(
                "Log Horizon", 
                iTarjeta8,
                "Anime",
                sRecursos.getColorAzulMarino()
            ).getTarjetaTemplate()
        );
    }
    
    public void crearContenidoPTarjetai8(){
        this.pTarjeta8.add(
            new InformativaComponent(
                "Log Horizon", 
                "94",
                "“Elder Tale” es un popular y ampliamente asentado juego on-line, pero el día en el que se lanza "
                        + "30.000 usuarios japoneses se ven atrapados dentro del juego."
                        + " El protagonista "
                        + "Shiroe empieza así su lucha en la ciudad de Akiba junto a su viejo amigo Naotsugu y la "
                        + "preciosa asesina Akatsuki, con quienes formara una guild de nombre Log Horizon."
            ).getInformativaTemplate()
        );
        
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