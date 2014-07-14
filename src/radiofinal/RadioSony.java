/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13/ Erick de Mata13
 * RadioSony.java
 * 
 */
package radiofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author E. de Mata
 */
public class RadioSony implements Radio{
    private boolean onOff;
    private double estacion;
    private boolean frecuencia;
   // private double radioG;
    private String[] listaFav;

    public RadioSony() {
        onOff=false;
        frecuencia=true;
        estacion=1000;
    }

   public void encendidoApagado(){
           onOff=!onOff;
   }
    
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
   
   public void guardarEstacion(double estacion, int boton){
       listaFav[boton] = Double.toString(estacion);
   }
    
   public void cambiarEstacion(boolean masMenos){
       if (masMenos){
           if(frecuencia){
               if(estacion<1610){
                   estacion=estacion+10;
                             }      
               else{ 
                   estacion = 530;
               }
               
           }
           else {
               if(estacion<107.9){
                   estacion=estacion+0.2;
                             }      
               else{ 
                   estacion = 87.9;
               }
           }
           
       }
       else {
            if(frecuencia){
               if(estacion>530){
                   estacion=estacion-10;
                             }      
               else{ 
                   estacion = 1610;
               }
               
           }
           else {
               if(estacion>87.9){
                   estacion=estacion-0.2;
                             }      
               else{ 
                   estacion = 107.9;
               }
           }
           
       }}
       
       public String[] getEstacionesFav(){
           return listaFav;
       }
       
       public boolean getEstado(){
       return onOff; 
       }
       public void setEstado(boolean onOff){
           this.onOff = onOff;
       }
       public boolean getFrecuencia(){
           return frecuencia;
       }
       public void setFrecuencia (boolean frecuencia){
           this.frecuencia = frecuencia;
       }
       public double getEstacion(){
           return estacion;
       }
       public void setEstacion(double estacion){
           this.estacion=estacion;
       }
/*  
    public double getContadorAm() {
        return contadorAm;
    }

    public void setContadorAm(double contadorAm) {
        this.contadorAm = contadorAm;
    }

    public double getContadorFm() {
        return contadorFm;
    }

    public void setContadorFm(double contadorFm) {
        this.contadorFm = contadorFm;
    }
    

    public double subirEstacion(boolean frecuencia, double  estacion){
        if (frecuencia){ //Si es frecuencia AM
           //Se incrementa en 10
           estacion = estacion +10;
           //Si la estacion llego al limite
           if(estacion > 1610){
               //Se lleva de regreso a la primera estacion AM
               JOptionPane.showMessageDialog(null, "Ha llegado al limite de la frecuencia");
               estacion = 530;
            }
            //guarda la estacion AM actual
            //estacionAM = estacion;
        }else{ //Si la frecuencia es FM
            //Se incrementa en 0.2
            estacion = estacion +0.2;
            //Si la estacion llego al limite
            if(estacion > 107.9){
                //Se lleva de regreso a la primera estacion FM
                JOptionPane.showMessageDialog(null, "Ha llegado al limite de la frecuencia");
                estacion = 87.9;
            }
            //guarda la estacion FM actual
            //estacionFM = estacion;
        }
        //retorna la nueva estacion
        return estacion;
    }
    
    public double bajarEstacion(boolean frecuencia, double  estacion){
        if (frecuencia){ //Si es frecuencia AM
            //Se disminuye en 10
            estacion = estacion -10;
            //Si la estacion llego al limite menor
            if(estacion < 530){
                //Se lleva de regreso a la primera estacion AM
                JOptionPane.showMessageDialog(null, "Ha llegado al limite de la frecuencia");
                estacion = 1610;
            }
            //guarda la estacion AM actual
        }else{ //Si la frecuencia es FM
            //Se disminuye en 0.2
            estacion = estacion - 0.2;
            //Si la estacion llego al limite
            if(estacion < 87.9){
                //Se lleva de regreso a la primera estacion FM
                JOptionPane.showMessageDialog(null, "Ha llegado al limite de la frecuencia");
                estacion = 107.0;
            }
            //guarda la estacion FM actual
        }
        //retorna la estacion actual
        return estacion;
    }
    
    public void guardar(int boton, double estacion){
        lista_radios [boton] = estacion;
    }
    
    public double sacar(int boton){
        radioG = Double.parseDouble(lista_radios[boton].toString());
        return radioG;
    }*/
}
    
