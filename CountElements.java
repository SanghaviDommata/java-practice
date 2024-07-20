package com.javapractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class CountElements {

    public static int countElementsLessThan(Set<Integer> set, int value) {
        // Convert the set to a sorted list
        List<Integer> list = new ArrayList<>(set);

        // Use binary search to find the position of the first element not less than the given value
        int position = Collections.binarySearch(list, value);

        // If the value is found, return the position (as all elements before it are less)
        // If the value is not found, binarySearch returns (-(insertion point) - 1)
        // We can derive the insertion point as -(position + 1)
        if (position >= 0) {
            return position;
        } else {
            return -position - 1;
        }
    }

    public static void main(String[] args) {
        // Create a sorted set of integers
        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 4, 5, 7, 8, 10));

        int value = 6;
        int count = countElementsLessThan(set, value);

        System.out.println("Number of elements less than " + value + ": " + count);
    }
}