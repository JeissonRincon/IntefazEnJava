package app.servicios;

// @author Jeisson

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {
    
    private Color colorAzulMarino, colorNegro;
    private Font fontNombrePagina, fontFLV, fontIniciarSesion,fontSubtitulos,fontBotones,fontLetrero;
    private Cursor cMano;
    private Border borderInferiorNegro;
    private ImageIcon iFondo,iTwich,iFace,iYoutube,iDiscord;
    
    static private RecursosService servicio;
    
    private RecursosService(){
        colorAzulMarino = new Color(40,221,221);
        colorNegro = new Color(21,20,19);
        fontNombrePagina = new Font("Rockwell Extra Bold",Font.PLAIN,30);
        fontFLV = new Font("Rockwell Extra Bold",Font.ITALIC,35);
        fontIniciarSesion = new Font("Georgia",Font.BOLD,14);
        fontSubtitulos = new Font("Georgia",Font.BOLD,12);
        fontBotones = new Font("Rockwell Extra Bold",Font.BOLD,15);
        fontLetrero = new Font("Rockwell Extra Bold",Font.PLAIN,12);
        iFondo = new ImageIcon("recursos/imagenes/portada.jpg");
        iTwich = new ImageIcon("recursos/imagenes/logoTwich.png"); 
        iFace = new ImageIcon("recursos/imagenes/logoFace.jpg");
        iYoutube = new ImageIcon("recursos/imagenes/logoYoutube.jpg");
        iDiscord = new ImageIcon("recursos/imagenes/logoDiscord.jpg");
        borderInferiorNegro = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNegro);
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }

    public Color getColorAzulMarino() {
        return colorAzulMarino;
    }

    public Color getColorNegro() {
        return colorNegro;
    }

    public Font getFontNombrePagina() {
        return fontNombrePagina;
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
    
    
    
    public Cursor getcMano() {
        return cMano;
    }

    public Border getBorderInferiorNegro() {
        return borderInferiorNegro;
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
