package com.example.Task1;

public class Tracker100 implements Track{
    
    public static void track(int number){
        int pass = number % 100;
        System.out.println("Quantity 100: " + (number - pass) / 100);
        Tracker10.track(pass);
    }
}
