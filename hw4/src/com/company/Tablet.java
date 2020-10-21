package com.company;

import java.util.Scanner;

public class Tablet {
    String metronidazol;
    String omega;
    String hairvite;
    String vitamine;
    public  void searchtablet(){
        int tablet;
        int d;
        System.out.println("1.(metronidazol),2.(omega),3.(hairvit),4.(vitamin e)");
        Scanner in=new Scanner(System.in);
        tablet=in.nextInt();
        switch (tablet){
            case 1:
                System.out.println("metronidazol");
                System.out.println("enter your amuont of metronidazol ");
                d=in.nextInt();
                if(d>=1 && d<20){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 2:
                System.out.println("omega");
                System.out.println("enter your amuont of omega");
                d=in.nextInt();
                if(d>=1 && d<20){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 3:
                System.out.println("hairvit");
                System.out.println("enter your amuont of hairvit ");
                d=in.nextInt();
                if(d>=1 && d<20){
                    System.out.println("We have inventory");
                }
                else {
                    System.out.println("We donnt have inventory");
                }
                break;
            case 4:
                System.out.println("vitamin e");
                System.out.println("enter your amuont of vitamin e");
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
