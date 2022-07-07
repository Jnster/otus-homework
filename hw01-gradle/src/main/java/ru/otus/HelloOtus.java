package ru.otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloOtus {
    private static final Integer SIZE = 8;

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        for (int i = 1; i < SIZE; i++) {
            Integer[] zeros = new Integer[SIZE];
            Arrays.fill(zeros, 0);
            List<Integer> zeroList = Arrays.stream(zeros).toList();
            numbers.addAll(zeroList);
            numbers.add(1);
        }
        Lists.partition(numbers, SIZE).forEach(System.out::println);
    }
}
