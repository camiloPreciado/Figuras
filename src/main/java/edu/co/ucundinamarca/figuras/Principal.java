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
public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        
        Figura[] vector = new Figura[3];
        vector[0] = circulo;
        vector[1] = cuadrado;
        vector[2] = rectangulo;
        for (Figura veh : vector) {
        Figura f;
        f = ((Figura) veh);
        
        if(veh instanceof Circulo){
        ((Circulo) veh).metodoCirculo();
        }else if(veh instanceof Cuadrado){
        ((Cuadrado) veh).metodoCuadrado();
        }else if(veh instanceof Rectangulo){
        ((Rectangulo) veh).metodoRectangulo();
        }

        f.datos();
        f.imprimirResultados();
        }
    }
}
