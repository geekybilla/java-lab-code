public class MyClass {
  static int count = 0;
    count= count +1;
  public void displayCount() {
    System.out.println("Number of objects created: " + count);
  }
}

public class lab2_4{
  public static void main(String[] args) {

    MyClass = new MyClass();
    MyClass = new MyClass();
    MyClass = new MyClass();

    MyClass.displayCount();
  }
}