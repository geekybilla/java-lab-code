import java.util.Scanner;
class lab2_2
{
	public static void main(String arr[])
	{
		Scanner sc = new Scanner(System.in);
		int even = 0,odd = 0;
		
		System.out.println("Enter 10 numbers:");

       for (int i = 0; i < 10; i++) {
           int number = sc.nextInt();

           if (number % 2 == 0) {
               even++;
           } else {
               odd++;
           }
       }
	   System.out.println("Number of even numbers: " + even);
       System.out.println("Number of odd numbers: " + odd);
   }
}