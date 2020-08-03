
package app.cliente.Componentes.UltimosEpisodios;

//@author Jeisson

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.Timer;

public class UltimosEpisodiosComponent implements ActionListener{
    
    private UltimosEpisodiosTemplate ultimosEpisodiosTemplate;
    private Timer timer;
    
    private int estado=1;
    private int anterior=1;
    private int direccion=-1;
    
    public UltimosEpisodiosComponent(){
        this.ultimosEpisodiosTemplate = new UltimosEpisodiosTemplate(this);
        this.timer=new Timer(1,this);
    }
    
    public UltimosEpisodiosTemplate getUltimosEpisodiosTemplate(){
        return this.ultimosEpisodiosTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pintarBoton();
        if(e.getSource() instanceof JButton){
            if(e.getSource()==ultimosEpisodiosTemplate.getB1()){
                this.estado=1;
            }
            if(e.getSource()==ultimosEpisodiosTemplate.getB2()){
                this.estado=2;
                if(estado>anterior)
                    this.direccion=-10;
                else
                    this.direccion=10;
            }
            if(e.getSource()==ultimosEpisodiosTemplate.getB3()){
                this.estado=3;
                if(estado>anterior)
                    this.direccion=-10;
                else
                    this.direccion=10;
            }
            if(e.getSource()==ultimosEpisodiosTemplate.getB4()){
                this.estado=4;
                if(estado>anterior)
                    this.direccion=-10;
                else    
                    this.direccion=10;
            }
            if(e.getSource()==ultimosEpisodiosTemplate.getB5()){
                this.estado=5;
            }
            this.anterior=estado;
            timer.start();
        }
        moverAnimacion();
    }
    
    private void moverAnimacion(){
        switch(estado){
            case 1:
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == 5){
                    timer.stop();
                }else
                    ultimosEpisodiosTemplate.getpAnimado().setLocation(
                            ultimosEpisodiosTemplate.getpAnimado().getX()+10, ultimosEpisodiosTemplate.getpAnimado().getY());
                break;
            case 2:
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -345){
                    timer.stop();
                }else
                    ultimosEpisodiosTemplate.getpAnimado().setLocation(
                            ultimosEpisodiosTemplate.getpAnimado().getX()+direccion, ultimosEpisodiosTemplate.getpAnimado().getY());
                break;
            case 3:
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -695){
                    timer.stop();
                }else
                    ultimosEpisodiosTemplate.getpAnimado().setLocation(
                            ultimosEpisodiosTemplate.getpAnimado().getX()+direccion, ultimosEpisodiosTemplate.getpAnimado().getY());
                break;
            case 4:
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -1045){
                    timer.stop();
                }else
                    ultimosEpisodiosTemplate.getpAnimado().setLocation(
                            ultimosEpisodiosTemplate.getpAnimado().getX()+direccion, ultimosEpisodiosTemplate.getpAnimado().getY());
                break;
            case 5:
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -1395){
                    timer.stop();
                }else
                    ultimosEpisodiosTemplate.getpAnimado().setLocation(
                            ultimosEpisodiosTemplate.getpAnimado().getX()-10, ultimosEpisodiosTemplate.getpAnimado().getY());
                break;
            default:
                break;
        }
        ultimosEpisodiosTemplate.repaint();
    }
    
    public void pintarBoton(){
            if(ultimosEpisodiosTemplate.getpAnimado().getX() == 5){
                    ultimosEpisodiosTemplate.getB1().setBorder(
                    ultimosEpisodiosTemplate.getsRecursos().getBorderInferiorNegro());
                    ultimosEpisodiosTemplate.getB2().setBorder(null);
                    
                    ultimosEpisodiosTemplate.getB1().setForeground(Color.black);
                    ultimosEpisodiosTemplate.getB2().setForeground(Color.white);
                    
                    ultimosEpisodiosTemplate.getlNOne().setBorder(null);
                    ultimosEpisodiosTemplate.getlNBlack().setBorder(
                            ultimosEpisodiosTemplate.getsRecursos().getBorderEpi());
                }
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -345){
                    ultimosEpisodiosTemplate.getB2().setBorder(
                    ultimosEpisodiosTemplate.getsRecursos().getBorderInferiorNegro());
                    ultimosEpisodiosTemplate.getB1().setBorder(null);
                    ultimosEpisodiosTemplate.getB3().setBorder(null);
                    
                    ultimosEpisodiosTemplate.getB1().setForeground(Color.white);
                    ultimosEpisodiosTemplate.getB2().setForeground(Color.black);
                    ultimosEpisodiosTemplate.getB3().setForeground(Color.white);
                    
                    ultimosEpisodiosTemplate.getlNBlack().setBorder(null);
                    ultimosEpisodiosTemplate.getlNBungou().setBorder(null);
                    ultimosEpisodiosTemplate.getlNOne().setBorder(
                            ultimosEpisodiosTemplate.getsRecursos().getBorderEpi());
                }
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -695){
                    ultimosEpisodiosTemplate.getB3().setBorder(
                    ultimosEpisodiosTemplate.getsRecursos().getBorderInferiorNegro());
                    ultimosEpisodiosTemplate.getB2().setBorder(null);
                    ultimosEpisodiosTemplate.getB4().setBorder(null);
                    
                    ultimosEpisodiosTemplate.getB2().setForeground(Color.white);
                    ultimosEpisodiosTemplate.getB3().setForeground(Color.black);
                    ultimosEpisodiosTemplate.getB4().setForeground(Color.white);
                    
                    ultimosEpisodiosTemplate.getlNOne().setBorder(null);
                    ultimosEpisodiosTemplate.getlNPokemon().setBorder(null);
                    ultimosEpisodiosTemplate.getlNBungou().setBorder(
                            ultimosEpisodiosTemplate.getsRecursos().getBorderEpi());
                }
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -1045){
                    ultimosEpisodiosTemplate.getB4().setBorder(
                    ultimosEpisodiosTemplate.getsRecursos().getBorderInferiorNegro());
                    ultimosEpisodiosTemplate.getB3().setBorder(null);
                    ultimosEpisodiosTemplate.getB5().setBorder(null);
                    
                    ultimosEpisodiosTemplate.getB3().setForeground(Color.white);
                    ultimosEpisodiosTemplate.getB4().setForeground(Color.black);
                    ultimosEpisodiosTemplate.getB5().setForeground(Color.white);
                    
                    ultimosEpisodiosTemplate.getlNBungou().setBorder(null);
                    ultimosEpisodiosTemplate.getlNEnen().setBorder(null);
                    ultimosEpisodiosTemplate.getlNPokemon().setBorder(
                            ultimosEpisodiosTemplate.getsRecursos().getBorderEpi());
                }
                if(ultimosEpisodiosTemplate.getpAnimado().getX() == -1395){
                    ultimosEpisodiosTemplate.getB5().setBorder(
                    ultimosEpisodiosTemplate.getsRecursos().getBorderInferiorNegro());
                    ultimosEpisodiosTemplate.getB4().setBorder(null);
                    
                    ultimosEpisodiosTemplate.getB4().setForeground(Color.white);
                    ultimosEpisodiosTemplate.getB5().setForeground(Color.black);
                    
                    ultimosEpisodiosTemplate.getlNPokemon().setBorder(null);
                    ultimosEpisodiosTemplate.getlNEnen().setBorder(
                            ultimosEpisodiosTemplate.getsRecursos().getBorderEpi());
                }
    }
    
    public void cuadrarAnimacion(){
        ultimosEpisodiosTemplate.getpAnimado().setLocation(5, 35);
        this.estado=1;
        this.anterior=estado;
        pintarBoton();
        ultimosEpisodiosTemplate.getB3().setForeground(Color.white);
        ultimosEpisodiosTemplate.getB4().setForeground(Color.white);
        ultimosEpisodiosTemplate.getB5().setForeground(Color.white);
        ultimosEpisodiosTemplate.getlNBungou().setBorder(null);
        ultimosEpisodiosTemplate.getlNEnen().setBorder(null);
        ultimosEpisodiosTemplate.getlNPokemon().setBorder(null);
        ultimosEpisodiosTemplate.getB4().setBorder(null);
        ultimosEpisodiosTemplate.getB3().setBorder(null);
        ultimosEpisodiosTemplate.getB5().setBorder(null);
        
        ultimosEpisodiosTemplate.repaint();
    }

    
    
}
