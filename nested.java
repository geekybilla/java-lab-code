class nested{
	public static void main(String[] args){
		try{
			int a=args.length;
			int d=50/a;
			try{
				if(a==1){
					a=a/(a-a);//possiblility of generating error
				}
				if(a==2){
					int x[]={1};
					x[5]=10;//possiblility of generating error
				}
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e);
				}
			}catch(ArithmeticException e){
				System.out.println(e);
			}
		}
	}
