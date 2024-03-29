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
			for(int i=10;i>0;i--)
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

class lab9_1
{
	public static void main(String args[])
	{
		newthread nt=new newthread("My thread");
		nt.t.start();
		try
		{
			for(int i=10;i>0;i--)
			{
				System.out.println("Main" + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}