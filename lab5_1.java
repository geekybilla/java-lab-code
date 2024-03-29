import java.util.*;
abstract class student
{
	int roll_no, reg_no;
	abstract void getinput();
	abstract void course();
}

class kiitian extends student
{
	String c;
	Scanner sc=new Scanner(System.in);
	public void getinput()
	{
		System.out.println("Enter Roll No.");
		roll_no=sc.nextInt();
		System.out.println("Enter Registration No.");
		reg_no=sc.nextInt();
	}
	public void course()
	{
		System.out.println("Enter course");
		c=sc.nextLine();
	}
	public void show()
	{
		System.out.println("Roll Number: "+roll_no);
		System.out.println("Registration Number: "+reg_no);
		System.out.println("Course: "+c);
	}
}

class lab5_1
{
	public static void main(String args[])
	{
		kiitian ob=new kiitian();
		ob.course();
		ob.getinput();
		ob.show();
	}
}