/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class InvestmentPortfolio {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("For each client, please enter the last name of the client followed by the ID(5 digits), the share of AAPL, MSFT, and GOOGL: ");
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
        double mp1 = msftShare1 * 275.22;
        double gp1 = googlShare1 * 95.00;
        double ap2 = aaplShare2 * 141.52;
        double mp2 = msftShare2 * 275.22;
        double gp2 = googlShare2 * 95.00;
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
                case 0: System.out.println("Message: Program ended");
                case 1:
                    /*System.out.printf("%s %n", "Clients Portfolio Summary :");
                    System.out.println("-----------------------------------");
                    System.out.printf("%-11s %-11s %-11s %-11s %-11s  %n", "Name", "ID", "AAPL", "MSFT", "GOOGL");
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name1, id1, ap1, mp1, gp1);
                    System.out.printf("%-11s %-11s %-11.2f %-11.2f %-11.2f %n", name2, id2, ap2, mp2, gp2);
                    System.out.println("-------------------------------------------------------");*/
            }

        } while (serviceID > 2 | serviceID < 0);

    }
}
