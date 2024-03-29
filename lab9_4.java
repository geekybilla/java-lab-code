class nt1 extends Thread
{
	String name;
	nt1(String s)
	{
		super(s);
		name=s;
	}
	public void run()
	{
		try
		{
			for(int i=2;i<=50;i=i+2)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class nt2 extends Thread
{
	String name;
	nt2(String s)
	{
		super(s);
		name=s;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=49;i=i+2)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class lab9_4
{
	public static void main(String args[])
	{
		nt1 t1=new nt1("My thread1");
		nt2 t2=new nt2("My thread2");
		t1.start();
		//t1.join();
		t2.start();
	}
}