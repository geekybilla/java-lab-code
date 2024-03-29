import java.util.Scanner;
class area{
	void calculate(double a){
		double radius = a;
		double Area = 3.14*radius*radius;
		System.out.println("Area of circle: " + Area);
		
	}
	void calculate(double x, double y){
		double base = x;
		double height = y;
		double Area = 0.5*base*height;
		System.out.println("Area of triangle: " + Area);
		
	}
	void calculate(int p){
		int side = p;
		int Area = side*side;
		System.out.println("Area of square: " + Area);
	}
}
class lab3_5{
	public static void main(String [] args){
		double Area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for circle,2 for traiangle,3 for square");
		int choice= sc.nextInt();
		area obj1 = new area();
		
		switch(choice)
		{   case 1:
			System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
				obj1.calculate(radius);
                break;
				
            case 2:
                System.out.print("Enter base of triangle: ");
                double base = sc .nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
				obj1.calculate(base,height);
                break;
				
            case 3:
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();
				obj1.calculate(side);
                
                break;
				
            default:
                System.out.println("Invalid choice");
		}
	}
}