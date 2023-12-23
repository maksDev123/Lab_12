package com.example.Task1;

public class Tracker10 implements Track{

    public static void track(int number){
        int pass = number % 10;
        System.out.println("Quantity 10: " + (number - pass) / 10);
        Track1.track(pass);
    }
    
}
