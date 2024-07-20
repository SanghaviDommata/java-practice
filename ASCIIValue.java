import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);

        int asciiValue = (int) charInput;
        System.out.println("The ASCII value of '" + charInput + "' is " + asciiValue + ".");

        scanner.close();
    }
}