class Apple {
    void show() {
        System.out.println("This is an Apple.");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is a Banana.");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is a Cherry.");
    }
}

public class lab4_3 {
    public static void main(String[] args) {
	Apple a = new Apple();
	Banana b = new Banana();
	Cherry c = new Cherry();
	
	Apple ref;
	
	ref=a;
	a.show();
	
	ref=b;
	b.show();
	
	ref=c;
	c.show();
	
    }
}