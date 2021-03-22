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
 */
public class Circulo extends Figura{
    private double radio;
    final float pi = 3.1416f;
    private Scanner dato = new Scanner (System.in);

    /**
     *
     */
    
    public Circulo(){
        super(0, 0);
    }
    
    public void metodoCirculo(){
        System.out.println("Metodo Circulo");
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area del circulo es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    @Override
    public void calcularArea() {
        setArea(pi * radio);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2*pi*radio);
    }

    @Override
    public void datos() {
        System.out.println("Ingrese radio: ");
        radio = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

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
