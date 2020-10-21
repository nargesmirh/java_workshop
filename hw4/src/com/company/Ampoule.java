package com.company;

import java.util.Scanner;

public class Ampoule {
    String penesilin;
    String anfolanza;
    public void searchampoule(){
        int ampoule;
        int d;
        System.out.println("1.(penesilin),2.(anfolanza)");
        Scanner in=new Scanner(System.in);
        ampoule=in.nextInt();
        switch (ampoule){
            case 1:
            System.out.println("penesilin");
            System.out.println("enter your amuont of penesilin");
            d=in.nextInt();
            if(d>=1 && d<5){
                System.out.println("We have inventory");
            }
            else {
                System.out.println("We donnt have inventory");
            }
            break;
            case 2:
                System.out.println("anfolanza");
                System.out.println("enter your amuont of metronidazol ");
                d=in.nextInt();
                if(d>=1 && d<3){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
        }
    }
}
