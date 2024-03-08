/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author ambienterust
 */
public class Ola {

    private int valor;
    private final int CUMPRIMENTOS = 3;

    public void cumprimenta() {
        valor = (int) (Math.random() * CUMPRIMENTOS) + 1;

        switch (valor) {
            case 1:
                System.out.println("Yarrr! Olá!!!");
                break;

            case 2:
                System.out.println("Hmmm si si olá");
                break;

            case 3:
                System.out.println("Hello sir");
                break;
        }
    }
}
