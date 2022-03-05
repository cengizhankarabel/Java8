package com.java8.features.consumer;

import com.java8.features.entity.Person;
import com.java8.features.repository.PersonRepository;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerPersonExample {

    static Consumer<Person> c1 = (p) -> System.out.println(p);

    static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());

    static List<Person> personList = PersonRepository.getAllPerson();

    static void printNameAndHobbies(){
        personList.forEach(c2.andThen(c3));
    }

    static void printWithCondition(){
        personList.forEach(p ->{ // iterate person
            if(p.getGender().equals("Male") && p.getHeight() >= 140) {
                c2.andThen(c3).accept(p);
            }
        });
    }

    public static void main(String[] args) {
//        c1.accept(PersonRepository.getPerson());
//        c2.accept(PersonRepository.getPerson());
//        c3.accept(PersonRepository.getPerson());
//        c1.andThen(c2.andThen(c3)).accept(PersonRepository.getPerson());
//        printNameAndHobbies();
        printWithCondition();
    }

}
