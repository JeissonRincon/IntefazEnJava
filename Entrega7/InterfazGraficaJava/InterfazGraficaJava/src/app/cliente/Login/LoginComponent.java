
package app.cliente.Login;

//@author Jeisson

import app.cliente.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class LoginComponent implements ActionListener{
    
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    
    public LoginComponent(){
        this.loginTemplate = new LoginTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginTemplate.getbEntrar()){
            this.entrar();
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
    
    public void entrar(){
        this.vistaPrincipal = new VistaPrincipalComponent(this);
        this.vistaPrincipal.getClass();
        loginTemplate.setVisible(false);
    }
    
    public LoginTemplate getLoginTemplate(){
        return this.loginTemplate;
    }
    
}
