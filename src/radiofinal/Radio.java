/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13/ Erick de Mata 13
 * Radio.java
 * Clase interface en la que se indican los metodos a utilizar por otras clases
 */
package radiofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Konoha
 */
public interface Radio {
    public String[] getEstacionesFav();
    public boolean getFrecuencia();
    public boolean getEstado();
    public double getEstacion();
    public void setEstacion(double estacion);
    public void setFrecuencia (boolean frecuencia);
    public void setEstado(boolean onOff);
    public void encendidoApagado();
    public void cambiarFrecuencia();
    public void guardarEstacion(double estacion,int boton);
    public void cambiarEstacion(boolean direccion);
   
    
}