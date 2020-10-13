package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int d;
        double money;
        final double mojoodi=15000000.10;
        double n;

        Rulesbank m=new Rulesbank();
        System.out.println("take money press 1,deposit money press 2,if you want to know Fightagainstmoneylaundering press 3,if you want to know Combatingthefinancingofterrorism press 4,if you want to know Regulationofnoncommonmoneymarket press 5,if you want to know Interestfreebankingoperations press 6,if you want to know Budgetfortheyear1399 press 7,if you want to exit press 8");
        Scanner scanner=new Scanner(System.in);
        d=scanner.nextInt();
        switch (d){
            case 1:
                System.out.print("ENTER THE AMOUNT OF MONEY THAT YOU WANT TAKE IT");
                Scanner input=new Scanner(System.in);
                money=input.nextDouble();
                n=mojoodi-money;
                System.out.print(n);


                break;
            case 2:
                System.out.print("ENTER THE AMOUNT OF MONEY THAT YOU WANT TAKE IT");
                Scanner in=new Scanner(System.in);
                money=in.nextDouble();
                n=mojoodi+money;
                System.out.print(n);
                break;
            case 3:
                m.fightagainstmoneylaundering();
                break;
            case 4:
                m.combatingthefinancingofterrorism();
                break;
            case 5:
                m.regulationofnoncommonmoneymarket();
                break;
            case 6:
                m.interestfreebankingoperations();
                break;
            case 7:
                m.budgetfortheyear1399();
                break;
            case 8:
                System.out.print("EXIT :)");
                break;








        }

	// write your code here
    }
}
