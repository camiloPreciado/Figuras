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
public class Cuadrado extends Figura{

    private double lado;
    private Scanner dato = new Scanner (System.in);
    
    public Cuadrado() {
        super(0, 0);
    }

    public void metodoCuadrado(){
        System.out.println("Metodo Cuadrado");
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El area del cuadrado es: "+area + " el perimetro es: "+perimetro);
    }
    
    @Override
    public void calcularArea() {
        area = Math.pow(lado, (2));
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 4*lado;
    }

    @Override
    public void datos() {
        System.out.println("Ingrese tamaño de un lado: ");
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

    public Scanner getDato() {
        return dato;
    }

    public void setDato(Scanner dato) {
        this.dato = dato;
    }
    
}
