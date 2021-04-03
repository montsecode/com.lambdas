package com.lambdas;

public class MainF2{

    public static void main(String[] args){

        PiInterface pi = ()-> 3.1415;
        System.out.println(pi.getPiValue());
    }
}