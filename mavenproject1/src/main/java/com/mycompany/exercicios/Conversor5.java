/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author ambienterust
 */
public class Conversor5 {

    public double fahrenheitKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public double kelvinFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public double celsiusKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double celsiusFahrenheit(double celsius) {
        double kelvin = celsiusKelvin(celsius);
        return (kelvinFahrenheit(kelvin));
    }

    public double fahrenheitCelsius(double fahrenheit) {
        double kelvin = fahrenheitKelvin(fahrenheit);
        return (kelvinCelsius(kelvin));
    }
}
