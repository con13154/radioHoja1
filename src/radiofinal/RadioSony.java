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
    private double contadorAm;
    private double contadorFm;
    private String frecuencia;
    private double radioG;
    private Double[] lista_radios = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};

    public RadioSony(double contadorAm, double contadorFm) {
        this.contadorAm = contadorAm;
        this.contadorFm = contadorFm;
    }

    public RadioSony() {
    }

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
    }
}
