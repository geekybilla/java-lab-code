import java.util.Scanner;

class ques5{
	public static void main(String args[]){
		System.out.println("Enter first name: ");
		Scanner s= new Scanner(System.in);
		String firstn = s.nextLine(); 
		System.out.println("Enter second name: ");
		Scanner nigg = new Scanner(System.in);
		String secondn = nigg.nextLine();
		System.out.println(secondn + " " + firstn);
	}
}