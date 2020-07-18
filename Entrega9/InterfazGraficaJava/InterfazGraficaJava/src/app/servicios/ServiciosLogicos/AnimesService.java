package app.servicios.ServiciosLogicos;

//@author Jeisson

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelos.Tarjeta;


public class AnimesService {
    private static AnimesService servicioA;
    
    private ArrayList<Tarjeta> animes;
    
    public AnimesService(){
        animes = new ArrayList<Tarjeta>();
        cargarDatos();
    }
    
    public void cargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src/archivos/animes.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                String[] atributos = linea.split("&");
                Tarjeta tarjeta = new Tarjeta();
                tarjeta.setnAnime(atributos[0]);
                tarjeta.setTipo(atributos[1]);
                tarjeta.setiAnime(new ImageIcon(atributos[2]));
                tarjeta.setCalificacion(atributos[3]);
                tarjeta.setDescripcion(atributos[4]);
                animes.add(tarjeta);
            }
            fr.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Tarjeta devolverTarjeta(int posicion){
        try{
            return animes.get(posicion);
        }catch(Exception e){
            return null;
        }
    }
    
    public static AnimesService getService(){
        if(servicioA == null)
            servicioA = new AnimesService();
        return servicioA;
    }
}
