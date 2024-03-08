/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author ambienterust
 */
public class Aluno2 {

    private double nota1 = 0;
    private double nota2 = 0;
    private double nota3 = 0;
    private double nota4 = 0;

    public void recebeNota1(double nota) {
        this.nota1 = nota;
    }

    public void recebeNota2(double nota) {
        this.nota2 = nota;
    }

    public void recebeNota3(double nota) {
        this.nota3 = nota;
    }

    public void recebeNota4(double nota) {
        this.nota4 = nota;
    }

    public void imprimeMedia() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String veredito;

        if (media > 6) {
            veredito = "aprovado";
        } else if (media > 4) {
            veredito = "recuperação";
        } else {
            veredito = "reprovado";
        }

        System.out.println("Média: " + media + " -> " + veredito + ".");
    }
}
