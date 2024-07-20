3)Find Top K Frequent Words

Problem:

Given an array of strings words and an integer k, return the k most frequent words. The answer should be sorted by frequency from highest to lowest. If two words have the same frequency, sort them by their natural order.

Example:

import java.util.*;

public class TopKFrequentWords 
{
    public List<String> topKFrequent(String[] words, int k) 
    {
        // Step 1: Count the frequency of each word
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) 
        {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        
        // Step 2: Use a PriorityQueue to keep track of the top k elements
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> countMap.get(w1).equals(countMap.get(w2)) ?  w2.compareTo(w1) : countMap.get(w1) - countMap.get(w2));
        
        for (String word : countMap.keySet()) 
        {
            heap.offer(word);
            if (heap.size() > k)
            {
                heap.poll();
            }
        }
        
        // Step 3: Extract the elements from the heap and sort them
        List<String> result = new ArrayList<>();
        while (!heap.isEmpty()) 
        {
            result.add(heap.poll());
        }
        Collections.reverse(result); // The heap gives us the elements in ascending order
        
        return result;
    }
    
    public static void main(String[] args) 
    {
        TopKFrequentWords solution = new TopKFrequentWords();
        String[] words = {"i", "love", "coding", "i", "love", "MyCountry"};
        int k = 2;
        System.out.println(solution.topKFrequent(words, k)); // Output: [i, love]
    }
}