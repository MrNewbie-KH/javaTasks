/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author mkhat
 */
public class car extends vehicle 
{
    private String bodyStyle;
    public car(String make, String color, int year, String model, String bodyStyle)
    {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }
    public void carDetails() 
    {
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }
}