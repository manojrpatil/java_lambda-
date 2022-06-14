package com.mrp.java8.lambda;

public class ConcetenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (x,b) -> x + "| s" + b;
        System.out.println(concatenateInterface.sconcat("Hello, ", "beautiful World"));
    }
}
