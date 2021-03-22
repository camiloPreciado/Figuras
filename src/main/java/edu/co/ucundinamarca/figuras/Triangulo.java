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
public class Triangulo extends Figura{
    
    /**
     * Almacena el tamaño de los lados
     */
    private double lados;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);
    
    /**
     *Constructor de la clase
     */
    public Triangulo() {
        super(0, 0);
    }
    
    /**
     * Indica el metodo
     */
    public void metodoTriangulo(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Equilatero");
    }
    
    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Equilatero es: "+getArea() + " el perimetro es: "+getPerimetro());
    }

    /**
     * Calcula el area del triangulo equilatero
     */
    @Override
    public void calcularArea() {
        setArea(((Math.sqrt(3))/4) * Math.pow(lados, (2)));
    }

    /**
     * Calcula el perimetro del triangulo equilatero
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(3*lados);      
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de los 3 lados: ");
        lados = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables lados y dato
     */
    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
