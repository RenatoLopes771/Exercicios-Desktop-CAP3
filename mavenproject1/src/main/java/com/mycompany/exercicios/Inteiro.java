/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author ambienterust
 */
public class Inteiro {

    private int valor;

    public void carregaValor(int v) {
        this.valor = v;
    }

    public int devolveValor() {
        return this.valor;
    }

    public int devolveValorAbsoluto() {
        return Math.abs(this.valor);
    }

    public void imprime() {
        System.out.println(this.valor);
    }

    public int soma(int v) {
        this.valor += v;
        return this.valor;
    }

    public int subtrai(int v) {
        this.valor -= v;
        return this.valor;
    }

    public int multiplicaPor(int v) {
        this.valor *= v;
        return this.valor;
    }

    public int dividePor(int v) {
        if (v == 0) {
            System.out.println("Erro! Valor a dividir tem de ser diferente de 0");
            return this.valor;
        }

        this.valor /= v;
        return this.valor;
    }
}
