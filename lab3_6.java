import java.util.Scanner;

class Rectangle{
	int length;
	int breadth;
	Rectangle(){
		length=0;
		breadth=0;
	}
	Rectangle(int x,int y){
		this.length=x;
		this.breadth=y;
	}
	void calculate(){
		int p;
		p = length*breadth;
		System.out.println("The area of rectangle is :" + p);
		
	}
}

	class lab3_6{
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			Rectangle rect1= new Rectangle();
			rect1.calculate();
			System.out.print("Enter length and breadth of rectangle: ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
			Rectangle rect2 = new Rectangle(length, breadth);
			rect2.calculate();
		}
	}