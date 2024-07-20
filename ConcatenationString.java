import java.util.Scanner;
public class ConcatenationString {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the first string:");
	        String firstString = scanner.nextLine();
	        
	        System.out.println("Enter the second string:");
	        String secondString = scanner.nextLine();
	        
	        String concatenatedString = concatenateStrings(firstString, secondString);
	        
	        System.out.println("The concatenated string is:");
	        System.out.println(concatenatedString);
	        
	        scanner.close();
	    }
	    
	    public static String concatenateStrings(String str1, String str2) {
	        StringBuilder builder = new StringBuilder();
	        builder.append(str1);
	        builder.append(str2);
	        return builder.toString();


	}

}