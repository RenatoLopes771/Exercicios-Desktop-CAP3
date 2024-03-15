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
                "este",
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKelvinParaFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldFahrenheitFK))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFahrenheitParaKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(textFieldKelvinFK, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
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
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKelvinParaFahrenheitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelvinParaFahrenheitMouseClicked
        kelvinParaFahrenheit();
    }//GEN-LAST:event_buttonKelvinParaFahrenheitMouseClicked

    private void buttonFahrenheitParaKelvinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFahrenheitParaKelvinMouseClicked
        fahrenheitParaKelvin();
    }//GEN-LAST:event_buttonFahrenheitParaKelvinMouseClicked

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
    private javax.swing.JButton buttonFahrenheitParaKelvin;
    private javax.swing.JButton buttonKelvinParaFahrenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textFieldFahrenheitFK;
    private javax.swing.JTextField textFieldKelvinFK;
    // End of variables declaration//GEN-END:variables
}
