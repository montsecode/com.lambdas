package com.lambdas;


import java.util.Arrays;

public class MainF1_5 {
    public static void main(String[] args){

        String[] months = {"January","February","March","April","May","June","July"
                ,"August","September","October","November","December" };

        Arrays.stream(months).forEach(month -> System.out.println(month));

    }
}