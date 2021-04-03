package com.lambdas;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainF1_2 {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(29);
        numbers.add(38);
        numbers.add(47);
        numbers.add(56);
        numbers.add(65);
        numbers.add(74);
        numbers.add(83);
        numbers.add(92);
        numbers.add(1);
        numbers.add(0);

        System.out.println(oddOrEven(numbers));
    }
    public static String oddOrEven (ArrayList<Integer> numbers) {
        String evenNumbers = numbers.stream()
                .filter(i->i%2==0).map(i -> "e" + i)
                .collect(Collectors.joining(","));
        String oddNumbers = numbers.stream()
                .filter(i->i%2==1).map(i -> "o" + i)
                .collect(Collectors.joining(","));
        return evenNumbers +"," + oddNumbers;


    }
}