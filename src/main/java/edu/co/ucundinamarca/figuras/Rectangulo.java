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
 * @version 1.3.2
 */
public class Rectangulo extends Figura{
    /**
     * Almacena el valor del ladoA
     */
    private double ladoA;
    
    /**
     * Almacena el valor del ladoB
     */
    private double ladoB;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);

    
    /**
     *Constructor de la clase
     */
    public Rectangulo() {
        super(0, 0);
    }

    /**
     * Indica el metodo
     */
    public void metodoRectangulo(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Rectangulo");
    }

    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Rectangulo es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    /**
     * Calcula el area del rectangulo
     */
    @Override
    public void calcularArea() {
        setArea(ladoA*ladoB);
    }

    /**
     * Calcula el perimetro del rectangulo
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(2*ladoA + 2*ladoB);
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese tamaño del ladoA: ");
        ladoA = dato.nextDouble();
        
        System.out.println("Ingrese tamaño del  ladoB: ");
        ladoB = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables ladoA, ladoB y dato
     */
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
