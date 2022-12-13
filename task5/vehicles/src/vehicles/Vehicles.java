/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicles;

/**
 *
 * @author mkhat
 */
public class Vehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     car c1 = new car("Tesla", "Red", 2022, "electroBOOM", "Sedan");
            c1.carDetails(); 
     bus b1 = new bus("HASHIM BUS", "MAGANTA", 1850, "EL3EEN SABTNY", "CLOSED BOX");
            b1.busDetails(); 
    }
    
}
