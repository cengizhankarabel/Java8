package com.java8.features.consumer;

import com.java8.features.entity.Person;
import com.java8.features.repository.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPersonExample {

    static void printPersonalDetails() {
        BiConsumer<String, List<String>> personConsumer = (name, hobbies)-> System.out.println(name+" "+hobbies);
        BiConsumer<String, Double> salaryConsumer = (name, salary) -> System.out.println(name+" "+salary);

        List<Person> personList = PersonRepository.getAllPerson();

//        personList.forEach(person -> personConsumer.accept(person.getName(), person.getHobbies()));
//        personList.forEach(person -> salaryConsumer.accept(person.getName(),person.getSalary()));

        personList.forEach(person -> {
            if(person.getSalary() >= 5000){
                salaryConsumer.accept(person.getName(),person.getSalary());
            }
        });
    }

    public static void main(String[] args) {

        printPersonalDetails();

    }
}
