package com.javapractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuExample {

    public static void main(String[] args) {
        // Create an instance of ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst(1);  // Adds 1 to the front
        deque.addLast(2);   // Adds 2 to the end
        deque.addFirst(3);  // Adds 3 to the front
        deque.addLast(4);   // Adds 4 to the end

        // Print the deque
        System.out.println("Deque after adding elements: " + deque);

        // Accessing elements
        System.out.println("First element: " + deque.getFirst()); // Returns 3
        System.out.println("Last element: " + deque.getLast());   // Returns 4

        // Removing elements from the deque
        deque.removeFirst(); // Removes 3 from the front
        deque.removeLast();  // Removes 4 from the end

        // Print the deque after removals
        System.out.println("Deque after removing elements: " + deque);

        // Iterating through the deque
        System.out.println("Iterating through the deque:");
        for (Integer element : deque) {
            System.out.println(element);
        }

        // Adding more elements to demonstrate some additional methods
        deque.addFirst(5);
        deque.addLast(6);

        // Remove elements
        deque.pollFirst(); // Retrieves and removes the first element (5)
        deque.pollLast();  // Retrieves and removes the last element (6)

        // Print the deque after polling
        System.out.println("Deque after polling elements: " + deque);
    }
}