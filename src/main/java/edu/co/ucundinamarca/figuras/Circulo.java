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
public class Circulo extends Figura{
    double radio;

    public Circulo(String area, String perimetro) {
        super(area, perimetro);
    }
    
    public void imprimirInformacion(){
        System.out.println("El area del circulo es es: "+area + "el perimetro es:"+perimetro);
    }

    @Override
    public void calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
