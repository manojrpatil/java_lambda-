package com.mrp.java8.funcprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = (x) -> System.out.println(x.length() + "; value of x is \"" + x+"\"");
		c.accept("Up in the air");

        //Consumer with block statement
        Consumer<Integer> m = (x) -> {
            System.out.println("x*x = " + x*x);
            System.out.println("x/x = " + x/x);
        };
        m.accept(10);
	}

}
