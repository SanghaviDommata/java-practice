import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSecondElement
 {
    public static void main(String[] args) 
    {
        // Create an ArrayList of strings
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add some initial elements to the list
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");

        // Print the original list
        System.out.println("Original List: " + strList);

        // Prompt the user to enter a new element
        System.out.print("Enter the new element to replace the second element: ");
        String newElement = scanner.nextLine();

        // Replace the second element (index 1) with the new element
        if (strList.size() > 1)
        {
            strList.set(1, newElement);

            // Print the updated list
            System.out.println("Updated List: " + strList);
        } 
        else
        {
            System.out.println("The list does not have a second element to replace.");
        }

        // Close the scanner
        scanner.close();
    }
}
