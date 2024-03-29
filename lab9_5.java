class thrd extends Thread
{
    String name;
    int l; int u;
    thrd(String s, int lower, int upper)
	{
        name=s;
        l=lower;
		u=upper;
    }
    public void run()
	{
        System.out.println("Thread:" + name);
		System.out.print("Counter - ");
        for(int i=l;i<=u;i++)
		{
            System.out.print(i+ " ");
            try
			{
                Thread.sleep(5);
            }
			catch(InterruptedException e)
			{
                System.out.println(e);
            }
        }
    }
}

class lab9_5
{
    public static void main(String[] args)
	{
        String threadName="First";
        int lRange=10;
        int uRange=15;

        thrd t=new thrd(threadName,lRange,uRange);
        t.start();
    }
}