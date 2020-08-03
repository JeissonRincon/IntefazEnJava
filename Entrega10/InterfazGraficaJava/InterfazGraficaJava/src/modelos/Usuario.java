package modelos;

//@author Jeisson

import java.awt.Image;
import javax.swing.ImageIcon;

 
public class Usuario {
    
    private String nUsuario;
    private String cUsuario;
    private ImageIcon foto;

    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getcUsuario() {
        return cUsuario;
    }

    public void setcUsuario(String cUsuario) {
        this.cUsuario = cUsuario;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
    
    
    
}
