package mypack1;


public class throwthrows {

	public static int meth2(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}
	public static void meth1()
	{
		int r= meth2 (20,2);
		System.out.println("The result is:"+r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meth1();
	}

}
