package app.servicios.ServiciosLogicos;

//@author Jeisson

import logica.ControlUsuarios;
import modelos.Usuario;

 
public class UsuariosService {
    private static UsuariosService servicio;
    private ControlUsuarios cUsuario;
    private String usuarioLogeado;
    
    public UsuariosService(){
        cUsuario= new ControlUsuarios();
    }
    
    public boolean comprobarUsuario(String nUsuario,String claUsuario){
        if(cUsuario.verificarUsuario(nUsuario, claUsuario)){
            this.usuarioLogeado=nUsuario;
            return true;
        }
        return false;
    }

    public static UsuariosService getServicio() {
        if(servicio ==null){
            servicio = new UsuariosService();
        }
        return servicio;
    }

    public Usuario getUsuarioLogeado() {
        return cUsuario.devolverUsuario(usuarioLogeado);
    }
}
