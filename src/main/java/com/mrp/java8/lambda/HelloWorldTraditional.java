package com.mrp.java8.lambda;

public class HelloWorldTraditional implements HelloWorldInterface {
    @Override
    public String sayHelloString() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
    }

}
