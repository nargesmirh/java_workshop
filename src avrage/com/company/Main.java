package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //tamrin2manzel
        float mark,sum=0,avg=0;
        int z,n,i;
        System.out.println("enter the amount of lessons");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=0;i<n;i++) {
            System.out.print("enter the amount of ratio  ");
            Scanner s = new Scanner(System.in);
            z= s.nextInt();
            System.out.println("enter the amount of  mark: ");
            Scanner d = new Scanner(System.in);
            mark = d.nextFloat();
            sum=(z*mark);
            avg=sum/z;
        }

        System.out.println("the avrage is:"+avg);
        if(avg>12){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
        }


	// write your code here
    }
}
