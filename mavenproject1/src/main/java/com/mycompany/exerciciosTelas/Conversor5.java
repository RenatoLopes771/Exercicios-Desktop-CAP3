/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exerciciosTelas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ambienterust
 */
public class Conversor5 extends javax.swing.JFrame {

    com.mycompany.exercicios.Conversor5 conversor5BaseClass;

    /**
     * Creates new form Conversor5
     */
    public Conversor5() {
        conversor5BaseClass = new com.mycompany.exercicios.Conversor5();
        initComponents();
    }

    private String dd(double input) {
        return String.format("%.2f", input);
    }

    private void gerarErro() {
        JOptionPane.showMessageDialog(new JFrame(),
                "Erro! Digitação incorreta.\n\nAtenção: não use vírgulas.",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    private void fahrenheitParaKelvin() {
        try {
            double fahrenheit = Double.parseDouble(textFieldFahrenheitFK.getText());

            double kelvin = conversor5BaseClass.fahrenheitKelvin(fahrenheit);

            textFieldKelvinFK.setText(dd(kelvin));
        } catch (Exception e) {
            gerarErro();
        }
    }

    private void kelvinParaFahrenheit() {
        try {
            double kelvin = Double.parseDouble(textFieldKelvinFK.getText());

            double fahrenheit = conversor5BaseClass.kelvinFahrenheit(kelvin);

            textFieldFahrenheitFK.setText(dd(fahrenheit));
        } catch (Exception e) {
            gerarErro();
        }
    }

    private void celsiusParaFahrenheit() {
        try {
            double celsius = Double.parseDouble(textFieldCelsiusFC.getText());

            double fahrenheit = conversor5BaseClass.celsiusFahrenheit(celsius);

            textFieldFahrenheitFC.setText(dd(fahrenheit));
        } catch (Exception e) {
            gerarErro();
        }
    }

    private void fahrenheitParaCelsius() {
        try {
            double fahrenheit = Double.parseDouble(textFieldFahrenheitFC.getText());

            double celsius = conversor5BaseClass.fahrenheitCelsius(fahrenheit);

            textFieldCelsiusFC.setText(dd(celsius));
        } catch (Exception e) {
            gerarErro();
        }
    }

    private void celsiusParaKelvin() {
        try {
            double celsius = Double.parseDouble(textFieldCelsiusKC.getText());

            double kelvin = conversor5BaseClass.celsiusKelvin(celsius);

            textFieldKelvinKC.setText(dd(kelvin));
        } catch (Exception e) {
            gerarErro();
        }
    }

    private void kelvinParaCelsius() {
        try {
            double kelvin = Double.parseDouble(textFieldKelvinKC.getText());

            double celsius = conversor5BaseClass.kelvinCelsius(kelvin);

            textFieldCelsiusKC.setText(dd(celsius));
        } catch (Exception e) {
            gerarErro();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonKelvinParaFahrenheit = new javax.swing.JButton();
        buttonFahrenheitParaKelvin = new javax.swing.JButton();
        textFieldFahrenheitFK = new javax.swing.JTextField();
        textFieldKelvinFK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonCelsiusParaFahrenheit = new javax.swing.JButton();
        buttonFahrenheitParaCelsius = new javax.swing.JButton();
        textFieldFahrenheitFC = new javax.swing.JTextField();
        textFieldCelsiusFC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonCelsiusParaKelvin = new javax.swing.JButton();
        buttonKelvinParaCelsius = new javax.swing.JButton();
        textFieldKelvinKC = new javax.swing.JTextField();
        textFieldCelsiusKC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fahrenheit");

        jLabel2.setText("Kelvin");

        buttonKelvinParaFahrenheit.setText("<");
        buttonKelvinParaFahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKelvinParaFahrenheitMouseClicked(evt);
            }
        });

        buttonFahrenheitParaKelvin.setText(">");
        buttonFahrenheitParaKelvin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFahrenheitParaKelvinMouseClicked(evt);
            }
        });

        textFieldFahrenheitFK.setText("0.00");

        textFieldKelvinFK.setText("0.00");

        jLabel3.setText("Fahrenheit");

        jLabel4.setText("Celsius");

        buttonCelsiusParaFahrenheit.setText("<");
        buttonCelsiusParaFahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCelsiusParaFahrenheitMouseClicked(evt);
            }
        });

        buttonFahrenheitParaCelsius.setText(">");
        buttonFahrenheitParaCelsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFahrenheitParaCelsiusMouseClicked(evt);
            }
        });

        textFieldFahrenheitFC.setText("0.00");

        textFieldCelsiusFC.setText("0.00");

        jLabel5.setText("Kelvin");

        jLabel6.setText("Celsius");

        buttonCelsiusParaKelvin.setText("<");
        buttonCelsiusParaKelvin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCelsiusParaKelvinMouseClicked(evt);
            }
        });

        buttonKelvinParaCelsius.setText(">");
        buttonKelvinParaCelsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKelvinParaCelsiusMouseClicked(evt);
            }
        });

        textFieldKelvinKC.setText("0.00");

        textFieldCelsiusKC.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCelsiusParaKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldKelvinKC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonKelvinParaCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(textFieldCelsiusKC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCelsiusParaFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldFahrenheitFC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonFahrenheitParaCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(textFieldCelsiusFC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(buttonKelvinParaFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldFahrenheitFK))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonFahrenheitParaKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(textFieldKelvinFK, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonKelvinParaFahrenheit)
                    .addComponent(buttonFahrenheitParaKelvin)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFahrenheitFK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldKelvinFK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buttonCelsiusParaFahrenheit)
                    .addComponent(buttonFahrenheitParaCelsius)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFahrenheitFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCelsiusFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(buttonCelsiusParaKelvin)
                    .addComponent(buttonKelvinParaCelsius)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldKelvinKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCelsiusKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKelvinParaFahrenheitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelvinParaFahrenheitMouseClicked
        kelvinParaFahrenheit();
    }//GEN-LAST:event_buttonKelvinParaFahrenheitMouseClicked

    private void buttonFahrenheitParaKelvinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFahrenheitParaKelvinMouseClicked
        fahrenheitParaKelvin();
    }//GEN-LAST:event_buttonFahrenheitParaKelvinMouseClicked

    private void buttonCelsiusParaFahrenheitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCelsiusParaFahrenheitMouseClicked
        celsiusParaFahrenheit();
    }//GEN-LAST:event_buttonCelsiusParaFahrenheitMouseClicked

    private void buttonFahrenheitParaCelsiusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFahrenheitParaCelsiusMouseClicked
        fahrenheitParaCelsius();
    }//GEN-LAST:event_buttonFahrenheitParaCelsiusMouseClicked

    private void buttonCelsiusParaKelvinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCelsiusParaKelvinMouseClicked
        celsiusParaKelvin();
    }//GEN-LAST:event_buttonCelsiusParaKelvinMouseClicked

    private void buttonKelvinParaCelsiusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelvinParaCelsiusMouseClicked
        kelvinParaCelsius();
    }//GEN-LAST:event_buttonKelvinParaCelsiusMouseClicked

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
            java.util.logging.Logger.getLogger(Conversor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCelsiusParaFahrenheit;
    private javax.swing.JButton buttonCelsiusParaKelvin;
    private javax.swing.JButton buttonFahrenheitParaCelsius;
    private javax.swing.JButton buttonFahrenheitParaKelvin;
    private javax.swing.JButton buttonKelvinParaCelsius;
    private javax.swing.JButton buttonKelvinParaFahrenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textFieldCelsiusFC;
    private javax.swing.JTextField textFieldCelsiusKC;
    private javax.swing.JTextField textFieldFahrenheitFC;
    private javax.swing.JTextField textFieldFahrenheitFK;
    private javax.swing.JTextField textFieldKelvinFK;
    private javax.swing.JTextField textFieldKelvinKC;
    // End of variables declaration//GEN-END:variables
}
