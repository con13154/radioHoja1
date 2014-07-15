/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13/ Erick de Mata13
 * 
 * RadioSony.java*/

package radiofinal;
import javax.swing.JOptionPane;

public class RadioSony implements Radio{
    private boolean onOff;
    private double estacion;
    private boolean frecuencia;
    private String[] listaFav = {"0","0","0","0","0","0","0","0","0","0","0","0",};

    //Constructor
    public RadioSony() {
        onOff=false;
        frecuencia=true;
        estacion=1000;
    }
    //MÉTODOS
    //Sets y gets de estacion, estado, frecuencia
   public void setEstacion(double estacion){
           this.estacion=estacion;
       }
   public void setEstado(boolean onOff){
           this.onOff = onOff;
       }
    public void setFrecuencia (boolean frecuencia){
           this.frecuencia = frecuencia;
       }
    public boolean getEstado(){
       return onOff; 
       } 
    public boolean getFrecuencia(){
        return frecuencia;
    }   
    public double getEstacion(){
        return estacion;
     }
    //Método encargado de realizar el cambio de encendido a apagado o visceversa para indicar el estado de la radio
   public void encendidoApagado(){
           onOff=!onOff;
   }
   //Método que realiza el cambio entre la frecuencia AM y FM (se colocó una estación al azar dentro del rango de estaciones)
   public void cambiarFrecuencia(){
       if (frecuencia){
           frecuencia=!frecuencia;
           estacion=92.3;
       }
       else {
           frecuencia=!frecuencia;
           estacion=1000;
       }
   }
   //Método que utiliza como parámetros la estación que se encuentra actualmente y un boton para almacenarla como favorito
   public void guardarEstacion(double estacion, int boton){
       listaFav[boton] = Double.toString(estacion);
   }
    //Método que realiza el cambio de estación dependiendo si es AM o FM y si el cambio se está realizando para aumentar o disminuir
   public void cambiarEstacion(boolean masMenos){
       if (masMenos){
           //Si masMenos (aumentar/disminuir) es true ambas frecuencias aumentarán
           if(frecuencia){
               if(estacion<1610){
                   estacion=estacion+10;
                             }      
               else{ 
                   //Indica que al recorrer todas las estaciones regrese al inicio
                   estacion = 530;
               }
               
           }
           else {
               if(estacion<107.9){
                   estacion=estacion+0.2;
                             }      
               else{ 
                    //Indica que al recorrer todas las estaciones regrese al inicio
                   estacion = 87.9;
               }
           }
           
       }
       else {
            if(frecuencia){
                //Si masMenos (aumentar/disminuir) es false ambas frecuencias disminuirán
               if(estacion>530){
                   estacion=estacion-10;
                             }      
               else{ 
                   //Indica que al recorrer todas las estaciones regrese, se coloqué en la última para que la recorra nuevamente
                   estacion = 1610;
               }
               
           }
           else {
               if(estacion>87.9){
                   estacion=estacion-0.2;
                             }      
               else{ 
                   //Indica que al recorrer todas las estaciones regrese, se coloqué en la última para que la recorra nuevamente
                   estacion = 107.9;
               }
           }
           
       }}
       //Metodo que nos permite obtener una estacion específica en la lista de estaciones favoritas 
       public String[] getEstacionesFav(){
           return listaFav;
       }      
}