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
 * @version 1.0.0
 */
public class Principal {
    
    /**
     * Costructor encargado de ejecutar el metodo iniciar
     */
    public Principal(){
        iniciar();
    }
    
    /**
     * Crea los objetos de las clases y los guarda en un vector
     */
    public void iniciar() {
        Figura circulo = new Circulo();
        Figura cuadrado = new Cuadrado();
        Figura rectangulo = new Rectangulo();
        Figura triangulo = new Triangulo();
        Figura trianguloi = new TrianguloI();
        Figura triangulor = new TrianguloR();
        
        Figura[] vector = new Figura[6];
        vector[0] = circulo;
        vector[1] = cuadrado;
        vector[2] = rectangulo;
        vector[3] = triangulo;
        vector[4] = trianguloi;
        vector[5] = triangulor;
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
                }else if(veh instanceof TrianguloR){
                ((TrianguloR) veh).metodoTrianguloR();
                }
            f.datos();
            f.imprimirResultados();
        }
    }
    
    /**
     * Crea un objeto de la clase Principal
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
