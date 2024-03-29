import java.util.Scanner;

class details{

	public int roll;
	public String name;
	public double cgpa;
	
	details(int a, String b, double c){
		roll=a;
		name= b;
		cgpa=c;
	}
}

class lab3_3{
	public static void main(String args[]){
		System.out.println("Enter the number of students: ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		
		details[] student= new details[number];
		
		for (int i; i<number; i++){
		System.out.println("Roll number of Student"+ i + ": ");
		int roll=s.nextInt();
		System.out.println("Name of Student"+ i + ": ");
		String name=s.nextLine();
		System.out.println("CGPA of Student"+ i + ": ");
		double cgpa=s.nextDouble();
		student[i]=new details(obj1.roll, obj1.name, obj1.cgpa)
		}]
		int min=0;
		for(int n=1; n<number; n++){
			if(student[min].cgpa>student[n].cgpa){
				student[min]=student[n];
			}
		}
		System.out.println("The Student with lowest CGPA is: " + student[min].name);
		
	}
}