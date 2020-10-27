package com.company;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Managerfile file1 = new Managerfile();
        Managerfile file2 = new Managerfile();
        Managerfile file3 = new Managerfile();
        Managerfile file4 = new Managerfile();
        Managerfile file5 = new Managerfile();
        Managerfile file6 = new Managerfile();
        Managerfile file7 = new Managerfile();
        Managerfile file8 = new Managerfile();
        Managerfile file9 = new Managerfile();
        Managerfile file10 = new Managerfile();
        file1.setFilename("a");
        file1.setFormat("mp4");
        file1.setVirus("yes");
        file1.setContent("32");
        file1.setType("zip");
        file2.setFilename("b");
        file2.setFormat("jpeg");
        file2.setVirus("yes");
        file2.setContent("16");
        file2.setType("rar");
        file3.setFilename("c");
        file3.setFormat("gif");
        file3.setVirus("no");
        file3.setContent("4");
        file3.setType("zip");
        file4.setFilename("d");
        file4.setFormat("pdf");
        file4.setVirus("yes");
        file4.setContent("16");
        file4.setType("zip");
        file5.setFilename("e");
        file5.setFormat("svg");
        file5.setVirus("yes");
        file5.setContent("64");
        file5.setType("rar");
        file6.setFilename("f");
        file6.setFormat("mp4");
        file6.setVirus("no");
        file6.setContent("2");
        file6.setType("par5");
        file7.setFilename("g");
        file7.setFormat("png");
        file7.setVirus("yes");
        file7.setContent("6.7");
        file7.setType("par5");
        file8.setFilename("h");
        file8.setFormat("jpeg");
        file8.setVirus("no");
        file8.setContent("9.8");
        file8.setType("par5");
        file9.setFilename("i");
        file9.setFormat("mp3");
        file9.setVirus("yes");
        file9.setContent("5.8");
        file9.setType("rar");
        file10.setFilename("j");
        file10.setFormat("mp4");
        file10.setVirus("yes");
        file10.setContent("64");
        file10.setType("zip");
        List<Managerfile> list = new ArrayList<Managerfile>();
        list.add(file1);
        list.add(file2);
        list.add(file3);
        list.add(file4);
        list.add(file5);
        list.add(file6);
        list.add(file7);
        list.add(file8);
        list.add(file9);
        list.add(file10);
        System.out.println("enter the file name");
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();

        for (Managerfile obg:list) {


            if (filename.equals(obg.getFilename())) {
                System.out.println(obg.getFormat());
                System.out.println(obg.getVirus());
                System.out.println(obg.getContent());
                System.out.println(obg.getType());
            }







        }
        for (Managerfile obj:list){
            if(obj.getVirus()=="yes"){
                System.out.println(obj.getFilename());
            }
        }


    }








    
}
