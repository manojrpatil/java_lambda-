package com.mrp.java8.funcprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p_int = (i) -> i>100;
        System.out.println("100>100:"+p_int.test(100));

        LongPredicate p_long = (i) -> i>100L;
        System.out.println("1111111111111111111L>100L:"+p_long.test(1111111111111111111L));

        DoublePredicate p_double = (i) -> i<100.25;
        DoublePredicate p_double_2 = (i) -> i>100.10;
        System.out.println("100.25<100.15 && 100.25>100.1:"+p_double.and(p_double_2).test(100.15));

    }
}
