/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskweek3;

/**
 *
 * @author mkhat
 */
public class triangle {
    private double side1 ;
        private double side2 ;
    private double side3 ;

    private double base ;
    private double height ;
    public void setHeight(double h)
    {
        height =h ;
    }
    public void setsides(double s1,double s2,double s3)
    {
       side1=s1;side2=s2;side3=s3 ;
    }
    public void setBase(double b)
    {
        base= b ;
    }
    public void printArea()
    {
        System.out.println("The area = "+ 0.5*base*height) ;
    }
    public void printCircumference()
    {
        System.out.println("The circumference = "+ side1+side2+side3) ;
    }
    
}
