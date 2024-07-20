
import java.util.Scanner;
public class GeometryCalculater {
	public static double calculateArea(double length, double width) {
		return length*width;
	}
	public static double calculateArea(double radious) {
		return Math.PI*radious*radious;
	}
	public static double volume(double boxlength, double boxwidth, double boxheight) {
		return boxlength*boxwidth*boxheight;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("geometry calculater");
			System.out.println("1.Area of a rectangle");
			System.out.println("2.area of a circle");
			System.out.println("3.area of a box");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the length of the rectangle");
				double length = sc.nextDouble();
				System.out.println("Enter the width of the rectangle");
				double width = sc.nextDouble();
				double rectangleArea = GeometryCalculater.calculateArea(length, width);
				System.out.println("the area of rectangle is : "+rectangleArea);
				break;
			case 2:
				System.out.println("Enter the radious of the circle");
				double radious = sc.nextDouble();
				double circleArea = GeometryCalculater.calculateArea(radious);
				System.out.println("the area of rectangle is : "+circleArea);
				break;
			case 3:
				System.out.println("Enter the length of the box");
				double boxlength = sc.nextDouble();
				System.out.println("Enter the width of the box");
				double boxwidth = sc.nextDouble();
				System.out.println("Enter the height of the box");
				double boxheight = sc.nextDouble();
				double volume = GeometryCalculater.volume(boxlength,boxwidth,boxheight);
				System.out.println("the area of rectangle is : "+volume);
				break;
			case 4:
				System.out.println("Exit the calculator");
				break;
			default :
				System.out.println("Invalid choice! please select a valid option");
				break;
			}
			System.out.println();
				
		}while(choice!=4);
		sc.close();
	}
}
