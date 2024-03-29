class lab10_1
{
	static void MergeSort(int a[],int l,int u)
	{
		if(l<u)
		{
			int mid=(l+u)/2;
			Thread t1=new Thread(()->MergeSort(a,l,mid));
			Thread t2=new Thread(()->MergeSort(a,mid+1,u));
			t1.start();
			t2.start();
			try
			{
				t1.join();
				t2.join();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			merge(a,l,mid,u);
		}
	}
	
	static void merge(int a[],int beg,int mid,int end)    
	{    
		int i,j,k;  
		int n1=mid-beg+1;    
		int n2=end-mid;    
		int Left[]=new int[n1];
		int Right[]=new int[n2];  
		for(int p=0;p<n1;p++)    
			Left[p]=a[beg+p];    
		for(int q=0;q<n2;q++)    
			Right[q]=a[mid+1+q];    
		i = 0;j = 0;k = beg;
		while(i<n1 && j<n2)    
		{    
			if(Left[i]<=Right[j])    
			{    
				a[k]=Left[i];    
				i++;    
			}    
			else    
			{    
				a[k]=Right[j];    
				j++;    
			}    
			k++;    
		}    
		while(i<n1)    
		{    
			a[k]=Left[i];    
			i++;    
			k++;    
		}     
		while(j<n2)    
		{    
			a[k]=Right[j];    
			j++;    
			k++;    
		}
	}
	
	static void printArray(int a[],int n)  
	{  
		for(int i=0;i<n;i++)  
			System.out.println(a[i]);  
	}  

	public static void main(String args[])  
	{  
		int a[]={12,31,25,8,32,17,40,42};  
		int n=a.length;
		System.out.println("Original Array:");  
		printArray(a,n);  
		MergeSort(a,0,n-1);  
		System.out.println("After sorting:");  
		printArray(a,n);  
	}
}