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
    String area;
    String perimetro;

    public Figura(String area, String perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public abstract void imprimirInformacion();
    public abstract void calcularArea();
    public abstract void calcularPerimetro();

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }
    
}
