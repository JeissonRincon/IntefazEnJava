
package app.cliente.Componentes.Cuenta;

// @author Jeisson
 
public class CuentaComponent {
    private CuentaTemplate cuentaTemplate;
    
    public CuentaComponent(){
        this.cuentaTemplate = new CuentaTemplate(this);
    }
    
    public CuentaTemplate getCuentaTemplate(){
        return this.cuentaTemplate;
    
}
}
