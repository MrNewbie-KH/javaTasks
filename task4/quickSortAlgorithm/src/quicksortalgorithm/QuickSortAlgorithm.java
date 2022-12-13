/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksortalgorithm;
import java.util.Scanner;


/**
 *
 * @author mkhat
 */
public class QuickSortAlgorithm {    
public static void quickSort(int start,int end,int arr[])
{
    //    base case
if(start>=end)
    return;
//transition
int i=start;
int j=end;
int pivot=i ;
    while(i<j) {
        if (pivot == i) {
            if (arr[pivot] > arr[j]) {
//                swapping
                int temp=arr[j];
                arr[j]=arr[pivot];
                arr[pivot]=temp ;
                pivot = j;
                ++i;
            } else
                j--;
        }
        else if(pivot==j)
        {
            if (arr[pivot] < arr[i])
            {
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp ;
                pivot = i;
                --j;
            }
            else
                i++;
        }
    }

    quickSort(start,pivot-1,arr);
    quickSort(pivot+1,end,arr);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
           int n=input.nextInt();
           int arr[];
           arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=input.nextInt();
    }
    quickSort(0,n-1,arr);
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
}
}
