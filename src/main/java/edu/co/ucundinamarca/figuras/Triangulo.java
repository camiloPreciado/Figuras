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
public class Triangulo extends Figura{
    private double lado;
    private double altura;
    private Scanner dato = new Scanner (System.in);
    
    public Triangulo() {
        super(0, 0);
    }
    
    public void metodoTriangulo(){
        System.out.println("---------------------------------------");
        System.out.println("Metodo Triangulo Equilatero");
    }
    

    @Override
    public void imprimirResultados() {
        System.out.println("El area del Triangulo Equilatero es: "+getArea() + " el perimetro es: "+getPerimetro());
    }

    @Override
    public void calcularArea() {
        setArea(((Math.sqrt(3))/4) * Math.pow(lado, (2)));
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(3*lado);
        
    }

    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de los 3 lados: ");
        lado = dato.nextDouble();
        calcularArea();
        calcularPerimetro();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
