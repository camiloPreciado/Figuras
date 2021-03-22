/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.figuras;

import java.util.Scanner;

/**
 *
 * @author Camilo Preciado
 * @since 1.0
 * @version 1.0.0
 */
public class Circulo extends Figura{
    
    /**
     * Almacena el valor del radio
     */
    private double radio;
    
    /**
     * Variable con un valor fijo
     */
    final float pi = 3.1416f;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);

    /**
     *Constructor de la clase
     */
    public Circulo(){
        super(0, 0);
    }
    
    /**
     * Indica el metodo
     */
    public void metodoCirculo(){
        System.out.println("Metodo Circulo");
    }

    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del circulo es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    /**
     * Calcula el area del circulo
     */
    @Override
    public void calcularArea() {
        setArea(pi * radio);
    }

    /**
     * Calcula el perimetro del circulo
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(2*pi*radio);
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese radio: ");
        radio = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables radio y dato
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }

    
    
    
}
