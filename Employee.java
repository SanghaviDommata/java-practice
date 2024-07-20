import java.util.Scanner;
public class Employee {
	static int eId;
	static String eName;
	static String companyName;
	
	public static void displayDetails() {
		System.out.println("Employee id: "+eId);
		System.out.println("Employee name: "+eName);
		System.out.println("Company name: "+companyName);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: ");
		eId=sc.nextInt();
		System.out.println("Enter name: ");
		eName=sc.next();
		System.out.println("Enter company name: ");
		companyName=sc.next();
		displayDetails();
		

	}

}