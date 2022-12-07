package mypack1;


public class throwthrows {

	public static int meth2(int a,int b)throws Exception
	{
		if (a<=0||b<=0)
			throw new Exception ("Dividing by zerooooooo");
		int c=a/b;
		return c;
	}
	public static void meth1()
	{
		try {
			int r= meth2 (-20,2);
			System.out.println("The result is:"+r);
		}
		catch(Exception e){
			System.out.println("Dividin by zero");
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meth1();
	}

}
