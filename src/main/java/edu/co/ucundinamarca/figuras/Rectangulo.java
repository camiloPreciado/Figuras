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
public class Rectangulo extends Figura{
    
    private double ladoA;
    private double ladoB;
    private Scanner dato = new Scanner (System.in);

    public Rectangulo() {
        super(0, 0);
    }

    public void metodoRectangulo(){
        System.out.println("Metodo Rectangulo");
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area del Rectangulo es: "+area + " el perimetro es: "+perimetro);
    }

    @Override
    public void calcularArea() {
        area = ladoA*ladoB;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2*ladoA + 2*ladoB;
    }

    @Override
    public void datos() {
        System.out.println("Ingrese tamaño del ladoA: ");
               ladoA = dato.nextDouble();
        
        System.out.println("Ingrese tamaño del  ladoB: ");
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
