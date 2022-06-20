package com.mrp.java8.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/**
 * combination of Predicate and BiConsumer
 */
public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches online
        Predicate<Instructor> p_online = (i) -> i.isOnlineCourses()==true;
        //instructor experience is >10
        Predicate<Instructor> p_exp = (i) -> i.getYearsOfExperience()>10;

        //Biconsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("name is: " + name + " courses : " + courses);

        instructors.forEach(instructor -> {
            if(p_online.and(p_exp).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
