package com.example.learning.demo.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StatisticStreamExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8);
        IntSummaryStatistics stats = intStream.summaryStatistics(); 
        System.out.println(stats.getCount());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
    }
    
}
