package com.java8.features.repository;

import com.java8.features.entity.Person;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
    public static List<Person> getAllPerson() {
        Person p1 = new Person("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Person p2 = new Person("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
        Person p3 = new Person("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"));
        Person p4 = new Person("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Person p5 = new Person("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
        Person p6 = new Person("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Person p7 = new Person("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));
        return Arrays.asList(p1,p2,p3,p4,p5,p6);
    }
}
