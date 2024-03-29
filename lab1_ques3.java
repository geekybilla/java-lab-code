import java.util.Scanner;

class ques3{
public static void main(String args[]){
	System.out.println("ENTER ANY DATE OF JANUARY 2024:");
	int date;
	Scanner s= new Scanner(System.in);
	date=s.nextInt();
	int dayno= date%7;
	switch(dayno){
		
	case(1):
		System.out.println("The day on " + date + ",January 2024 is Monday");break;
	case(2):
		System.out.println("The day on " + date + ",January 2024 is Tuesday");break;
	case(3):
		System.out.println("The day on " + date + ",January 2024 is Wednesday");break;
	case(4):
		System.out.println("The day on " + date + ",January 2024 is Thursday");break;
	case(5):
		System.out.println("The day on " + date + ",January 2024 is Friday");break;
	case(6):
		System.out.println("The day on " + date + ",January 2024 is Saturday");break;
	case(0):
		System.out.println("The day on " + date + ",January 2024 is Sunday");break;
	default:System.out.println("ERROR"); 
	break;
	}
}
}
