class diff{
	void sub(){
		System.out.println("No data entered for substraction");
	}
	void sub(int a,int b){
		int ans=a-b;
		System.out.println("The result for the entered value is :" + ans);
	}
	void sub(double x,double y){
		double ans=x-y;
		System.out.println("The result for the entered value is :" + ans);
	}
}
class lab3_4{
	public static void main(String[] args){
		 diff obj1 = new diff();
		 obj1.sub();
		 obj1.sub(10,12);
		 obj1.sub(12.5,11.2);
	}
}