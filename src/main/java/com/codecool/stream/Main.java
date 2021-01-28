package com.codecool.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> myList2 = myList.stream()
            .filter(element -> element.charAt(0) == 'c')
            .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
            .sorted()
            .collect(Collectors.toList());
        myList2.forEach(System.out::println);
    }
}