/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ambienterust
 */
public class TesteConversor {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Conversor5 conversor = new Conversor5();
        
        System.out.println("5 celsius em fahrenheit " + conversor.celsiusFahrenheit(5));
    
        System.out.println("5 fahrenheit em celsius " + conversor.fahrenheitCelsius(5));
        
        System.out.println("5 kelvin em celsius " + conversor.kelvinCelsius(5));
    
        System.out.println("5 celsius em kelvin " + conversor.celsiusKelvin(5));
        
        
        System.out.println("5 kelvin em fahrenheit " + conversor.kelvinFahrenheit(5));
        
        System.out.println("5 fahrenheit em kelvin " + conversor.fahrenheitKelvin(5));
    }
}
