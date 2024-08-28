package com.example.learning.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("Apple","banana","mango"); // list stream
        Stream <String> myStream = list.stream();
        myStream.forEach(System.out::println);

        String [] arrayStrings = {"apple","banana","mango"}; // array stream
        Stream<String> stream = Arrays.stream(arrayStrings);
        stream.forEach(System.out::println);

        Stream<Integer> integers = Stream.of(1,2,3); //values
        integers.forEach(System.out::println);

        Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100); //limit
        limit.forEach(System.out::println);

        Stream<Integer> limit1= Stream.generate(() -> (int) Math.random()*100).limit(5); //genrating stream
        limit1.forEach(System.out::println);
    }

    
    
}
