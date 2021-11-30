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
public class Circulo implements FiguraGeometrica 
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

  
    public Circulo(double radio) 
    {
        this.radio = radio;
    }
    
    /**
     * Método consultor del atributo radio
     * @return valor del radio
     */

    public double getRadio() 
    {
        return radio;
    }

    /**
     * Método modificador del atributo radio
     * @param radio valor del radio asociado
     */
    
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    /**
     * Método consultor del area del radio
     * @return valor del area del r/**
    * 
    */
    public double getAreaRadio() 
    {
        return areaRadio;
    }

    @Override
    
    /** 
     * Método modificador del atributo area del radio
     */
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }   
    

}
