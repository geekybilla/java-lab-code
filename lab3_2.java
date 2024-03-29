import java.util.Scanner;

class Rectangle{
	public int length;
	public int breadth;
	Rectangle(int le, int br){
		this.length=le;
		this.breadth=br ;
	}
	public int area(){
		return(length*breadth);
	}
	public int perimeter(){
		return(2*(length+breadth));
		
	}
}
class lab3_2{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER LENGTH");
	int len=s.nextInt();
	System.out.println("ENTER BREADTH");
	int bre=s.nextInt();
	Rectangle obj1=new Rectangle(len,bre);
	int area=obj1.area();
	int perimeter=obj1.perimeter();
	System.out.println("Area= " + area);
	System.out.println("Perimeter= " + perimeter);
	}
}
