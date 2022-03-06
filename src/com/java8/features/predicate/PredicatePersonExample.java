package com.java8.features.predicate;

import com.java8.features.entity.Person;
import com.java8.features.repository.PersonRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePersonExample {

    static Predicate<Person> predicate1 = person -> person.getHeight() >= 140;

    static Predicate<Person> predicate2 = person -> person.getGender().equals("Male");

    public static void main(String[] args) {

        List<Person> personList = PersonRepository.getAllPerson();

//        personList.stream()
//                .filter(predicate1)
//                .filter(predicate2)
//                .forEach(person ->
//                        System.out.println(person.getName()+" "+person.getHeight()));

        personList.stream()
                .filter(predicate1)
                .collect(Collectors.toList());

        personList.forEach(person -> {
            if(predicate1.test(person)){
                System.out.println(person);
            }
        });

//        personList.stream()
//                .filter(predicate1)
//                .filter(predicate2)
//                .collect(Collectors.toList());

        personList.forEach(person -> {
            if(predicate1.and(predicate2).test(person)){
                System.out.println(person);
            }
        });
    }
}
