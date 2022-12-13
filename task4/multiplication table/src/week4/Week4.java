/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;
import java.util.Scanner ;
/**
 * 
 *
 * @author mkhat
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter a number");
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        
//        Task 1
System.out.println("The Multiplication table of "+n+" : ");
multiplicationTable(n);

    }
    public static void multiplicationTable (int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print(j*i+" ");
            }
            System.out.println(" ");
        }
    }
    
}
