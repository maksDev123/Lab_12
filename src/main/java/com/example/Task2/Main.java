package com.example.Task2;

import java.util.function.Consumer;

public class Main {
    static int test = 7;

    public static void inc(){
        test += 1;
    }
    public static void main(String[] args) {
        System.out.println(test);
        Consumer<Integer> lambdaExpression = (param) -> inc();
        Signature s = new Signature<>(lambdaExpression);       
        s.apply(test);

        System.out.println(test);
    }
}
