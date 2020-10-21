package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = null;
        int choose;
        System.out.println("if you want Syrup press 1 if you want Tablet press 2 if you want Ointment prees 3 if you want Ampoule prees 4");
        Scanner input=new Scanner(System.in);
        choose=input.nextInt();
        Syrup m=new Syrup();
        Tablet s=new Tablet();
        Ointment p=new Ointment();
        Ampoule t=new Ampoule();

        switch (choose){
            case 1:
                m.searchsyrup();
                break;
            case 2:
                s.searchtablet();
                break;
            case 3:
                p.Searchointment();
                break;
            case 4:
                t.searchampoule();
                break;

        }
        try{
            Shopping f=new Shopping();
            f.rules(a);
            System.out.println("card isnt true");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

    }
}
