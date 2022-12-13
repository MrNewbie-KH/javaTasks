/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5;

/**
 *
 * @author mkhat
 */
public class Cylinder extends Circle {
    protected double height ;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder(double r,double h)
    {
        super(r);
        height=h ;
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
    
    
}
