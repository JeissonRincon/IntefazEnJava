package app.servicios.ServiciosGraficos;

// @author Jeisson

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {
    
    private Color colorAzulMarino, colorNegro, colorAzul,colorGris,colorRojo;
    private Font fontNombrePagina, fontFLV, fontIniciarSesion,fontSubtitulos,fontBotones,
            fontLetrero,fontDescripcion,fontNameAnime;
    private Cursor cMano;
    private Border borderInferiorNegro,borderGris,borderInferiorAzul,borderInferiorGris;
    private ImageIcon iFondo,iTwich,iFace,iYoutube,iDiscord;
    
    static private RecursosService servicio;
    
    private RecursosService(){
        colorAzulMarino = new Color(40,221,221);
        colorNegro = new Color(21,20,19);
        colorAzul = new Color (44,64,163);
        colorGris = new Color (181,182,190);
        colorRojo = new Color (247,73,94);
        fontNombrePagina = new Font("Rockwell Extra Bold",Font.PLAIN,30);
        fontFLV = new Font("Rockwell Extra Bold",Font.ITALIC,35);
        fontIniciarSesion = new Font("Georgia",Font.BOLD,14);
        fontSubtitulos = new Font("Georgia",Font.BOLD,12);
        fontBotones = new Font("Rockwell Extra Bold",Font.BOLD,15);
        fontLetrero = new Font("Rockwell Extra Bold",Font.PLAIN,12);
        fontDescripcion = new Font("Georgia",Font.PLAIN,10);
        fontNameAnime = new Font("Georgia",Font.BOLD,14);
        iFondo = new ImageIcon("recursos/imagenes/portada.jpg");
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.jpg");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.jpg");
        borderInferiorNegro = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNegro);
        borderInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorAzul);
        borderInferiorGris = BorderFactory.createMatteBorder(0, 0, 2, 0, colorGris);
        borderGris = BorderFactory.createBevelBorder(1, Color.DARK_GRAY, Color.LIGHT_GRAY);
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    public Color getColorAzulMarino() {
        return colorAzulMarino;
    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Color getColorAzul() {
        return colorAzul;
    }

    public Color getColorRojo() {
        return colorRojo;
    }
    
    public Border getBorderInferiorAzul() {
        return borderInferiorAzul;
    }
    
    public Font getFontNombrePagina() {
        return fontNombrePagina;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Border getBorderInferiorGris() {
        return borderInferiorGris;
    }
    
    

    public Font getFontFLV() {
        return fontFLV;
    }

    public Font getFontIniciarSesion() {
        return fontIniciarSesion;
    }

    public Font getFontSubtitulos() {
        return fontSubtitulos;
    }

    public Font getFontBotones() {
        return fontBotones;
    }

    public Font getFontLetrero() {
        return fontLetrero;
    }

    public Font getFontDescripcion() {
        return fontDescripcion;
    }

    public Font getFontNameAnime() {
        return fontNameAnime;
    }
    
    public Cursor getcMano() {
        return cMano;
    }

    public Border getBorderInferiorNegro() {
        return borderInferiorNegro;
    }

    public Border getBorderGris() {
        return borderGris;
    }
    
    

    public ImageIcon getiFondo() {
        return iFondo;
    }

    public ImageIcon getiTwich() {
        return iTwich;
    }

    public ImageIcon getiFace() {
        return iFace;
    }

    public ImageIcon getiYoutube() {
        return iYoutube;
    }

    public ImageIcon getiDiscord() {
        return iDiscord;
    }
    
     public static RecursosService getService(){
        if(servicio == null){
            servicio = new RecursosService();
        }
        return servicio;
    }
    
}
