package com.java8.features.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> lessThan = a -> ( a<=50 );
        Predicate<Integer> greaterThan = a -> ( a>=20 );
        Predicate<Integer> equalTo = a -> ( a==100 );

//        boolean result = lessThan.test(15);
//        System.out.println("Result: "+result);

        System.out.println("Greater Than: "+greaterThan.test(150));
        System.out.println("Less Than: "+lessThan.test(150));
        System.out.println("Equal To: "+equalTo.test(0));

        boolean result2 = lessThan.and(greaterThan).and(equalTo).test(150);
        System.out.println("Result2: "+result2);

        boolean result3 = lessThan.or(greaterThan).test(150);
        System.out.println("Result3: "+result3);

        boolean result4 = lessThan.or(greaterThan).negate().test(150);
        System.out.println("Result4: "+result4);


    }
}
