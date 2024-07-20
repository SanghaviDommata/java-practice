package practice;
public class MultipleCatchEx
{
    public static void main(String[] args)
    {
        try 
        {
            // Example code that may throw exceptions
            int[] numbers = {1, 2, 3};
            int a = numbers[1];
            int b = numbers[3];  // This will throw ArrayIndexOutOfBoundsException
            int result = a / 0;  // This will throw ArithmeticException
            System.out.println("This will not be printed.");
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (Exception e) 
        {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }
        finally 
        {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
