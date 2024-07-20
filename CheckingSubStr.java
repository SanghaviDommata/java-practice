public class CheckingSubStr {

	public static void main(String[] args) {
		String mainStr = "Java Programming";
		String subStr =  "Programming";
		
		boolean containssubStr = mainStr.contains(subStr);
		if(containssubStr) {
			System.out.println("The Main String "+mainStr+" contains sub String "+subStr);
		}
		else {
			System.out.println("The Main String "+mainStr+" does not contains sub String "+subStr);
		}

	}

}
