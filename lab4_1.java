import java.util.*;
class sheet{
	int cost=40;
	void calc(int x){
		System.out.println("Cost of 2d plastic sheet for "+x +" is Rs" + (x*40));
	}
}
class box extends sheet{
	int costbox = 60;
	void calcb(int x){
		System.out.println("Cost of 3d plasticbox for "+x +" cubic ft in Rs"+(x*60));
	}
}
class lab4_1{
	public static void main(String [] args){
		box b = new box();
		b.calc(40);
		b.calcb(90);
	}
}