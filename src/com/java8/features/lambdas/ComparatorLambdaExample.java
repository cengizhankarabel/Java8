package com.java8.features.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        // Before Java 8
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        };
        System.out.println("Comparator before java-8: "+c1.compare(5,3));

        // After Java 8
        Comparator<Integer> c2 = (Integer num1, Integer num2) -> num1.compareTo(num2);
        System.out.println("Comparator before java-8: "+c2.compare(5,3));

        Comparator<Double> c3 = (num1, num2) -> num1.compareTo(num2);
        System.out.println("Comparator before java-8: "+c3.compare(4.4,4.2));

        Comparator<String> c4 = (str1, str2) -> str1.compareTo(str2);
        System.out.println("Comparator before java-8: "+c4.compare("Houston","Austin"));
    }
}
