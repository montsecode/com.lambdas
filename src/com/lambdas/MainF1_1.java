package com.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainF1_1 {

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

    System.out.println(aAnd3Method(names));

    }
    public static List<String> aAnd3Method(List<String> names) {
        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList());
        return filteredNames;
    }
}