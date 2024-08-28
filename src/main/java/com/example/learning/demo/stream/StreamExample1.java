package com.example.learning.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        // List <Integer> list = Arrays.asList(1,2,3,4,5,3,7,22,88,99,44,666,2222,780,0);
        // List <Integer> filteredList  = list.stream()
        // // List <Integer> collect = Stream.iterate(0, x-> x+1)
        // // .limit(10000) // end point
        // // .skip(2) //skip first element
        // .filter(x -> x%2 == 0) // add conditions
        // .map(x -> x /10) // new conditions
        // .distinct() // remove duplicate
        // .sorted() // print sorted
        // .peek(x -> System.out.println(x)) // peek is used for print current
        // .collect(Collectors.toList()); // store in a list
        // System.out.println(filteredList);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,1,1,1,2,3,3,4,5,6,7,8,5,5,4,4,4,4,4,4,4,4,3,3,3,3,3,2,2,2);
        list.parallelStream();
        list.forEach(System.out::println);
    }
    
}
