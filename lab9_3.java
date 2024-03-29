class newthread implements Runnable
{
	Thread t;
	String name;
	newthread(String s)
	{
		name=s;
		t=new Thread(this,name);
		System.out.println(t);
	}
	public void run()
	{
		try
		{
			for(int i=100;i>89;i--)
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

class lab9_3
{
	public static void main(String args[])
	{
		newthread nt1=new newthread("My thread1");
		newthread nt2=new newthread("My thread2");
		newthread nt3=new newthread("My thread3");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
	}
}