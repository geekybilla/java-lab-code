class newthread extends Thread
{
	String name;
	newthread(String s)
	{
		super(s);
		name=s;
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

class lab9_2
{
	public static void main(String args[])
	{
		newthread t=new newthread("My thread");
		t.start();
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