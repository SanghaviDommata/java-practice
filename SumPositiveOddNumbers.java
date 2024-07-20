import java.util.Random;
import java.util.Scanner;

public class SumPositiveOddNumbers
{   
  public static void main(String[] args)
  {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter number of elements:");
        int n = sc.nextInt(); // Number of elements in the array
        int[] array = createArray(n);
        
        System.out.print("Array: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int positiveOddSum = sumPositiveOddNumbers(array);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
    }

    // Function to create an array of n random integers between lowerBound and upperBound
    public static int[] createArray(int n)
    {
        Random random = new Random();
        int lowerBound = -60;
        int upperBound = 60;
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            array[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        
        return array;
    }

    // Function to sum only the positive odd numbers in the given array
    public static int sumPositiveOddNumbers(int[] array)
    {
        int sum = 0;
        
        for (int num : array)
        {
            if (num > 0 && num % 2 != 0)
            {
                sum += num;
            }
        }
        
        return sum;
    }
}