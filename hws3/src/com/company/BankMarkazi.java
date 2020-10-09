package com.company;
import java.util.Scanner;
public class BankMarkazi {
    double holding;
    double money;

    public void Harvest(){
        System.out.println("enter yor amount of money");
        Scanner s=new Scanner(System.in);
        money=s.nextDouble();
        System.out.println("enter yor amount of holding");
        holding=s.nextDouble();
        holding=holding-money;
        System.out.println(holding);
    }
    public void Deposit(){
        System.out.println("enter yor amount of money");
        Scanner s=new Scanner(System.in);
        money=s.nextDouble();
        System.out.println("enter yor amount of holding");
        holding=s.nextDouble();
        holding=holding+money;
        System.out.println(holding);
    }
    public void Cashoperations(){
        System.out.println("In this operation, one side of the operation must deal with the fund account");

    }
    public void Transitionoperations(){
        System.out.println("This operation covers all balance sheet items and profits and losses except the fund account");

    }
    public void Cardtocardoperation(){
        System.out.println("this bank has card tord operation");
    }
    public void Cheque(){
        int d;
        System.out.println("1. Ordinary check,2. Verified checks,3. Guaranteed or bank check,4. Encrypted or interbank check,5. Traveler's check,6. White signed check,7. Term Check");
        Scanner scanner=new Scanner(System.in);
        d= scanner.nextInt();
        switch(d){
            case 1:
                System.out.println("Ordinary check: A check issued by the account holder on behalf of other people. These types of checks do not have a special payment credit and can only be trusted by the account holder. Therefore, it is recommended that you only receive regular checks from people you trust or know enough about");
                break;
            case 2:
                System.out.println("Verified checks: Unlike normal checks, these checks have a higher payment credit, because the bank denies the existence of the check in the verified account. In this way, it separates and blocks the issuer's account in the amount stated in the check and pays the confirmed amount only to the check holder.");
                break;
            case 3:
                System.out.println("Guaranteed or bank check: It is a check issued by the bank at the request of the customer. This check will be in the name of the issuing bank or one of the branches of the same bank. The advantage of this check is the guarantee of payment by the bank.");
                break;
            case 4:
                System.out.println("Encrypted or interbank check: It is a check issued by the bank at the customer's request to one of the other banks in the country and in fact causes financial transfers from the customer's bank account to another bank. These checks are issued with a password.");
                break;
            case 5:
                System.out.println("Traveler's check: A check that is commonly known as a traveler's check. In fact, it is a check issued by the bank and the amount of the check is written on it.");
                break;
            case 6:
                System.out.println("White signed check: It is a check signed by the issuer but the name of the holder, the date of the check and other items are not mentioned in it.");
                break;
            case 7:
                System.out.println("Term Check: A check or promissory note is a check that is issued today for a later period and the date of issue and maturity is different. For example, the date of issuance of the check is 12/10/96, but the due date of the check is 01/02/97");
                break;


        }

    }
}
