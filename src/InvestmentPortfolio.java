/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //here variables for user 1 
        
        String name2=read.next();
        String id2=read.next();
        int aaplShare2=read.nextInt();
        int mfstShare2=read.nextInt();
        int googlShare2=read.nextInt();
        int serviceID;
        
        System.out.println("Welcome to Max Profit Stock Exchange");
        do {
         System.out.println("To show equity summary, please enters 1.");
         System.out.println("To show stock portfilo, please enters 2.");
         System.out.println("To exit the program, please enters 0");
         serviceID=read.nextInt();
             //put switch here
         
         
         
        } while(serviceID!=0 & (serviceID>2 | serviceID<0) );
    }
}
