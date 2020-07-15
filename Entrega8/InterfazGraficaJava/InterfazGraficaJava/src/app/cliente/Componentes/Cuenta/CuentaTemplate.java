
package app.cliente.Componentes.Cuenta;

// @author Jeisson

import java.awt.Color;
import javax.swing.JPanel;

 
public class CuentaTemplate extends JPanel{
    
    private CuentaComponent cuentaComponent;

    
    public CuentaTemplate(CuentaComponent cuentaComponent){
        
        this.cuentaComponent = cuentaComponent;
        this.cuentaComponent.getClass();
        
        this.setSize(200, 500);
        this.setBackground(Color.PINK);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
