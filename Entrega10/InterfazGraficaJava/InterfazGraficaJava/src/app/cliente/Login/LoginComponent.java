
package app.cliente.Login;

//@author Jeisson

import app.cliente.Componentes.Cuenta.CuentaComponent;
import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import app.servicios.ServiciosLogicos.UsuariosService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;



public class LoginComponent implements ActionListener, MouseListener{
    
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    private UsuariosService sUsuarios;
    
    public LoginComponent(){
        sUsuarios = UsuariosService.getServicio();
        this.loginTemplate = new LoginTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginTemplate.getbEntrar()){
            this.verificarLogin();
        }
        if(e.getSource()== loginTemplate.getbDiscord()){
            JOptionPane.showMessageDialog(null, "https://discord.com/invite/vfkPrdT");
        }
        if(e.getSource()== loginTemplate.getbYoutube()){
            JOptionPane.showMessageDialog(null, "https://www.youtube.com/channel/UCFQfgxG3QeWCldjAkFJSYWg?sub_confirmation=1");
        }
        if(e.getSource()== loginTemplate.getbTwich()){
            JOptionPane.showMessageDialog(null, "https://www.twitch.tv/padenia/");
        }
        if(e.getSource()== loginTemplate.getbFace()){
            JOptionPane.showMessageDialog(null, "https://www.facebook.com/AnimeFLV/");
        }
        
    }
    
    public void verificarLogin(){
        String nombreUsu = loginTemplate.gettNombreUsuario().getText();
        String claveUsu = new String(loginTemplate.gettClaveUsuario().getPassword());
        if(sUsuarios.comprobarUsuario(nombreUsu, claveUsu)){
            this.entrar();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta", "Advertencia", 2);
        }
    }
    
    public void entrar(){
        if(vistaPrincipal == null){
            this.vistaPrincipal = new VistaPrincipalComponent(this);
            vistaPrincipal.cuadrarInicio();
        }
        else{
            this.vistaPrincipal.actualizarUsuarios();
            
            this.vistaPrincipal.getVistaPrincipalTemplate().setVisible(true);
        }
        
        loginTemplate.setVisible(false);
    }
    
    public LoginTemplate getLoginTemplate(){
        return this.loginTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==loginTemplate.gettNombreUsuario()){
            if(new String(loginTemplate.gettNombreUsuario().getText()).equals("Usuario")){
                loginTemplate.gettNombreUsuario().setText("");
            }
            if(new String(loginTemplate.gettClaveUsuario().getPassword()).equals("")){
                loginTemplate.gettClaveUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorGris());
            }
            loginTemplate.gettNombreUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorAzul());
        }
        
        if(e.getSource()==loginTemplate.gettClaveUsuario()){
            if(new String(loginTemplate.gettClaveUsuario().getPassword()).equals("Contraseña")){
            loginTemplate.gettClaveUsuario().setText("");
            }
            if(new String(loginTemplate.gettNombreUsuario().getText()).equals("")){
                loginTemplate.gettNombreUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorGris());
            }
            loginTemplate.gettClaveUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorAzul());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    public void restaurar(){
        this.loginTemplate.gettNombreUsuario().setText("Usuario");
        this.loginTemplate.gettClaveUsuario().setText("Contraseña");
        this.loginTemplate.gettNombreUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorGris());
        this.loginTemplate.gettClaveUsuario().setBorder(loginTemplate.getsRecursos().getBorderInferiorGris());
    }
    
}
