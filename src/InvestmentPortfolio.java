/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    static Scanner read = new Scanner(System.in);
    static String[] clientNames = new String[5];
    static String[] clientIDs = new String[5];
    static int[] aaplShare = new int[5];
    static int[] msftShare = new int[5];
    static int[] googlShare = new int[5];

    public static void main(String[] args) {

        System.out.println("For each client, please enter the last name of the client followed by the ID(5 digits), the share of AAPL, MSFT, and GOOGL: ");

        String[] stockSymbolsList =
        { "APPL", "MSFT", "GOOGL" };
        
        String[] stockNameList =
        { "Apple Inc.", "Microsoft", "Alphabet Inc." };
        
        double[] previousClosingPrice =
        { 0.40, 25.99, 148.0 };
        
        double[] currentPrice =
        { 141.52, 257.22, 95.0 };
       
        getClientsInfo();
        
        
        int serviceID;

        System.out.println("Welcome to Max Profit Stock Exchange");

        do
        {
            //Showing the menu using do-while loop 

            System.out.println("To show equity summary, please enter 1.");
            System.out.println("To show stock portfilo, please enter 2.");
            System.out.println("To exit the program, please enter 0");

            serviceID = read.nextInt();

            if (serviceID > 2 | serviceID < 0)
            {
                System.out.println("Error: Invalid entry");
            }

            switch (serviceID)
            {
                case 0:
                    System.out.println("Message: Program ended");
                    break;
                case 1:

                    displayEquitySummary(stockSymbolsList , currentPrice);
                    break;
                case 2:
                    displayStockStatus(stockSymbolsList,stockNameList,previousClosingPrice,currentPrice);
                    break;
            }

        } while (serviceID != 0); //The program will end and stop showing the menu only if the client chooses 0

    }
    // displayStockStatus() method here
    private static void displayStockStatus(String[] symbol ,String[] name ,double[] closing, double[] current ){
    
    System.out.printf("%s %n", "Stock status in details:");
    System.out.println("-----------------------------------");
    System.out.printf("%-21s %-16s %-27s %-17s %-4s %n", "Stock Name", "Stock Symbol", "Previous Closing Price", "Current Price", "Change Percent");
    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", symbol[0], name[0], (float)closing[0], (float)current[0], (float)getChangePercent((float)current[0],(float)closing[0]));
    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", symbol[1], name[1], (float)closing[1], (float)current[1], (float)getChangePercent((float)current[1],(float)closing[1]));
    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", symbol[2], name[2], (float)closing[2], (float)current[2], (float)getChangePercent((float)current[2],(float)closing[2]));
    System.out.println("------------------------------------------------------");
    System.out.println();
    
    }
    // displayEquitySummary() method here
     private static void displayEquitySummary(String[] symbol , double[] current){

     System.out.printf("%s %n", "Clients Portfolio Summary :");
     System.out.println("-----------------------------------");
     System.out.printf("%-11s %-11s %-11s %-11s %-11s  %n", "Name", "ID", symbol[0], symbol[1], symbol[2]);
     
     for (int i = 0; i < clientNames.length; i++){
            System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", 
                    clientNames[i], clientIDs[i], aaplShare[i]*current[0], msftShare[i]*current[1], googlShare[i]*current[2]);
     }
     System.out.println();    
     }    
    public static void getClientsInfo() {

        for (int i = 0; i < 5; i++)
        {
            clientNames[i] = read.next();
            clientIDs[i] = read.next();
            aaplShare[i] = read.nextInt();
            msftShare[i] = read.nextInt();
            googlShare[i] = read.nextInt();
        }   

    }
    public static double getChangePercent(double x,double y) {
        double changePercent = (((x - y)/y)*100);
        return changePercent;
    }
}
