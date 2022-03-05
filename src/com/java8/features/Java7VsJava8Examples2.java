package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java7VsJava8Examples2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("houston","austin","dallas","houston","dallas","katy");
        
        // Before Java 8
        List<String> uniqueList = new ArrayList<>();
        for(String name : names){
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("Unique List before Java-8: "+uniqueList);

        // After Java 8
        List<String> uniqueValues = uniqueList
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique List after java-8: "+uniqueValues);
    }
}
