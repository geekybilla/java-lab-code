import java.util.Scanner;

class test1{
	public static void main(String args[]){
		int arr[]= new int[10];
		int sum=0;
		System.out.println("Enter 10 Numbers in the array");
		Scanner s=new Scanner(System.in);
		for(int a=0; a<=9;a++){
		arr[a]=	s.nextInt();
		if(arr[a]%2==1){
			sum=sum+ arr[a];
		}
		else{}
		}
		System.out.println("THE SUM OF ALL ODD INSERTED VALUES IS " + sum);
	}
}