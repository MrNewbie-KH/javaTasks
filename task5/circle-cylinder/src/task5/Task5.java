/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5;
import java.util.Scanner;

/**
 *
 * @author mkhat
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("please enter the radius of the circle and height of cylinder : ");
     
        double radius=input.nextDouble();
        double height=input.nextDouble();
        Cylinder cy1=new Cylinder(radius,height);
        System.out.println(cy1.area());
        System.out.println(cy1.volume());

    }
    
}
