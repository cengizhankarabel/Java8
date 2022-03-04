package com.java8.features;

import java.util.stream.IntStream;

public class Java7VsJava8Examples {
    public static void main(String[] args) {

        // Before Java 8
        int sum1 = 0;
        for(int i=0; i<=50; i++){
            sum1 += i;
        }
        System.out.println("sum1 is: "+sum1);

        // After Java 8
        int sum2 = IntStream.rangeClosed(0,50)
                .map(Integer::new)
                .sum();

        System.out.println("sum2 is: "+sum2);
    }
}
