/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{
    /*Atributo tipo numérico que guarda parte decimal y entera en memoria que
    contiene el valor de la base
    */
    private double base;
    /*Atributo tipo numérico que guarda parte decimal y entera en memoria que
    contiene el valor de la altura
    */
    private double altura;
    /*Atributo tipo numérico que guarda parte decimal y entera en memoria que
    contiene el valor del area del triangulo
    */
    private double areaTriangulo;
    
    
    /**
     * Método Constructor de la clase Triángulo
     * @param base valor de la base
     * @param altura valor de la altura
     */
    
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    
    /**
     * @param  
     */
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}