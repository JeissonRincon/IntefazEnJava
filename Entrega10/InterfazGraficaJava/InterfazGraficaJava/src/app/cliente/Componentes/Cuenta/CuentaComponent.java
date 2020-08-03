
package app.cliente.Componentes.Cuenta;

// @author Jeisson

import app.servicios.ServiciosLogicos.UsuariosService;
import modelos.Usuario;

 
public class CuentaComponent {
    private CuentaTemplate cuentaTemplate;
    private UsuariosService user;
    private Usuario usLog;
    
    public CuentaComponent(){
        this.user=UsuariosService.getServicio();
        this.usLog=user.getUsuarioLogeado();
        this.cuentaTemplate = new CuentaTemplate(this);
    }
    
    public CuentaTemplate getCuentaTemplate(){
        return this.cuentaTemplate;
    
}
    public Usuario getUsLog() {
        return usLog;
    }
    
    public void restaurarDatos(){
        this.usLog = user.getUsuarioLogeado();
        this.cuentaTemplate.getpPerfil().removeAll();
        this.cuentaTemplate.crearJLabels();
        this.cuentaTemplate.repaint();
    }
    
    
}
