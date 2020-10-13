package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //tamrin 1
        int i,j,n;
        System.out.print("enter your number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=0;i<=n;i++) {
            for (j = 0; j <= n-i; j++) {
                System.out.print(" ");

            }
            for(j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
