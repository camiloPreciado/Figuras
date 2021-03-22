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
    public void calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirResultados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
