/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase que se definen las propiedades y los métodos que tendra
 *el cuadrado
 * @author Antonio Muñoz Reinoso
 * @version 1.0
 * @since 30-11-2021
 */
public class Cuadrado implements FiguraGeometrica
{
    /*Atributo tipo numérico que contiene el lado del cuadrado*/
    private double lado;
    /*Atributo tipo numérico que contiene el area del cuadrado*/
    private double areaCuadrado;

    /**
     * Constructor de la clase Cuadrado
     * @param lado valor del lado asociado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo lado
     * @return lado del cuadrado
     */
    public double getLado() 
    {
        return lado;
    }
    /**
     * Método modificador del atributo lado
     * @param lado valor del lado asociado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo areaCuadrado
     * @return area del cuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    /**
     * Método modificador del atributo areaCuadrado
     */
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}