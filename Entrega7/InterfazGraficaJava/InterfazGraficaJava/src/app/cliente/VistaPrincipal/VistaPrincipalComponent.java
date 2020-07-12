
package app.cliente.VistaPrincipal;

//@author Jeisson

import app.cliente.Componentes.AnimesAgregados.AnimesAgregadosComponent;
import app.cliente.Componentes.Cuenta.CuentaComponent;
import app.cliente.Componentes.Emision.EmisionComponent;
import app.cliente.Componentes.Favoritos.FavoritosComponent;
import app.cliente.Componentes.NavegacionInicio.NavegacionInicioComponent;
import app.cliente.Componentes.NavegacionMisAnimes.NavegacionMisAnimesComponent;
import app.cliente.Componentes.Siguiendo.SiguiendoComponent;
import app.cliente.Componentes.UltimosEpisodios.UltimosEpisodiosComponent;
import app.cliente.Componentes.VerLuego.VerLuegoComponent;
import app.cliente.Login.LoginComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class VistaPrincipalComponent implements ActionListener{
    
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    private SiguiendoComponent siguiendoComponent;
    private VerLuegoComponent verLuegoComponent;
    private FavoritosComponent favoritosComponent;
    private LoginComponent loginComponent;
    private NavegacionInicioComponent navegacionInicio;
    private AnimesAgregadosComponent animesAgregados;
    private UltimosEpisodiosComponent ultimosEpisodios;
    private EmisionComponent emision;
    private NavegacionMisAnimesComponent navegacionMisAnimes;
    private CuentaComponent cuenta;
    
    
    public VistaPrincipalComponent(LoginComponent loginComponent){
        
        this.loginComponent = loginComponent;
        
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        
        
    }
    
    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return this.vistaPrincipalTemplate;
    }
    
    
    
    public void mostrarComponentes(String comando){
        
        vistaPrincipalTemplate.getpDerechaPrincipal().removeAll();
       
                
        switch(comando){
            case "INICIO":
                vistaPrincipalTemplate.getpIzquierda().removeAll();
                vistaPrincipalTemplate.getpDerechaSuperior().removeAll();
                if(this.navegacionInicio == null)
                    this.navegacionInicio = new NavegacionInicioComponent(this);
                if(this.emision == null)
                    this.emision = new EmisionComponent();
                
                vistaPrincipalTemplate.getpIzquierda().add(
                    emision.getEmisionTemplate());
                vistaPrincipalTemplate.getpDerechaSuperior().add(
                    navegacionInicio.getNavegacionInicioTemplate());
                break;
                
            case "DIRECTORIO ANIME":
                vistaPrincipalTemplate.getpIzquierda().removeAll();
                
                vistaPrincipalTemplate.getpDerechaSuperior().removeAll();
                if(this.navegacionMisAnimes == null)
                    this.navegacionMisAnimes = new NavegacionMisAnimesComponent(this);
                if(this.cuenta == null)
                    this.cuenta = new CuentaComponent();
                vistaPrincipalTemplate.getpDerechaSuperior().add(
                    navegacionMisAnimes.getNavegacionMisAnimesTemplate());
                vistaPrincipalTemplate.getpIzquierda().add(
                    cuenta.getCuentaTemplate());
                break;
            
            case "Animes agregados":
                if(this.animesAgregados == null)
                    this.animesAgregados = new AnimesAgregadosComponent();
                vistaPrincipalTemplate.getpDerechaPrincipal().add(
                    animesAgregados.getAnimesAgregadosTemplate());
                break;
                
            case "Últimos episodios":
                if(this.ultimosEpisodios == null)
                    this.ultimosEpisodios = new UltimosEpisodiosComponent();
                vistaPrincipalTemplate.getpDerechaPrincipal().add(
                    ultimosEpisodios.getUltimosEpisodiosTemplate());
                break;
                
            case "Siguiendo":
                    if(this.siguiendoComponent == null)
                        this.siguiendoComponent = new SiguiendoComponent();
                    vistaPrincipalTemplate.getpDerechaPrincipal().add(
                        siguiendoComponent.getVerLuegoTemplate());
                break;
                
            case "Favoritos":
                    if(this.favoritosComponent == null)
                        this.favoritosComponent = new FavoritosComponent();
                    vistaPrincipalTemplate.getpDerechaPrincipal().add(
                        favoritosComponent.getFavoritosTemplate());
                break;
                
            case "Ver luego":
                    if(this.verLuegoComponent == null)
                        this.verLuegoComponent = new VerLuegoComponent();
                    vistaPrincipalTemplate.getpDerechaPrincipal().add(
                        verLuegoComponent.getVerLuegoTemplate());
                break;
        
        }
        vistaPrincipalTemplate.repaint();
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vistaPrincipalTemplate.getbInicio()){
            this.mostrarComponentes(e.getActionCommand().trim());
        }
        if(e.getSource()== vistaPrincipalTemplate.getbDirectorio()){
            this.mostrarComponentes(e.getActionCommand().trim());
        }
        
    }
    
}
