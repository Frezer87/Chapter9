package com.frezer;

public class Main {
    public static void main(String [] args) {
        day presentday = new day("Tuesday");
        System.out.println(presentday.nextDay());
        System.out.println(presentday.previousDay());
        System.out.println(presentday.calculateDay(+2));
    }
}
