package com.lambdas;

import java.util.Arrays;
import java.util.function.Consumer;

public class MainF1_6 {
    public static void main(String[] args){

        String[] months = {"January","February","March","April","May","June","July"
                ,"August","September","October","November","December" };

        //printWithMethodReference(months);

        Consumer<String[]>methodReference = MainF1_6::printWithMethodReference;
        methodReference.accept(months);
    }

    public static void printWithMethodReference(String[] months){
        Arrays.stream(months).forEach(System.out::println);
    }
}