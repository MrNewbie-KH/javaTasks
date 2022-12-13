/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;
import java.util.Scanner;

/**
 *
 * @author mkhat
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        task 1
Scanner input =new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
int number =input.nextInt();
     double arr[];
     arr=new double[number];
        System.out.println("Please enter the array elements ");
     for(int i=0;i<number;i++)
     {
         arr[i]=input.nextDouble();
     }
     double maxi=arr[0];
     for(double num:arr)
     {
         if(num>maxi)
         maxi=num ;
     }
        System.out.println("The Maximum Number in the array : "+maxi);
//        task 2 transpose of an array
int a,b,c,d ;
        System.out.println("Please enter dimantions of MATRIX 1 :");
        a=input.nextInt();
        b=input.nextInt();
        int matrix[][]; 
        matrix=new int[a][b];
       int transposed[][]=new int[a][b];
        System.out.println("Please enter MATRIX 1 elements :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transposed[i][j]=matrix[j][i];
            }
        }
                System.out.println("Transposed Matrix is :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println("");
        }
     

    }
    
}
