package app.cliente.Componentes.UltimosEpisodios;

//@author Jeisson

import app.cliente.Componentes.Episodios.EpisodiosComponent;
import app.servicios.ObjetosGraficosService;
import app.servicios.ServiciosGraficos.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UltimosEpisodiosTemplate extends JPanel{
    private UltimosEpisodiosComponent ultimosEpisodiosComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    private JPanel pEpisodio1,pEpisodio2,pEpisodio3,pEpisodio4,pEpisodio5,
            pEpisodio6,pEpisodio7,pEpisodio8,pEpisodio9,pEpisodio10,pEpisodio11,pEpisodio12,
            pEpisodio13,pEpisodio14,pEpisodio15;
    
    private JPanel pAnimado,pBorde,pLista;
    
    private JLabel lDestacado;
    
    private JButton b1,b2,b3,b4,b5;
    
    private JLabel lBlack,lOne,lBungou,lPokemon,lEnen;
    private JLabel lNBlack,lNOne,lNBungou,lNPokemon,lNEnen;
    
    private ImageIcon iEpisodio1,iEpisodio2,iEpisodio3,iEpisodio4,iEpisodio5,
            iEpisodio6,iEpisodio7,iEpisodio8,iEpisodio9,iEpisodio10,iEpisodio11,iEpisodio12,
            iEpisodio13,iEpisodio14,iEpisodio15;
    
    private ImageIcon iBlack,iOne,iBungou,iPokemon,iEnen,iAux;
    
    
    public UltimosEpisodiosTemplate(UltimosEpisodiosComponent ultimosEpisodiosComponent){
        
        this.ultimosEpisodiosComponent = ultimosEpisodiosComponent;
        this.ultimosEpisodiosComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        this.crearJPanels();
        this.crearJLabels();
        this.crearObjetosDecoradores();
        this.crearJButtons();
        this.crearAnimacion();
        this.crearContenidoPEpisodio1();
        this.crearContenidoPEpisodio2();
        this.crearContenidoPEpisodio3();
        this.crearContenidoPEpisodio4();
        this.crearContenidoPEpisodio5();
        this.crearContenidoPEpisodio6();
        this.crearContenidoPEpisodio7();
        this.crearContenidoPEpisodio8();
        this.crearContenidoPEpisodio9();
        this.crearContenidoPEpisodio10();
        this.crearContenidoPEpisodio11();
        this.crearContenidoPEpisodio12();
        this.crearContenidoPEpisodio13();
        this.crearContenidoPEpisodio14();
        this.crearContenidoPEpisodio15();
        
        
        this.setSize(800, 450);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    
    }
    
    public void crearJPanels(){
        
        pEpisodio1=sObjGraficos.construirJPanel(5, 185, 150, 80, Color.white, null);
        pEpisodio1.setCursor(sRecursos.getcMano());
        this.add(pEpisodio1);
        
        pEpisodio2=sObjGraficos.construirJPanel(165, 185, 150, 80, Color.white, null);
        pEpisodio2.setCursor(sRecursos.getcMano());
        this.add(pEpisodio2);
        
        pEpisodio3=sObjGraficos.construirJPanel(325, 185, 150, 80, Color.white, null);
        pEpisodio3.setCursor(sRecursos.getcMano());
        this.add(pEpisodio3);
        
        pEpisodio4=sObjGraficos.construirJPanel(485, 185, 150, 80, Color.white, null);
        pEpisodio4.setCursor(sRecursos.getcMano());
        this.add(pEpisodio4);
        
        pEpisodio5=sObjGraficos.construirJPanel(645, 185, 150, 80, Color.white, null);
        pEpisodio5.setCursor(sRecursos.getcMano());
        this.add(pEpisodio5);
        
        pEpisodio6=sObjGraficos.construirJPanel(5, 275, 150, 80, Color.white, null);
        pEpisodio6.setCursor(sRecursos.getcMano());
        this.add(pEpisodio6);
        
        pEpisodio7=sObjGraficos.construirJPanel(165, 275, 150, 80, Color.white, null);
        pEpisodio7.setCursor(sRecursos.getcMano());
        this.add(pEpisodio7);
        
        pEpisodio8=sObjGraficos.construirJPanel(325, 275, 150, 80, Color.white, null);
        pEpisodio8.setCursor(sRecursos.getcMano());
        this.add(pEpisodio8);
        
        pEpisodio9=sObjGraficos.construirJPanel(485, 275, 150, 80, Color.white, null);
        pEpisodio9.setCursor(sRecursos.getcMano());
        this.add(pEpisodio9);
        
        pEpisodio10=sObjGraficos.construirJPanel(645, 275, 150, 80, Color.white, null);
        pEpisodio10.setCursor(sRecursos.getcMano());
        this.add(pEpisodio10);
        
        pEpisodio11=sObjGraficos.construirJPanel(5, 365, 150, 80, Color.white, null);
        pEpisodio11.setCursor(sRecursos.getcMano());
        this.add(pEpisodio11);
        
        pEpisodio12=sObjGraficos.construirJPanel(165, 365, 150, 80, Color.white, null);
        pEpisodio12.setCursor(sRecursos.getcMano());
        this.add(pEpisodio12);
        
        pEpisodio13=sObjGraficos.construirJPanel(325, 365, 150, 80, Color.white, null);
        pEpisodio13.setCursor(sRecursos.getcMano());
        this.add(pEpisodio13);
        
        pEpisodio14=sObjGraficos.construirJPanel(485, 365, 150, 80, Color.white, null);
        pEpisodio14.setCursor(sRecursos.getcMano());
        this.add(pEpisodio14);
        
        pEpisodio15=sObjGraficos.construirJPanel(645, 365, 150, 80, Color.white, null);
        pEpisodio15.setCursor(sRecursos.getcMano());
        this.add(pEpisodio15);
        
        pBorde=sObjGraficos.construirJPanel(0, 35, 5, 140, Color.white, null);
        this.add(pBorde);
        
        pLista=sObjGraficos.construirJPanel(355, 35, 445, 140, Color.white, null);
        this.add(pLista);
        
        pAnimado=sObjGraficos.construirJPanel(5, 35, 1750, 140, new Color(0,0,0,0), null);
        this.add(pAnimado);
    
    }
    
    public void crearJLabels(){
    
        lDestacado = sObjGraficos.construirJLabel(" Emisión Destacada", 40, 5, 150, 30, null, 
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        this.add(lDestacado);
        
        lNBlack = sObjGraficos.construirJLabel(" * Black Clover Episodio - 137 ", 5, 0, 300, 28, null,
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        lNBlack.setBorder(sRecursos.getBorderEpi());
        pLista.add(lNBlack);
        
        lNOne = sObjGraficos.construirJLabel(" * One Piece Episodio - 915 ", 5, 28, 300, 28, null,
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        pLista.add(lNOne);
        
        lNBungou = sObjGraficos.construirJLabel(" * Bungou to Alchemist - Episodio 7 ", 5, 56, 300, 28, null,
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        pLista.add(lNBungou);
        
        lNPokemon = sObjGraficos.construirJLabel(" * Pokemon 2019 - Episodio 137 ", 5, 84, 300, 28, null,
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        pLista.add(lNPokemon);
        
        lNEnen = sObjGraficos.construirJLabel(" * Enen  Episodio 4 ", 5, 112, 300, 28, null,
                Color.white, Color.DARK_GRAY, sRecursos.getFontNameAnime(), "l");
        pLista.add(lNEnen);
    }
    
    public void crearJButtons(){
    
        b1 = sObjGraficos.construirJButton("*", 210, 5, 20, 20,sRecursos.getcMano(), 
                null, sRecursos.getFontNombrePagina(), Color.LIGHT_GRAY, Color.black, sRecursos.getBorderInferiorNegro(), "c", true);
        b1.addActionListener(ultimosEpisodiosComponent);
        this.add(b1);
        
        b2 = sObjGraficos.construirJButton("*", 230, 5, 20, 20,sRecursos.getcMano(), 
                null, sRecursos.getFontNombrePagina(), Color.LIGHT_GRAY, Color.white, null, "c", true);
        b2.addActionListener(ultimosEpisodiosComponent);
        this.add(b2);
        
        b3 = sObjGraficos.construirJButton("*", 250, 5, 20, 20,sRecursos.getcMano(), 
                null, sRecursos.getFontNombrePagina(), Color.LIGHT_GRAY, Color.white, null, "c", true);
        b3.addActionListener(ultimosEpisodiosComponent);
        this.add(b3);
        
        b4 = sObjGraficos.construirJButton("*", 270, 5, 20, 20,sRecursos.getcMano(), 
                null, sRecursos.getFontNombrePagina(), Color.LIGHT_GRAY, Color.white, null, "c", true);
        b4.addActionListener(ultimosEpisodiosComponent);
        this.add(b4);
        
        b5 = sObjGraficos.construirJButton("*", 290, 5, 20, 20,sRecursos.getcMano(), 
                null, sRecursos.getFontNombrePagina(), Color.LIGHT_GRAY, Color.white, null, "c", true);
        b5.addActionListener(ultimosEpisodiosComponent);
        this.add(b5);
    }
    
    public void crearAnimacion(){
    
        iAux = new ImageIcon(iBlack.getImage().getScaledInstance(350, 140, Image.SCALE_AREA_AVERAGING));
        
        lBlack = sObjGraficos.construirJLabel(null, 0, 0, 350, 140, iAux, 
                null, null, null, "c");
        pAnimado.add(lBlack);
        
        iAux = new ImageIcon(iOne.getImage().getScaledInstance(350, 140, Image.SCALE_AREA_AVERAGING));
        
        lOne = sObjGraficos.construirJLabel(null, 350, 0, 350, 140, iAux, 
                null, null, null, "c");
        pAnimado.add(lOne);
        
        iAux = new ImageIcon(iBungou.getImage().getScaledInstance(350, 140, Image.SCALE_AREA_AVERAGING));
        
        lBungou = sObjGraficos.construirJLabel(null, 700, 0, 350, 140, iAux, 
                null, null, null, "c");
        pAnimado.add(lBungou);
        
        iAux = new ImageIcon(iPokemon.getImage().getScaledInstance(350, 140, Image.SCALE_AREA_AVERAGING));
        
        lPokemon = sObjGraficos.construirJLabel(null, 1050, 0, 350, 140, iAux, 
                null, null, null, "c");
        pAnimado.add(lPokemon);
        
        iAux = new ImageIcon(iEnen.getImage().getScaledInstance(350, 140, Image.SCALE_AREA_AVERAGING));
        
        lEnen = sObjGraficos.construirJLabel(null, 1400, 0, 350, 140, iAux, 
                null, null, null, "c");
        pAnimado.add(lEnen);
    }
    
    public void crearObjetosDecoradores(){
    
        iEpisodio1 = new ImageIcon("recursos/Imagenes/Episodios/Ahiru.png");
        iEpisodio2 = new ImageIcon("recursos/Imagenes/Episodios/Deca.png");
        iEpisodio3 = new ImageIcon("recursos/Imagenes/Episodios/Black.jpg");
        iEpisodio4 = new ImageIcon("recursos/Imagenes/Episodios/Gibiate.png");
        iEpisodio5 = new ImageIcon("recursos/Imagenes/Episodios/Koi.png");
        iEpisodio6 = new ImageIcon("recursos/Imagenes/Episodios/NoGuns.png");
        iEpisodio7 = new ImageIcon("recursos/Imagenes/Episodios/One.jpg");
        iEpisodio8 = new ImageIcon("recursos/Imagenes/Episodios/Pokemon.png");
        iEpisodio9 = new ImageIcon("recursos/Imagenes/Episodios/Shadowverse.png");
        iEpisodio10 = new ImageIcon("recursos/Imagenes/Episodios/Shokugeki.png");
        iEpisodio11= new ImageIcon("recursos/Imagenes/Episodios/Black.jpg");
        iEpisodio12 = new ImageIcon("recursos/Imagenes/Episodios/Pokemon.png");
        iEpisodio13 = new ImageIcon("recursos/Imagenes/Episodios/Bungou.png");
        iEpisodio14 = new ImageIcon("recursos/Imagenes/Episodios/Deca.png");
        iEpisodio15 = new ImageIcon("recursos/Imagenes/Episodios/Umayon.png");
        
        iBlack = new ImageIcon("recursos/Imagenes/Episodios/GBlack.jpg");
        iOne = new ImageIcon("recursos/Imagenes/Episodios/GOne.jpg");
        iBungou = new ImageIcon("recursos/Imagenes/Episodios/GBungou.jpg");
        iPokemon = new ImageIcon("recursos/Imagenes/Episodios/GPokemon.jpg");
        iEnen = new ImageIcon("recursos/Imagenes/Episodios/GEnen.jpg");
    }
    
    
    
    public void crearContenidoPEpisodio1(){
        this.pEpisodio1.add(
            new EpisodiosComponent(
                    "Ahiru no Sora",
                    iEpisodio1,
                    "40"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio2(){
        this.pEpisodio2.add(
            new EpisodiosComponent(
                    "Deca-Dence",
                    iEpisodio2,
                    "3"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio3(){
        this.pEpisodio3.add(
            new EpisodiosComponent(
                    "Black Clover",
                    iEpisodio3,
                    "135"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio4(){
        this.pEpisodio4.add(
            new EpisodiosComponent(
                    "Gibiate",
                    iEpisodio4,
                    "2"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio5(){
        this.pEpisodio5.add(
            new EpisodiosComponent(
                    "Koi to Producer",
                    iEpisodio5,
                    "2"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio6(){
        this.pEpisodio6.add(
            new EpisodiosComponent(
                    "No Guns Life",
                    iEpisodio6,
                    "3"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio7(){
        this.pEpisodio7.add(
            new EpisodiosComponent(
                    "One Piece",
                    iEpisodio7,
                    "933"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio8(){
        this.pEpisodio8.add(
            new EpisodiosComponent(
                    "Pokemon 2019",
                    iEpisodio8,
                    "29"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio9(){
        this.pEpisodio9.add(
            new EpisodiosComponent(
                    "Shadowverse",
                    iEpisodio9,
                    "15"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio10(){
        this.pEpisodio10.add(
            new EpisodiosComponent(
                    "Shokugeki no Souma",
                    iEpisodio10,
                    "3"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio11(){
        this.pEpisodio11.add(
            new EpisodiosComponent(
                    "Black Clover",
                    iEpisodio11,
                    "134"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio12(){
        this.pEpisodio12.add(
            new EpisodiosComponent(
                    "Pokemon 2019",
                    iEpisodio12,
                    "28"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio13(){
        this.pEpisodio13.add(
            new EpisodiosComponent(
                    "Bungou to Alchemist",
                    iEpisodio13,
                    "11"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio14(){
        this.pEpisodio14.add(
            new EpisodiosComponent(
                    "Deca-Dence",
                    iEpisodio14,
                    "2"
            ).getEpisodiosTemplate()
        );
    }
    
    public void crearContenidoPEpisodio15(){
        this.pEpisodio15.add(
            new EpisodiosComponent(
                    "Umayon",
                    iEpisodio15,
                    "3"
            ).getEpisodiosTemplate()
        );
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }

    public JPanel getpAnimado() {
        return pAnimado;
    }
    
    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JButton getB3() {
        return b3;
    }

    public JButton getB4() {
        return b4;
    }

    public JButton getB5() {
        return b5;
    }

    public JPanel getpEpisodio1() {
        return pEpisodio1;
    }

    public JPanel getpEpisodio2() {
        return pEpisodio2;
    }

    public JPanel getpEpisodio3() {
        return pEpisodio3;
    }

    public JPanel getpEpisodio4() {
        return pEpisodio4;
    }

    public JPanel getpEpisodio5() {
        return pEpisodio5;
    }

    public JPanel getpEpisodio6() {
        return pEpisodio6;
    }

    public JPanel getpEpisodio7() {
        return pEpisodio7;
    }

    public JPanel getpEpisodio8() {
        return pEpisodio8;
    }

    public JPanel getpEpisodio9() {
        return pEpisodio9;
    }

    public JPanel getpEpisodio10() {
        return pEpisodio10;
    }

    public JPanel getpEpisodio11() {
        return pEpisodio11;
    }

    public JPanel getpEpisodio12() {
        return pEpisodio12;
    }

    public JPanel getpEpisodio13() {
        return pEpisodio13;
    }

    public JPanel getpEpisodio14() {
        return pEpisodio14;
    }

    public JPanel getpEpisodio15() {
        return pEpisodio15;
    }

    public JLabel getlNBlack() {
        return lNBlack;
    }

    public JLabel getlNOne() {
        return lNOne;
    }

    public JLabel getlNBungou() {
        return lNBungou;
    }

    public JLabel getlNPokemon() {
        return lNPokemon;
    }

    public JLabel getlNEnen() {
        return lNEnen;
    }
    
    
    
    
}


