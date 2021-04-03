package com.lambdas;

public class MainF3 {
    public static void main(String[] args){
        ReverseInterface reverseString = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println(reverseString.reverse("Hi there"));
    }
}