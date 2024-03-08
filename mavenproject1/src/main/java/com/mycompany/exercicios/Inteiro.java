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
}
