/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;
import java.util.Scanner;

/**
 *
 * @author mkhat
 */
public class Task1 {
    public static int fact(int n)
    {
//        base case
        if(n<=1)
            return 1;
//        transition
return n*fact(n-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//   TASK 1
        System.out.println("Please enter first number : ");
        int n=input.nextInt();
                System.out.println("Please enter second number : ");
        int r=input.nextInt();
        System.out.println("The answer for nPr = ");
        System.out.println(fact(n)/fact(n-r));
        System.out.println("The answer for nPr = ");
        System.out.println(fact(n)/(fact(n-r)*fact(r)));
        
//        Task2
System.out.println("Please enter the ascoii of a character : ");
int x=input.nextInt();
        System.out.println("The character is "+(char)x);

    }
    
}
