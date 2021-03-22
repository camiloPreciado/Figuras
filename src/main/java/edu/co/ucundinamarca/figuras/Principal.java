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
        Triangulo triangulo = new Triangulo();
        TrianguloI trianguloi = new TrianguloI();
        
        Figura[] vector = new Figura[5];
        vector[0] = circulo;
        vector[1] = cuadrado;
        vector[2] = rectangulo;
        vector[3] = triangulo;
        vector[4] = trianguloi;
        for (Figura veh : vector) {
            Figura f;
            f = ((Figura) veh);
                if(veh instanceof Circulo){
                ((Circulo) veh).metodoCirculo();
                }else if(veh instanceof Cuadrado){
                ((Cuadrado) veh).metodoCuadrado();
                }else if(veh instanceof Rectangulo){
                ((Rectangulo) veh).metodoRectangulo();
                }else if(veh instanceof Triangulo){
                ((Triangulo) veh).metodoTriangulo();
                }else if(veh instanceof TrianguloI){
                ((TrianguloI) veh).metodoTrianguloI();
                }
            f.datos();
            f.imprimirResultados();
        }
    }
}
