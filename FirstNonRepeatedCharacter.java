1) Find the First Non-Repeated Character in a String

Problem:

Given a string, find the first non-repeated character in it and return its index. If it doesn't exist, return -1.

Example:

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter
{
    public static void main(String[] args) 
    {
        String input = "aabb";
        int result = findFirstNonRepeatedCharacter(input);
        System.out.println("Index of the first non-repeated character: " + result);
    }

    public static int findFirstNonRepeatedCharacter(String str) 
    {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character that has a frequency of one
        for (int i = 0; i < str.length(); i++) 
        {
            if (charCountMap.get(str.charAt(i)) == 1) 
            {
                return i;
            }
        }

        // If no non-repeated character is found, return -1
        return -1;
    }
}