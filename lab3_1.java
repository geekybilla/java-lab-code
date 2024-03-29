import java.util.Scanner;

class Box{
	public int height;
	public int width;
	public int length;
	Box(int a, int b, int c){
		length = a;
        width = b;
        height = c;
	}
	
	public int volume(){
		return (length*width*height);
	}
}
class lab3_1{
	public static void main(String args[]){
		int x, y, z;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER LENGTH");
		x= s.nextInt();
		System.out.println("ENTER WIDTH");
		y= s.nextInt();
		System.out.println("ENTER HEIGHT");
		z= s.nextInt();
		Box obj1=new Box(x, y, z);
		int vol= obj1.volume();
		System.out.println("The volume is: " + vol);
	}
}