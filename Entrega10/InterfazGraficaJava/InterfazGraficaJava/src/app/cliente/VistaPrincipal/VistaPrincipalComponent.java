
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
import app.servicios.ServiciosLogicos.UsuariosService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelos.Usuario;



public class VistaPrincipalComponent implements ActionListener,MouseListener{
    
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
    private UsuariosService user;
    private Usuario usLog;
    
    
    public VistaPrincipalComponent(LoginComponent loginComponent){
        
        this.loginComponent = loginComponent;
        this.user=UsuariosService.getServicio();
        this.usLog=user.getUsuarioLogeado();
        
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
                mostrarComponentes("Últimos episodios");
                
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
                mostrarComponentes("Siguiendo");
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
                ultimosEpisodios.cuadrarAnimacion();
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
        if(e.getSource()== vistaPrincipalTemplate.getbCerrar()){
            loginComponent.restaurar();
            loginComponent.getLoginTemplate().setVisible(true);
            this.vistaPrincipalTemplate.getbCerrar().setVisible(false);
            this.vistaPrincipalTemplate.setVisible(false);
        }
        if(e.getSource()==vistaPrincipalTemplate.getbCS()){
            this.vistaPrincipalTemplate.getbCerrar().setVisible(true);
        }
        if(e.getSource()==vistaPrincipalTemplate.getbCCS()){
            this.vistaPrincipalTemplate.getbCerrar().setVisible(false);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==vistaPrincipalTemplate.getbInicio()){
            navegacionInicio.getNavegacionInicioTemplate().getbAnimesAgregados().setBorder(null);
            navegacionInicio.getNavegacionInicioTemplate().getbUltimosEpisodios().setBorder(
                    vistaPrincipalTemplate.getsRecursos().getBorderInferiorGris());
        }
        if(e.getSource()==vistaPrincipalTemplate.getbDirectorio()){
            navegacionMisAnimes.getNavegacionMisAnimesTemplate().getbFavoritos().setBorder(null);
            navegacionMisAnimes.getNavegacionMisAnimesTemplate().getbSiguiendo().setBorder(
                    vistaPrincipalTemplate.getsRecursos().getBorderInferiorGris());
            navegacionMisAnimes.getNavegacionMisAnimesTemplate().getbVerLuego().setBorder(null);
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

    public Usuario getUsLog() {
        return usLog;
    }
    
    public void actualizarUsuarios(){
        this.cuadrarInicio();
        this.cuenta.restaurarDatos();
        this.usLog=user.getUsuarioLogeado();
        this.vistaPrincipalTemplate.getpDinamico().removeAll();
        this.vistaPrincipalTemplate.crearJLabelsDinamicos();
        this.vistaPrincipalTemplate.getpSuperior().repaint();
        this.favoritosComponent.restaurarDatos();
        this.siguiendoComponent.restaurarDatos();
        this.verLuegoComponent.restaurarDatos();
    }
    
    public void cuadrarInicio(){
        this.iniciarComponentes();
        this.navegacionInicio.getNavegacionInicioTemplate().getbUltimosEpisodios().setBorder(
                                        vistaPrincipalTemplate.getsRecursos().getBorderInferiorGris());
        this.navegacionInicio.getNavegacionInicioTemplate().getbAnimesAgregados().setBorder(null);
    
    }
    
    public void iniciarComponentes(){
        this.mostrarComponentes("DIRECTORIO ANIME");
        this.mostrarComponentes("Ver luego");
        this.mostrarComponentes("Favoritos");
        this.mostrarComponentes("INICIO");
    }
}
