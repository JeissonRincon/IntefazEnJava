package logica;

//@author Jeisson

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelos.Usuario;

 
public class ControlUsuarios {
    private ArrayList<Usuario> usuarios;
    
    public ControlUsuarios(){
        usuarios = new ArrayList<Usuario>();
        cargarDatos();
    }

    public void cargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src/archivos/usuarios.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                String[] atributos = linea.split("&");
                Usuario usuario = new Usuario();
                usuario.setnUsuario(atributos[0]);
                usuario.setcUsuario(atributos[1]);
                usuario.setFoto(new ImageIcon(atributos[2]));
                usuarios.add(usuario);
            }
            fr.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean verificarUsuario(String nombreUsuario, String claveUsuario){
        for(Usuario usuario : usuarios){
            if(usuario.getnUsuario().equals(nombreUsuario))
                if(usuario.getcUsuario().equals(claveUsuario))
                    return true;
        }
        return false;
    }

    public Usuario devolverUsuario(String nombreUsuario){
        for(Usuario usuario : usuarios){
            if(usuario.getnUsuario().equals(nombreUsuario))
                return usuario;
        }
        return null;
    }
}

