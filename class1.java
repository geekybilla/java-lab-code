//printing hello world
class hello{
	public static void main(String args[]){
		System.out.println("Hello World");
	}
}
//arithmatic operations
class arithmatic{
	public static void main(String args[]){
		int x=2;
		int y=3;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
}

//converting from Farenheit to Celcius
class temperature{
	public static void main(String args[]){
		float f=90;
		float c=((f-32)*5)/9;
		System.out.println("Value in Celcius:" + c);
	}
}

//Unit conversion
class unit_conversion{
	public static void main(String args[]){
		double km=1.5;
		double m=km*1000;
		double cm=m*100;
		System.out.println("Value of"+ km + "Kilomters in Meters:"+ m);
		System.out.println("Value of"+ km + "Kilomters in Centimeters:"+ cm);
	}
}

//reversing a 4 digit number without using loop
class reverse{
	public static void main(String args[]){
	int number=1234;
	int first=(number%10);
	int second=(number/10)%10;
	int third=(number/100)%10;
	int fourth=(number/1000)%10;
	System.out.println(first + "" + second + "" + third + "" + fourth);
	}
}

	