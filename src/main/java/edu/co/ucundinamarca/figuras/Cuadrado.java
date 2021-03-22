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
public class Cuadrado extends Figura{
    
    /**
     * Almacena el tamaño de los lados
     */
    private double lado;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);
    
    /**
     *Constructor de la clase
     */
    public Cuadrado() {
        super(0, 0);
    }
    
    /**
     * Indica el metodo
     */
    public void metodoCuadrado(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Cuadrado");
    }

    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del cuadrado es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    /**
     * Calcula el area del cuadrado
     */
    @Override
    public void calcularArea() {
        setArea(Math.pow(lado, (2)));
    }

    /**
     * Calcula el perimetro del cuadrado
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(4*lado);
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de un lado: ");
        lado = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables lado y dato
     */
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
