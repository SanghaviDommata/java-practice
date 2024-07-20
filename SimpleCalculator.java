
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char operator;
		double num1,num2,result;
		System.out.println("SimpleCalculator");
		System.out.println("------------------");
		while(true) {
			System.out.println("Enter first number");
			num1=sc.nextDouble();
			System.out.println("Enter second number");
			num2=sc.nextDouble();
			System.out.println("choose operator +,-,*,/");
			operator=sc.next().charAt(0); 
			switch(operator) {
			case '+':
				result=num1+num2;
				System.out.println("result:"+num1+"+"+num2+"="+result);
				break;
			case '-':
				result=num1-num2;
				System.out.println("result:"+num1+"-"+num2+"="+result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("result:"+num1+"*"+num2+"="+result);
				break;
			case '/':
				if(num2==0) {
					System.out.println("ERROR: division by zero is not allowed");
				}else {
					result=num1/num2;
					System.out.println("result:"+num1+"/"+num2+"="+result);
					break;
					
				}
			default:
				System.out.println("invalid operator choice. Please try again!");
				break;
			}
			System.out.println("----------------");
			System.out.println("Do you want to continue?(Y/N)");
			char choice=sc.next().charAt(0);
			if(choice!='Y'&&choice=='N') {
				break;
			}
		}
		sc.close();
	}
}
