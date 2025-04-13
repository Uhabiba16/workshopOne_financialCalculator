package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("input principal:$ ");
        double principal = scanner.nextDouble();

        System.out.print("input annual interest rate: ");
        double interestRate = scanner.nextDouble();
        double i; //monthly Interest= i
        i=(interestRate/100)/12;
//        System.out.println("Total annual interest:$ "+ i);

        System.out.print("input loan length in Years: ");
        int loanLength = scanner.nextInt();
        int n; //totalMonths=n
        n = (loanLength * 12);
//        System.out.println("Number of monthly payments: "+ n);

        double monthlyPayment;
        monthlyPayment=(principal* i * Math.pow((1+i),n))/((Math.pow((1+i),n))-1);

        double totalPaid;
        totalPaid= monthlyPayment * n;

        System.out.printf("Monthly payment:$%.2f", monthlyPayment);
        System.out.printf(" and total interest:$%.2f",totalPaid - principal);
//-----------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("--------------CALCULATOR 2----------------");

        System.out.print("Input Deposit:$ ");
        int deposit = scanner.nextInt();

        System.out.print("Input interest:% ");
        double interest= scanner.nextDouble();

        double rate;
        rate =(interest /100);

        System.out.print("Input years: ");
        int years = scanner.nextInt();
        int days;
        days = (years * 365);

        double futureValue;
        futureValue= deposit * Math.pow((1+(rate/365)),days);

        System.out.printf("future value:$%.2f", futureValue);
        System.out.printf(" and interest earned:$%.2f ", (futureValue- deposit));
//-----------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("----------------CALCULATOR 3------------------");

        System.out.print("Input monthly payout:$ ");
        double m = scanner.nextDouble(); // Monthly payout =m

        System.out.print("input expected interest rate:");
        double expectedInterest = scanner.nextDouble(); // expected interest = e
        double e;
        e= (expectedInterest/100)/12;
//        System.out.println(e +" Monthly interest rate");

        System.out.print("Input years to payout:");
        int yearToPayout= scanner.nextInt(); // years to pay out
        int y;
        y = yearToPayout* 12;

        double presentValue;
        presentValue= m *(1-Math.pow(1+e,-y))/e;

        System.out.printf("Present value:$ %.2f",presentValue);

    }
}
