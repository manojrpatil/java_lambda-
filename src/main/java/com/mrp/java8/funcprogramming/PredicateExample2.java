package com.mrp.java8.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        //all instructor who teaches online
        Predicate<Instructor> p_online = (i) -> i.isOnlineCourses()==true;
        //instructor experience is >10 years
        Predicate<Instructor> p_10_exp = (i) -> i.getYearsOfExperience() >10;

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if (p_online.test(instructor)){
                System.out.println(instructor);
            }
        });

        // is instructor teaches online and exprience is > 10 years
        System.out.println("---------------------");
        instructors.forEach(instructor ->  {
            if(p_online.and(p_10_exp).test(instructor)){
                System.out.println(instructor);
            }
        });

    }
}
