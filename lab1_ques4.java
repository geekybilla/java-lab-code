import java.util.Scanner;

class ques4{
	public static void main(String args[]){

	int x,number,reverse,a;
	System.out.println("ENTER A NUMBER TO CHECK IF PALINDROME OR NOT:");
	Scanner s=new Scanner(System.in);
	number=s.nextInt();
	a=number;
	reverse=0;
	x=1;
	while(a>0){
		x=a%10;
		reverse=(reverse*10) + x;
		a=a/10;
	}
	if(number==reverse)
	{
	System.out.println("The entered number is a Palindrome number");
	}
	else{
		System.out.println("Not a Palindrome number");
	}
}
}