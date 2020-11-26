package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Title_book title_book = new Title_book();
        int id = 0;
        Book book = new Book();
        while (true) {
            System.out.println("show informaion of book : \n  2 add book : \n 3 remove book \n 4 update book \n 5 show title book");
            int i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("ENTER ID ");
                    title_book.setId(input.nextInt());

                    book.showinfo(Title_book.getId, Title_book.getName,title_book.setChap(),Title_book.gettitle(),Title_book.getNasher);
                    break;
                case 2:

                    System.out.println("ENTER ID");
                    title_book.setId(input.nextInt());

                    System.out.println("ADD BOOK : ");
                    System.out.println("pls enter BOOK name : ");
                    title_book.setName(input.next());

                    System.out.println("pls enter BOOK ID : ");
                    title_book.setId(input.nextInt());
                    System.out.println("pls enter BOOK  NASHER : ");
                    title_book.setNasher(input.next());

                    System.out.println("pls enter BOOK CHAP : ");
                    title_book.setChap(input.next());

                    System.out.println("pls enter BOOK Title_id : ");
                    title_book.setId(input.nextInt());
                    book.addbook(Title_book.getId, title_book.setChap(), Title_book.getName, Title_book.getNasher, Title_book.gettitle());
                    break;
                case 3:
                    System.out.println("ENTER ID");
                    title_book.setId(input.nextInt());

                    book.removebook(Title_book.getId);
                    break;
                case 4:
                    System.out.println("ENTER ID");
                    title_book.setId(input.nextInt());
                    break;
                case 5:
                    System.out.println("ENTER YOUR ID");
                    title_book.setId(input.nextInt());
                    book.showtitle(Title_book.gettitle());
                    break;
            }
            break;

        }
    }
}
