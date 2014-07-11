/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13/ Erick de Mata13
 * Radio.java
 * Clase interface en la que se indican los metodos a utilizar por otras clases
 */
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radiofinal;

import javax.swing.JOptionPane;



/**
 *
 * @author Konoha
 */
public interface Radio {
    void guardar(int boton,double estacion);
    double sacar(int boton);
    double bajarEstacion(boolean frecuencia, double estacion);
    double subirEstacion(boolean frecuencia, double estacion);
    double getContadorAm();
    double getContadorFm();
    void setContadorAm(double contadorAm);
    void setContadorFm(double contadorFm);
    
}