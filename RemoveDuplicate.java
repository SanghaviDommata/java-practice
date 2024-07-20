import java.util.*;

public class RemoveDuplicate
{
    public static List<Integer> removeDuplicates(List<Integer> list) 
    {
        // Use LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>(list);
        
        // Convert the set back to a list
        return new ArrayList<>(set);
    }

    public static void main(String[] args) 
    {
        // Input list with duplicates
        List<Integer> list = Arrays.asList(4, 3, 2, 4, 1, 3, 2);

        // Remove duplicates while maintaining order
        List<Integer> result = removeDuplicates(list);

        // Print the result
        System.out.println(result);
    }
}
