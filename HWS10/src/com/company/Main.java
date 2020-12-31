package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadA T1 = new ThreadA();
        ThreadA T2 = new ThreadA();
        ThreadA T3 = new ThreadA();
        ThreadA T4 = new ThreadA();
        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
}
