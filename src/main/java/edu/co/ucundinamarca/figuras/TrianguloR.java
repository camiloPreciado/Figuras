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
public class TrianguloR extends Figura{
    
    /**
     * Almacena el tamaño del cateto opuesto
     */
    private double catetoO;
    
    /**
     * Almacena el tamaño del cateto adyacente
     */
    private double catetoA;
    
    /**
     * Almacena el tamaño de la hipotenusa
     */
    private double hipotenusa;
    
    /**
     * Obtiene los datos por consola
     */
    private Scanner dato = new Scanner (System.in);
    
    /**
     *Constructor de la clase
     */
    public TrianguloR() {
        super(0, 0);
    }

    /**
     * Indica el metodo
     */
    public void metodoTrianguloR(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Rectangulo");
    }
    
    /**
     * Imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Rectangulo es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    /**
     * Calcula el area del triangulo rectangulo
     */
    @Override
    public void calcularArea() {
        setArea((catetoO*catetoA)/2);
    }

    /**
     * Calcula el perimetro del triangulo rectangulo
     */
    @Override
    public void calcularPerimetro() {
        setPerimetro(catetoO+catetoA+hipotenusa);
    }

    /**
     * Solicita los datos por consola
     */
    @Override
    public void datos() {
        System.out.println("Ingrese tamaño del Cateto Opuesto: ");
        catetoO = dato.nextDouble();
        System.out.println("Ingrese tamaño del Cateto Adyacente: ");
        catetoA = dato.nextDouble();
        System.out.println("Ingrese tamaño de la  Hipotenusa: ");
        hipotenusa = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Metodos set y get de las variables ladoA, ladoB, ladoC y dato
     */
    public double getCatetoO() {
        return catetoO;
    }

    public void setCatetoO(double catetoO) {
        this.catetoO = catetoO;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
}
