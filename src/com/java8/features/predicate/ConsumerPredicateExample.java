package com.java8.features.predicate;

import com.java8.features.entity.Person;
import com.java8.features.repository.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {

    static Predicate<Person> predicate1 = person -> person.getHeight() >=140;

    static Predicate<Person> predicate2 = person -> person.getGender().equals("Male");

    static BiPredicate<Integer, String> biPredicate = (height, gender) -> height >=140 && gender.equals("Male");

    static BiConsumer<String, List<String>> hobbiesConsumer = (name,hobbies)-> System.out.println(name+" "+hobbies);

    static Consumer<Person> personConsumer = person -> {
      //  if(predicate1.and(predicate2).test(person)){
        if(biPredicate.test(person.getHeight(),person.getGender())){
            hobbiesConsumer.accept(person.getName(), person.getHobbies());
        }
    };

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPerson();
        personList.forEach(personConsumer);
    }
}
