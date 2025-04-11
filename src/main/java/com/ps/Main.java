package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

//        INPUTS: Principal,Interest Rate, Loan Length

        System.out.print("input principal:$ ");
        double principal = scanner.nextDouble();

        System.out.print("input annual interest rate:% ");
        double interestRate = scanner.nextDouble();

        System.out.print("input loan length in Years: ");
        int loanLength = scanner.nextInt();

        int totalMonths =0;
        totalMonths = loanLength * 12;
        System.out.println("Number of monthly payments: "+ totalMonths);

        double annualInterest= 0;
        annualInterest= (principal*(interestRate/100));
        System.out.println("Total annual interest:$ "+ annualInterest);

        double monthlyInterest=0;
        monthlyInterest= (principal+ annualInterest)/totalMonths;

        System.out.printf("Monthly payment:$%.2f", monthlyInterest);

// -------------------------------------END OF MORTGAGE CALCULATOR--------------------------------------



    }
}
