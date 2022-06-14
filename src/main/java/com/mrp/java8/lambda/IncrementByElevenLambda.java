package com.mrp.java8.lambda;

public class IncrementByElevenLambda {
	
    public static void main(String[] args) {
    	IncrementByElevenInterface incrementByElevenInterface = (x) -> x+11;
    	System.out.println(incrementByElevenInterface.incrementByEleven(3));
    }
	
}
