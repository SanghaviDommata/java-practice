public class TypeCasting {

	public static void main(String[] args) {
		int myInt=4;
		double myDouble=myInt;
		System.out.println("implicit typecasting (int to double):");
		System.out.println("int value: "+myInt);
		System.out.println("double value: "+myDouble);
		
		double anDouble=8.95;
		int anInt=(int)anDouble;
		System.out.println("Explicit typecasting (double to int):");
		System.out.println("Double value: "+anDouble);
		System.out.println("Int value: "+anInt);
	}

}