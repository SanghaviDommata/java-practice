2)  Find the Most Frequent Element in an Array

Problem:

Given a non-empty array of integers, find the most frequent element.

Example:

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement 
{
    public static void main(String[] args)
    {
        int[] input = {1, 3, 2, 2, 5, 2, 3, 4, 1, 1};
        int result = findMostFrequentElement(input);
        System.out.println("Most frequent element: " + result);
    }

    public static int findMostFrequentElement(int[] nums)
    {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the HashMap with element frequencies
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the highest frequency
        int mostFrequentElement = nums[0];
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() > maxFrequency) 
            {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        return mostFrequentElement;
    }
}