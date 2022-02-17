package com.justasvaivada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);
        System.out.print("Enter FizzBuzz Range: ");
        int userSpecNumber = inputScan.nextInt();


        for (int i = 1; i <= userSpecNumber; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("fizzbuzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("fizz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("buzz: " + i);
            } else {
                System.out.println(i);
            }
        }

//        ******_ DIFFERENT METHOD _******
//        ArrayList<Object> fizzBuzzList = new ArrayList<Object>();
//        for (int i = 1; i <= userSpecNumber ; i++) {
//            if (i % 3 == 0 & i % 5 == 0) {
//                fizzBuzzList.add("FizzBuzz");
//            } else if (i % 3 == 0) {
//                fizzBuzzList.add("Fizz");
//            } else if (i % 5 == 0) {
//                fizzBuzzList.add("Buzz");
//            } else {
//                fizzBuzzList.add(i);
//            }
//        }
//        System.out.println(fizzBuzzList);
//        for (int i = 0; i < fizzBuzzList.size(); i++) {
//            System.out.println(fizzBuzzList.get(i));
//        }
//        ******_ END OF DIFFERENT METHOD _******
    }
}
