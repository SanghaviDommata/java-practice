package com.javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(17);
        numbers.add(45);
        numbers.add(11);
        numbers.add(95);
        numbers.add(5);

        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers);

        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}