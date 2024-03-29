import java.util.Scanner
class ques2{
	public static void main(String args[]){
		int marks;
		System.out.println("ENTER MARKS SECURED:");
		Scanner s= new Scanner(System.in);
		marks=s.nextInt();
		if(marks>=90){
			System.out.println("O Grade");
		}
		else if(marks<90 && marks >=80)
		{
			System.out.println("E Grade");
		}
				else if(marks<80 && marks >=70)
		{
			System.out.println("A Grade");
		}
				else if(marks<70 && marks >=60)
		{
			System.out.println("B Grade");
		}
				else if(marks<60 && marks >=50)
		{
			System.out.println("C Grade");
		}
	}
}