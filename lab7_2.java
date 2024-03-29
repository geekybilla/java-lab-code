//2. Aim of the program- Write a Java program to handle an ArithmeticException using try,
//catch, and finally block.
//Input: Operand values for division operation mentioned in the program
import java.util.Scanner;
class lab7_2{
	public static void main(String [] args){
		try{
		int numerator = 10;
		int denominator = 0;
		int a = numerator/denominator;
		System.out.println("The value of a is : " + a);
	}catch(ArithmeticException e){
			System.out.println("Exception" + e);
		}
		finally{
			System.out.println("This is the block without any exception");
		}
	}
}
