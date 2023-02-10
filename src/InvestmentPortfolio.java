/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    public static void main(String[] args) {

        System.out.println("For each client, please enter the last name of the client followed by the ID(5 digits), the share of AAPL, MSFT, and GOOGL: ");
        Scanner read = new Scanner(System.in);

        //The program's constants
        
        final String APCOM = "Apple Inc.";
        final String MSCOM = "Micosoft";
        final String GGCOM = "Alphabet Inc.";
        final String APSYM = "AAPL";
        final String MSSYM = "MSFT";
        final String GGSYM = "GOOGL";

        //Client 1 variables
        
        String name1 = read.next();
        String id1 = read.next();
        int aaplShare1 = read.nextInt();
        int msftShare1 = read.nextInt();
        int googlShare1 = read.nextInt();
        
        //Client 2 variables
        
        String name2 = read.next();
        String id2 = read.next();
        int aaplShare2 = read.nextInt();
        int msftShare2 = read.nextInt();
        int googlShare2 = read.nextInt();
    
        //Closing prices and current price for each company
        
        double appleClose = 0.40;
        double msftClose = 25.99;
        double googleClose = 148.00;
        double appleCurrent = 141.52;
        double msftCurrent = 257.22;
        double googleCurrent = 95.00;

        //Computing the share equity for the two users
        
        double appleEquity1 = aaplShare1 * appleCurrent;
        double msftEquity1 = msftShare1 * msftCurrent;
        double googleEquity1 = googlShare1 * googleCurrent;
        double appleEquity2 = aaplShare2 * appleCurrent;
        double msftEquity2 = msftShare2 * msftCurrent;
        double googleEquity2 = googlShare2 * googleCurrent;

        //Computing the percentage of change from the previous closing prices to current prices 
        
        double appleChange = ((appleCurrent - appleClose) / appleClose) * 100;
        double msftChange = ((msftCurrent - msftClose) / msftClose) * 100;
        double googleChange = ((googleCurrent - googleClose) / googleClose) * 100;

        int serviceID;

        System.out.println("Welcome to Max Profit Stock Exchange");

        do {
            //Showing the menu using do-while loop 
            
            System.out.println("To show equity summary, please enter 1.");
            System.out.println("To show stock portfilo, please enter 2.");
            System.out.println("To exit the program, please enter 0");
            serviceID = read.nextInt();
            
            if (serviceID > 2 | serviceID < 0) {
                System.out.println("Error: Invalid entry");
            }

            switch (serviceID) {
                case 0:
                    System.out.println("Message: Program ended");
                    break;
                case 1:
                    System.out.printf("%s %n", "Clients Portfolio Summary :");
                    System.out.println("-----------------------------------");
                    System.out.printf("%-11s %-11s %-11s %-11s %-11s  %n", "Name", "ID", APSYM, MSSYM, GGSYM);
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name1, id1, appleEquity1, msftEquity1, googleEquity1);
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name2, id2, appleEquity2, msftEquity2, googleEquity2);
                    System.out.println("------------------------------------------------------");
                    break;
                case 2:
                    System.out.printf("%s %n", "Stock status in details:");
                    System.out.println("-----------------------------------");
                    System.out.printf("%-21s %-16s %-27s %-17s %-4s %n", "Stock Name", "Stock Symbol", "Previous Closing Price", "Current Price", "Change Percent");
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", APCOM, APSYM, appleClose, appleCurrent, appleChange);
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", MSCOM, MSSYM, msftClose, msftCurrent, msftChange);
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", GGCOM, GGSYM, googleClose, googleCurrent, googleChange);
                    System.out.println("------------------------------------------------------");
                    break;
            }

        } while (serviceID != 0); //The program will end and stop showing the menu if the client chooses 0

    }
}
