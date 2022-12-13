/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankprogram;
import java.util.Scanner;

/**
 *
 * @author mkhat
 */
public class Account {
    private String name;
    private String accountNumber ;
    private double balance ;
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
    

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
     public void deposite(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite done  ");
        }
     }
    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw Done ");
        } else {
            System.out.println("You don't have enough balance .only "+ balance);
        }
    }
    public void show() {
        char option;
        boolean b = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter Options ");
            System.out.println("1-For Deposite ");
            System.out.println("2-For Withdraw ");
            System.out.println("0-For Exit ");

            option = input.next().charAt(0);
            switch (option) {
                case '1':
                    System.out.println("Enter Amount ");
                    int dAmount;
                    dAmount = input.nextInt();
                    deposite(dAmount);
                    break;
                case '2':
                    System.out.println("Enter Amount You Need ");
                    int wAmount;
                    wAmount = input.nextInt();
                    withdraw(wAmount);
                    break;
                case '0':
                    b = false;
                    break;
                default:
                    System.out.println("XX invalid option XX");

                    break;
            }
        } while (b);

    }

    public Account(String name, String id) 
    {
        name = this.name;
        id = this.accountNumber;
    }
}    
    
