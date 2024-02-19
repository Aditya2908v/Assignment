package com.collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> citySet = new HashSet<>();
        List<String> cityList = new ArrayList<>();

        cityList.add("mumbai");
        cityList.add("chennai");
        cityList.add("banglore");
        cityList.add("delhi");
        cityList.add("hyderabad");

        //list of cities
        System.out.println("List of cities");
        for(String city : cityList)
            System.out.println(city);

        System.out.println("\n");

        citySet.add("mumbai");
        citySet.add("chennai");
        citySet.add("banglore");
        citySet.add("delhi");
        citySet.add("hyderabad");
        citySet.add("delhi");

        System.out.println("Set of cities");
        for(String city : citySet)
            System.out.println(city);


    }

}
