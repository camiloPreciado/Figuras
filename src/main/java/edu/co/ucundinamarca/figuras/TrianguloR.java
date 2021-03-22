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
public class TrianguloR extends Figura{
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private Scanner dato = new Scanner (System.in);
    
    public TrianguloR() {
        super(0, 0);
    }

    public void metodoTrianguloR(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Rectangulo");
    }
    
    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Rectangulo es: "+getArea() + " el perimetro es: "+getPerimetro());
    }
    
    @Override
    public void calcularArea() {
        setArea((ladoA*ladoB)/2);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(ladoA+ladoB+ladoC);
    }

    @Override
    public void datos() {
        System.out.println("Ingrese tamaño del Cateto Opuesto: ");
        ladoA = dato.nextDouble();
        System.out.println("Ingrese tamaño del Cateto Adyacente: ");
        ladoB = dato.nextDouble();
        System.out.println("Ingrese tamaño de la  Hipotenusa: ");
        ladoC = dato.nextDouble();
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

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
