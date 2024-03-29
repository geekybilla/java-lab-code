import java.util.Scanner;

class Plate{
	Scanner sc = new Scanner(System.in);
	int length;
	int width;
		Plate(){
			System.out.println("Enter the length:");
			length = sc.nextInt();
			System.out.println("Enter the width:");
			width = sc.nextInt();
			System.out.println("Plate length-" + length + ",Width - " + width);
		}
}
class Box extends Plate {
    int height;

    Box() {
        super(); 
        System.out.println("Enter the height: ");
        height = sc.nextInt();
        System.out.println("Box: Height - " + height);
    }
}

class WoodBox extends Box {
    int thickness;

    WoodBox() {
        super(); 
        System.out.println("Enter the thickness:");
        thickness = sc.nextInt();
        System.out.println("WoodBox: Thickness - " + thickness);
    }
}

class lab4_2 {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(); 
    }
}