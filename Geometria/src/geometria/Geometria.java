/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase que se definen las propiedades y los métodos que tendra
 *la clase geometría
 * @author Antonio Muñoz Reinoso
 * @version 1.0
 * @since 30-11-2021
 */
public class Geometria {

    /**
     * Metodo principal
     * @param args línea de argumento de comando
     */
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas        
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
