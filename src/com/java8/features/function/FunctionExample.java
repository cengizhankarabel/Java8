package com.java8.features.function;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function1 = name -> name.toUpperCase();
    static Function<String, String> function2 = name -> name.toUpperCase().concat(" features");

    public static void main(String[] args) {

//        System.out.println("Result: "+function1.apply("java"));
//        System.out.println("Result: "+function2.apply("java"));
        System.out.println("And Then result: "+function1.andThen(function2).apply("java"));
        System.out.println("Compose result: "+function1.compose(function2).apply("java"));


    }
}
