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
public class TrianguloI extends Figura{
    private double ladoA;
    private double ladoB;
    private Scanner dato = new Scanner (System.in);
    
    public TrianguloI() {
        super(0, 0);
    }

    public void metodoTrianguloI(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Isosceles");
    }
    
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Isosceles es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    @Override
    public void calcularArea() {
        setArea((ladoB* Math.sqrt(Math.pow(ladoA, (2)) - ((Math.pow( ladoB, (2))/4))))/2);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2*ladoA+ladoB);
    }

    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de los lados: ");
        ladoA = dato.nextDouble();
        System.out.println("Ingrese tamaño de la  base: ");
        ladoB = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

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
