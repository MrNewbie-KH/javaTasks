/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskweek3;

/**
 *
 * @author mkhat
 */
   public class circle {
   private double radius ;
   private final double PI = 3.14 ;
    public void setRadius(double r)
    {
        radius = r ;
    }
    public void printArea()
    {
        System.out.println("The are = "+ PI*radius*radius) ;
    }
    public void printCircumference()
    {
        System.out.println("The circumference = "+ 2*PI*radius) ;
    }
    
    
}
