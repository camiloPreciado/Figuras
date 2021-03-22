/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ucundinamarca.figuras;

/**
 *
 * @author Camilo Preciado
 * @since 1.0
 * @version 1.3.2
 */
public abstract class Figura implements IFigura{
    /**
     * Almacena el valor del area Calculado
     */
    private double area;
    
    /**
     * Almacena el valor del perimetro Calculado
     */
    private double perimetro;
    
    /**
     * Costructor de la clase Figura con parametros
     */
    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    /**
     * Metodo Abstracto que calcula el area de la figura
     */
    public abstract void calcularArea();
    
    /**
     * Metodo Abstracto que calcula el perimetro de la figura
     */
    public abstract void calcularPerimetro();
    
    /**
     * Metodo Abstracto que imprime los datos calculados
     */
    public abstract void imprimirResultados();
    
    /**
     * Metodos set y get de las variables area y perimetro
     */
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
