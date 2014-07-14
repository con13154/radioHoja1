/**
 * Algoritmos y Estructura de Datos
 * Hoja de trabajo 1
 * Isa Contreras 13154 / Luis Orellana 13/ Erick de Mata 13
 * RadioGUI.java
 * Clase en la que se crea el interfaz grafica y se mandan a llamar a los metodos del radio para que funcionen en conjunto
 */

package radiofinal;
import javax.swing.JOptionPane;

/**
 *
 * @author E. de Mata
 */
public class RadioGUI extends javax.swing.JFrame {
    private Radio radio;
    private double emisora;
    private String[] listaFav;
    /**
     * Creates new form RadioGUI
     */
    public RadioGUI() {
        initComponents();
        radio = new RadioSony();
    }

   //Código que inicializa todos los componentes del panel (Creado en NetBeans)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        lbEmisora = new javax.swing.JLabel();
        lbNumEmisora = new javax.swing.JLabel();
        lbFrecuencia = new javax.swing.JLabel();
        jbAvanzar = new javax.swing.JButton();
        jbRetroceder = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbOnoff = new javax.swing.JButton();
        jbAmfm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb10.setText("10");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        jb11.setText("11");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });

        jb12.setText("12");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });

        lbEmisora.setText("Emisora");

        lbNumEmisora.setToolTipText("");

        lbFrecuencia.setText("Frecuencia");

        jbAvanzar.setText("Avanzar");
        jbAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAvanzarActionPerformed(evt);
            }
        });

        jbRetroceder.setText("Retroceder");
        jbRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetrocederActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbOnoff.setText("ON/OFF");
        jbOnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOnoffActionPerformed(evt);
            }
        });

        jbAmfm.setText("AM/FM");
        jbAmfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAmfmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb6)
                                    .addComponent(jb1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb12))
                            .addComponent(jbOnoff)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNumEmisora, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEmisora))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRetroceder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAvanzar)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFrecuencia)
                            .addComponent(jbGuardar)
                            .addComponent(jbAmfm))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbOnoff)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3)
                    .addComponent(jb4)
                    .addComponent(jb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb6)
                    .addComponent(jb7)
                    .addComponent(jb8)
                    .addComponent(jb9)
                    .addComponent(jb10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb11)
                            .addComponent(jb12))
                        .addGap(18, 18, 18)
                        .addComponent(lbNumEmisora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFrecuencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmisora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAmfm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAvanzar)
                    .addComponent(jbGuardar)
                    .addComponent(jbRetroceder))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se utiliza para bloquear todos los botones cuando la radio esta apagada
    private void bloquearGUI(){
        
        jb1.setEnabled(false);
        jb2.setEnabled(false);
        jb3.setEnabled(false);
        jb4.setEnabled(false);
        jb5.setEnabled(false);
        jb6.setEnabled(false);
        jb7.setEnabled(false);
        jb8.setEnabled(false);
        jb9.setEnabled(false);
        jb10.setEnabled(false);
        jb11.setEnabled(false);
        jb12.setEnabled(false);
        jbAvanzar.setEnabled(false);
        jbRetroceder.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbAmfm.setEnabled(false);
}
        //Se utiliza para desbloquear los botones cuando la radio se prenda
        private void desbloquearGUI(){
        jb1.setEnabled(true);
        jb2.setEnabled(true);
        jb3.setEnabled(true);
        jb4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jbAvanzar.setEnabled(true);
        jbRetroceder.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbAmfm.setEnabled(true);
        }
     //Indica que el cambio de emisora se esta realizando hacia arriba
    private void jbAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAvanzarActionPerformed
        radio.cambiarEstacion(true);
        lbEmisora.setText(Double.toString(radio.getEstacion())); //Actualiza la emisora
    }//GEN-LAST:event_jbAvanzarActionPerformed
    //Indica que el cambio de emisora se esta realizando hacia abajo
    private void jbRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetrocederActionPerformed
        radio.cambiarEstacion(false);
        lbEmisora.setText(Double.toString(radio.getEstacion())); //Actualiza la emisora
    }//GEN-LAST:event_jbRetrocederActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[0]);
        emisora = Double.parseDouble(listaFav[0]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb1ActionPerformed
    //Permite ingresar el numero de boton para guardar la estacion actual
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       // emisora = Double.parseDouble(lbNumEmisora.getText());
        String opcion = JOptionPane.showInputDialog("Ingrese el numero de boton en el cual desea guardar la estación: "); 
        radio.guardarEstacion(radio.getEstacion() ,Integer.parseInt(opcion));
    }//GEN-LAST:event_jbGuardarActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[1]);
        emisora = Double.parseDouble(listaFav[1]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb2ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[2]);
        emisora = Double.parseDouble(listaFav[2]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb3ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[3]);
        emisora = Double.parseDouble(listaFav[3]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb4ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[4]);
        emisora = Double.parseDouble(listaFav[4]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb5ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[5]);
        emisora = Double.parseDouble(listaFav[5]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb6ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[6]);
        emisora = Double.parseDouble(listaFav[6]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb7ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[7]);
        emisora = Double.parseDouble(listaFav[7]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb8ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[8]);
        emisora = Double.parseDouble(listaFav[8]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb9ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
         listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[9]);
        emisora = Double.parseDouble(listaFav[9]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb10ActionPerformed
     //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
       listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[10]);
        emisora = Double.parseDouble(listaFav[10]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb11ActionPerformed
    //Obtiene el valor de la estacion favorita guardada en el boton, cambia el valor de la emisora para realizar los cambios desde allí
    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        listaFav = radio.getEstacionesFav();
        lbNumEmisora.setText(listaFav[11]);
        emisora = Double.parseDouble(listaFav[11]);
        radio.setEstacion(emisora);
    }//GEN-LAST:event_jb12ActionPerformed
    //Dependiendo del estado de la radio llama al metodo que bloquea botones(apagado) o que los desbloquea(prendido)
    private void jbOnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOnoffActionPerformed
            radio.encendidoApagado();
           if (radio.getEstado()){
               desbloquearGUI();
           }
            else {
                bloquearGUI();
                       
           }
    }//GEN-LAST:event_jbOnoffActionPerformed
    //Indica que se esta haciendo un cambio entre AM y FM
    private void jbAmfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAmfmActionPerformed
       radio.cambiarFrecuencia();
       //Le cambio el texto al boton dependiendo si es AM o FM
       if (radio.getFrecuencia()) {
           jbAmfm.setText("AM");
       }
       else {
           jbAmfm.setText("FM");
       }
    }//GEN-LAST:event_jbAmfmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioGUI().setVisible(true);
            }
        });
    }
    //Inicialización de todos los componentes del panel
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAmfm;
    private javax.swing.JButton jbAvanzar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbOnoff;
    private javax.swing.JButton jbRetroceder;
    private javax.swing.JLabel lbEmisora;
    private javax.swing.JLabel lbFrecuencia;
    private javax.swing.JLabel lbNumEmisora;
    // End of variables declaration//GEN-END:variables
}
