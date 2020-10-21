package com.company;

import java.util.Scanner;

public class Ointment {
    String a;
    String asacol;
    public void Searchointment(){
        int ointment;
        int d;
        Scanner in=new Scanner(System.in);
        System.out.println("1.(a),2.(asacol)");
        ointment=in.nextInt();
        switch (ointment) {
            case 1:
            System.out.println("a");
            System.out.println("enter your amuont of a ");
            d=in.nextInt();
            if(d>=1 && d<20){
                System.out.println("We have inventory");
            }
            else {
                System.out.println("We donnt have inventory");
            }
            break;
            case 2:
                System.out.println("asakol");
                System.out.println("enter your amuont of asakol");
                d=in.nextInt();
                if(d>=1 && d<20){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
        }

    }
}
