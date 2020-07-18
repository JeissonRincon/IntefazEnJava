package modelos;

//@author Jeisson

import javax.swing.ImageIcon;

 
public class Tarjeta {
    
    private String nAnime;
    private ImageIcon iAnime;
    private String tipo;
    private String calificacion;
    private String descripcion;
    

    public String getnAnime() {
        return nAnime;
    }

    public void setnAnime(String nAnime) {
        this.nAnime = nAnime;
    }

    public ImageIcon getiAnime() {
        return iAnime;
    }

    public void setiAnime(ImageIcon iAnime) {
        this.iAnime = iAnime;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
