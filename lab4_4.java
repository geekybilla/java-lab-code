import java.util.Scanner;

class Account
{
    int acc_no;
    double balance;
	Account(int a,double b)
	{
		acc_no=a;
		balance=b;
	}
    public void input()
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }
    public void disp()
	{
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account
{
    String name;
    long aadhar_no;
	Person(int a, double b, long ad, String n)
	{
		super(a,b);
		name=n;
		aadhar_no=ad;
	}
	@Override
	public void input()
	{
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLong();
    }
	@Override
    public void disp()
	{
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

class lab4_4
{
    public static void main(String[] args)
	{
        Person ob[] = new Person[3];
        for(int i = 0; i < 3; i++) 
		{
            ob[i] = new Person(0, 0.0, 0, "");
            ob[i].input();
        }
        System.out.println("\nPerson Details:");
        for(Person x : ob)
            x.disp();
	}
}
