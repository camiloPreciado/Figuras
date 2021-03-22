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
public class TrianguloI extends Figura{
    
    /**
     * Almacena el tamaño de los lados
     */
    private double lados;
    
    /**
     * Almacena el tamaño de la base
     */
    private double base;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);
    
    /**
     *Constructor de la clase
     */
    public TrianguloI() {
        super(0, 0);
    }

    /**
     * Indica el metodo
     */
    public void metodoTrianguloI(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Isosceles");
    }
    
    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Isosceles es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    /**
     * Calcula el area del triangulo isosceles
     */
    @Override
    public void calcularArea() {
        setArea((base* Math.sqrt(Math.pow(lados, (2)) - ((Math.pow( base, (2))/4))))/2);
    }

    /**
     * Calcula el perimetro del triangulo isosceles
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(2*lados+base);
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de los lados: ");
        lados = dato.nextDouble();
        System.out.println("Ingrese tamaño de la  base: ");
        base = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables ladoA, ladoB y dato
     */
    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
