/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    static Scanner read = new Scanner(System.in);

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
       
     /*   //Closing prices and current price for each company
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
        double googleChange = ((googleCurrent - googleClose) / googleClose) * 100;*/

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
                   // displayEquitySummary();
                    break;
                case 2:
                    /*
                    for(int i=0;i<3;i++){
                    displayStockStatus(stockSymbolsList[i],stockNameList[i],previousClosingPrice[i],currentPrice[i]);
                            };*/
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
     private static void displayEquitySummary(String[] symbol , double[] closing){
     
    /* System.out.printf("%s %n", "Clients Portfolio Summary :");
     System.out.println("-----------------------------------");
     System.out.printf("%-11s %-11s %-11s %-11s %-11s  %n", "Name", "ID", APSYM, MSSYM, GGSYM);
     System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name1, id1, appleEquity1, msftEquity1, googleEquity1);
     System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name2, id2, appleEquity2, msftEquity2, googleEquity2);
     System.out.println("------------------------------------------------------");
     System.out.println();    */
     }    
    public static void getClientsInfo() {

        String[] clientNames = new String[5];
        String[] clientIDs = new String[5];
        int[] aaplShare = new int[5];
        int[] msftShare = new int[5];
        int[] googlShare = new int[5];

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
