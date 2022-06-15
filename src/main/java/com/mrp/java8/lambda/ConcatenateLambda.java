package com.mrp.java8.lambda;

public class ConcatenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (x,b) -> x + " " + b;
        System.out.println(concatenateInterface.sconcat("Hello, ", "beautiful World"));
    }
}
