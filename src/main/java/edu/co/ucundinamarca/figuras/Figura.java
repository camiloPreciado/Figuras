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
public abstract class Figura implements IFigura{
    private double area;
    private double perimetro;

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public abstract void imprimirResultados();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
