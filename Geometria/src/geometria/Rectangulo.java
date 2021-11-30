/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase que se definen las propiedades y los métodos que tendra
 *el rectángulo
 * @author Antonio Muñoz Reinoso
 * @version 1.0
 * @since 30-11-2021
 */
public class Rectangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double areaRectangulo;

    public Rectangulo(double base, double altura) 
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

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    @Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }
}