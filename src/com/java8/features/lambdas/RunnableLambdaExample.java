package com.java8.features.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        // Before Java 8
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };
        new Thread(thread1).start();


        // After Java 8
        Runnable thread2 = () -> { System.out.println("Thread 2"); };
        new Thread(thread2).start();

        Runnable thread3 = () -> { System.out.println("Thread 3");
            System.out.println("Thread 3.1");
        };
        new Thread(thread3).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Thread 5");
            System.out.println("Thread 5.1");
        }).start();
    }
}
