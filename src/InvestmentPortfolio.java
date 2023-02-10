/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    public static void main(String[] args) {
        System.out.println("For each client, please enter the last name of the client followed by the ID(5 digits), the share of AAPL, MSFT, and GOOGL: ");
        Scanner read = new Scanner(System.in);
        String name1 = read.next();
        String id1 = read.next();
        int aaplShare1 = read.nextInt();
        int msftShare1 = read.nextInt();
        int googlShare1 = read.nextInt();
        String name2 = read.next();
        String id2 = read.next();
        int aaplShare2 = read.nextInt();
        int msftShare2 = read.nextInt();
        int googlShare2 = read.nextInt();
        double ap1 = aaplShare1 * 141.52;
        double mp1 = msftShare1 * 257.22;
        double gp1 = googlShare1 * 95.00;
        double ap2 = aaplShare2 * 141.52;
        double mp2 = msftShare2 * 257.22;
        double gp2 = googlShare2 * 95.00;
        final String APCOM = "Apple Inc.";
        final String MSCOM = "Micosoft";
        final String GGCOM = "Alphabet Inc.";
        final String APSYM = "AAPL";
        final String MSSYM = "MSFT";
        final String GGSYM = "GOOGL";
        double apclose = 0.40;
        double msftclose = 25.99;
        double ggclose = 148.00;
        double apcurrent = 141.52;
        double msftcurrent = 257.22;
        double ggcurrent = 95.00;
        double apchange = ((apcurrent - apclose) / apclose) * 100;
        double msftchange = ((msftcurrent - msftclose) / msftclose) * 100;
        double ggchange = ((ggcurrent - ggclose) / ggclose) * 100;
        int serviceID;

        System.out.println("Welcome to Max Profit Stock Exchange");
        do {
            System.out.println("To show equity summary, please enters 1.");
            System.out.println("To show stock portfilo, please enters 2.");
            System.out.println("To exit the program, please enters 0");
            serviceID = read.nextInt();
            if (serviceID > 2 | serviceID < 0) {
                System.out.println("Error: Invalid entry");
            }
            //put switch here
            switch (serviceID) {
                case 0:
                    System.out.println("Message: Program ended");
                    break;
                case 1:
                    System.out.printf("%s %n", "Clients Portfolio Summary :");
                    System.out.println("-----------------------------------");
                    System.out.printf("%-11s %-11s %-11s %-11s %-11s  %n", "Name", "ID", APSYM, MSSYM, GGSYM);
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name1, id1, ap1, mp1, gp1);
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name2, id2, ap2, mp2, gp2);
                    System.out.println("------------------------------------------------------");
                    break;
                case 2:
                    System.out.printf("%s %n", "Stock status in details:");
                    System.out.println("-----------------------------------");
                    System.out.printf("%-21s %-16s %-27s %-17s %-4s %n", "Stock Name", "Stock Symbol", "Previous Closing Price", "Current Price", "Change Percent");
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", APCOM, APSYM, apclose, apcurrent, apchange);
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", MSCOM, MSSYM, msftclose, msftcurrent, msftchange);
                    System.out.printf("%-25s %-21s %-22.2f %-17.2f %-4.2f %n", GGCOM, GGSYM, ggclose, ggcurrent, ggchange);
                    System.out.println("------------------------------------------------------");
                    break;
            }

        } while (serviceID != 0);

    }
}
