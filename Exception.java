import java.util.Scanner;
class Exception{
	public static void main(String[] args){
		try{
		int d;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of integer d");
		d= s.nextInt();
		int a= 450/d;
		System.out.println("The value is" + a);
		}catch(ArithmeticException e){
			System.out.println("Exception"+ e);
		}
	}
	}