package com.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainF1_4 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ana");
        names.add("Antoni");
        names.add("Tomasa");
        names.add("Cam");
        names.add("Ber");
        names.add("Pau");
        names.add("Ani");
        names.add("Carlos");
        names.add("Carla");
        names.add("Piter");
        names.add("Anais");
        names.add("ana");
        names.add("Pere");
        names.add("Ceci");


        System.out.println(longContainsO(names));
    }

    public static List<String> longContainsO(List<String> strings){
        return strings.stream()
                .filter(s -> (s.contains("o") || s.contains("O")) && s.length()>5)
                .collect(Collectors.toList());
    }
    
}