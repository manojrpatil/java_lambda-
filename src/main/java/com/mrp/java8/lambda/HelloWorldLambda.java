package com.mrp.java8.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () -> 
        	 "Hello World shooort";
         // from lambda E.


        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
