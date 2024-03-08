/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author ambienterust
 */
public class Aluno {

    private double p1;
    private double p2;
    private double p3;
    private double p4;

    private double media;

    private String veredito;

    public Aluno(double p1, double p2, double p3, double p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

        calculo();
    }

    private void calculo() {
        media = (p1 + p2 + p3 + p4) / 4;

        if (media > 6) {
            veredito = "aprovado";
        } else if (media > 4) {
            veredito = "recuperação";
        } else {
            veredito = "reprovado";
        }
    }

    public void veredito() {
        System.out.println("Média: " + media + " -> " + veredito + ".");
    }
}
