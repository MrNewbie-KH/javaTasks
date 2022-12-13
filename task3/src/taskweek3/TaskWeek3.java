 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskweek3;
import java.util.Scanner ;

/**
 *
 * @author mkhat
 */
public class TaskWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        ======  TASK 1=====================
System.out.println("Please, enter a string : ");
       String s = input.nextLine();
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i) ;
           if(ch!=',')
               System.out.print(ch);
       }
       System.out.println("");

//      =========TASK 2========================
Student s1=new Student();
Student s2=new Student();
s1.newStudent("Mohamed");
s2.newStudent("Khattab");
s1.getStudentInfo();
s2.getStudentInfo();

//===============TASK 3 ========================
circle c1 =new circle();
        System.out.println("Enter the radius of the circle");
        double r=input.nextDouble();
        c1.setRadius(r);
        c1.printArea();
        c1.printCircumference();
triangle t1=new triangle();
        System.out.println("Enter the sides of the triangle");
        t1.setsides(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Enter the height of the triangle");
        t1.setHeight(input.nextDouble());
        System.out.println("Enter the base of the triangle");
        t1.setBase(input.nextDouble());
        t1.printArea();
        t1.printCircumference();
}  

}
