import java.util.Scanner;
class lab2_1
{
	public static void main(String arr[])
	{	int largest=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
		
        if (num2 >= num1 && num2 >= num3) {
			largest=num2;
        }
        else if (num3 >= num1 && num3 >= num2) {
			largest=num3;
        }
		else if (num1 >= num2 && num1 >= num3){
			largest=num1;
			}
		System.out.println("The largest number is:" + largest);
	}
}
