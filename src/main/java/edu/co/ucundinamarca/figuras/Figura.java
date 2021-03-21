/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.figuras;

/**
 *
 * @author Camilo Preciado
 */
public abstract class Figura {
    double area;
    double perimetro;

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public abstract void datos();
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public abstract void imprimirResultados();
    
}
