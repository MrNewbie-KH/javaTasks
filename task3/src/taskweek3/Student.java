/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskweek3;


/**
 *
 * @author mkhat
 */
public class Student {
    String name ;
    int rollNo ;
    static int counter =0 ;
    public void newStudent (String n)
    {
        name=n ;
        rollNo =setNewId();
    }
    public int setNewId()
    {
        counter++ ;
        return counter ;
    }
    void getStudentInfo()
    {
        System.out.println("name "+ name);
        System.out.println("ID "  +rollNo);
    }
    
    
}
