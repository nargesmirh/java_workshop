package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankMarkazi user=new BankMarkazi();
        BankSepah user1=new BankSepah();
        BankMeli user2=new BankMeli();
        BankAyande user3=new BankAyande();

        int choose;
        System.out.println("if you want bankmarkazi press 1,if you want banksepah press 2,if you want bankmeli press 3,if you want bankayande press 4");
        Scanner input=new Scanner(System.in);
        choose=input.nextInt();
        switch (choose){
            case 1:
                user.Deposit();
                user.Harvest();
                user.Cashoperations();
                user.Transitionoperations();
                user.Cardtocardoperation();
                user.Cheque();

                break;
            case 2:
                user1.Deposit();
                user1.Harvest();
                user1.Cashoperations();
                user1.Transitionoperations();
                user1.Cardtocardoperation();
                user1.Cheque();
                user1.Loan();
                break;
            case 3:

                user2.Deposit();
                user2.Harvest();
                user2.Cashoperations();
                user2.Transitionoperations();
                user2.Cardtocardoperation();
                user2.Cheque();
                user2.Profit();
                break;
            case 4:

                user3.Deposit();
                user3.Harvest();
                user3.Cashoperations();
                user3.Transitionoperations();
                user3.Cardtocardoperation();
                user3.Cheque();
                user3.Bankstock();
                break;

        }

	// write your code here
    }
}
