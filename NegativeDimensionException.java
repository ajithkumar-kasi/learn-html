package mypack1;
class abi{
	public int  meth1(int a,int b)throws ArithmeticException
	{
		if(a<0||b<0) {
			throw new ArithmeticException("e");
		}

		int c=a*b;
		return c;
	}
	public void meth2()
	{
		int v=meth1(10,4);
		System.out.println(v);
	}
	
}
                          

public class NegativeDimensionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abi a=new abi();
		a.meth2();
		a.toString();
	}

}
                              


       