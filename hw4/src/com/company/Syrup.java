package com.company;

import java.util.Scanner;

public class Syrup {

    String Sorethroatsyrup;
    String banafshesyrup;
    String bromhexine;
    String acetaminophen;
    String betametazon;
    public  void  searchsyrup() {
        int syrup;
        int d;
        System.out.println("1.(Sorethroatsyrup),2.(banafshesyrup),3.(bromhexine),4.(acetaminophen),5.(betametazon)");
        Scanner input=new Scanner(System.in);
        syrup=input.nextInt();
        switch (syrup){
            case 1:
                System.out.println("Sorethroatsyrup");
                System.out.println("enter your amuont of Sorethroatsyrup");
                d=input.nextInt();
                if(d>=1 && d<10){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 2:
                System.out.println("babafshesyrup");
                System.out.println("enter your amuont of banafshesyrup");
                d=input.nextInt();
                if(d>=1 && d<10){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 3:
                System.out.println("bromhexine");
                System.out.println("enter your amuont of bromhexine");
                d=input.nextInt();
                if(d>=1 && d<10){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 4:
                System.out.println("acetaminophen");
                System.out.println("enter your amuont of acetaminophen");
                d=input.nextInt();
                if(d>=1 && d<10){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 5:
                System.out.println("betametazon");
                System.out.println("enter your amuont of betametazon");
                d=input.nextInt();
                if(d>=1 && d<10){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;




        }

    }


}
