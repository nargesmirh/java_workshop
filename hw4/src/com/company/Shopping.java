package com.company;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Shopping extends Exception{
    public Shopping(String mgs){
        super(mgs);
    }
    public Shopping(){

    }
    //ArrayList<String> list=new ArrayList<String>();
    int ramz;
    String  card;
    int tarikh;
    double inventory;
    public void rules (String ch)throws Shopping{
        int h;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your card");
        card=input.nextLine();
        h=card.length();

        if(h<17 && h>0){
            System.out.println("this card is true");
            System.out.println("enter your password");
            ramz=input.nextInt();
            if (ramz<0){
                throw new Shopping("THIS PASSWORD ISNT EXIST");
            }
            else {
                System.out.println("password is true");
                System.out.println("enter tarikh");
                tarikh=input.nextInt();
                if(tarikh==1400){
                    System.out.println("true");
                }
                else{
                    throw new Shopping("FALSE");
                }
            }
        }
        else{
                throw  new Shopping("this card isnt true try again");
            }

        }


    }

